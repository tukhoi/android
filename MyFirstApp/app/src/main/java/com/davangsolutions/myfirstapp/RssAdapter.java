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
    private Bitmap defaultBitmap;

    public RssAdapter(Context context, List<FeedItem> items) {
        this.items = items;
        this.context = context;
        defaultBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher);
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

            ImageView itemThumbnailImageView = (ImageView) convertView.findViewById(R.id.itemThumbnail);
            String url = item.getThumbnailUrlText();
            if (url == null)
                itemThumbnailImageView.setImageBitmap(defaultBitmap);
            else
                new DownloadImageTask(itemThumbnailImageView).execute(url);
        }
        return convertView;
    }
}
