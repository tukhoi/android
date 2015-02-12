package com.davangsolutions.myfirstapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by ntkho_000 on 2/12/2015.
 */
public class RssAdapter extends BaseAdapter
{
    private final List<FeedItem> items;
    private final Context context;

    public RssAdapter(Context context, List<FeedItem> items) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //ViewHolder holder;
        FeedItem item = items.get(position);

        if (convertView == null) {
            convertView = View.inflate(context, R.layout.rss_item, null);

            TextView itemTitleTextView = (TextView) convertView.findViewById(R.id.itemTitle);
            itemTitleTextView.setText(item.getTitle());

            TextView itemDescriptionTextView = (TextView) convertView.findViewById(R.id.itemDescription);
            itemDescriptionTextView.setText(item.getDescription());

            //ImageView itemThumbnailImageView = (ImageView) convertView.findViewById(R.id.itemThumbnail);
            //itemThumbnailImageView.setImageBitmap(getBitmapFromURL(item.getThumbnailUrlText()));
        }
        return convertView;
    }

    public static Bitmap getBitmapFromURL(String src) {
        try {
            Log.e("src", src);
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            Log.e("Bitmap","returned");
            return myBitmap;
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("Exception",e.getMessage());
            return null;
        }
    }

//    static class ViewHolder {
//        TextView itemTitle;
//    }
}
