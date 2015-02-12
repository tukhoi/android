package com.davangsolutions.myfirstapp;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.List;

/**
 * Created by ntkho_000 on 2/12/2015.
 */
public class RssService extends IntentService
{
    private static final String RSS_LINK = "http://feeds.feedburner.com/ElegantCode?format=xml";
    public static final String ITEMS = "items";
    public static final String RECEIVER = "receiver";

    public RssService() {
        super("RssService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        List<FeedItem> rssItems = null;
        try {
            RSSFeedParser parser = new RSSFeedParser();
            String feedUrl = intent.getStringExtra("FeedUrl");
            rssItems = parser.parse(getInputStream(feedUrl));
            if (rssItems != null && rssItems.size() > 0)
                rssItems.remove(0);
        } catch (XmlPullParserException e) {
            Log.w(e.getMessage(), e);
        } catch (IOException e) {
            Log.w(e.getMessage(), e);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(ITEMS, (Serializable) rssItems);
        ResultReceiver receiver = intent.getParcelableExtra(RECEIVER);
        receiver.send(0, bundle);
    }

    public InputStream getInputStream(String link) {
        try {
            URL url = new URL(link);
            return url.openConnection().getInputStream();
        } catch (IOException e) {
            return null;
        }
    }
}
