package com.davangsolutions.docbao.parsers;

import android.util.Xml;

import com.davangsolutions.docbao.models.Item;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Khoi on 3/31/2015.
 */
public class ParseEngine implements IParser {
    private final String ns = null;

    public List<Item> parse(InputStream inputStream)
        throws IOException
    {
        return parse(inputStream, new DefaultDateParser());
    }

    public List<Item> parse(InputStream inputStream, IDateParser pubDateParser)
        throws IOException {
        try {
            XmlPullParser parser = Xml.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(inputStream, null);
            parser.nextTag();
            return readFeed(parser, pubDateParser);
        } catch (XmlPullParserException xpp)
        { return null; }
        catch (IOException ioe)
        { return null; }
        finally {
            inputStream.close();
        }
    }

    private List<Item> readFeed(XmlPullParser parser, IDateParser pubDateParser)
            throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, null, "rss");
        String title = null;
        String description = null;
        String link = null;
        String thumbnailUrlText = null;
        String uuid = null;
        Date pubDate = null;
        List<Item> items = new ArrayList<Item>();

        while (parser.next() != XmlPullParser.END_DOCUMENT) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            if (name.equals("title")) {
                title = readProperty(parser, "title");
            } else if (name.equals("description")) {
                description = readProperty(parser, "description");
            } else if (name.equals("link")) {
                link = readProperty(parser, "link");
            } else if (name.equals("media:thumbnail")) {
                thumbnailUrlText = readThumbnailUrl(parser);
            } else if (name.equals("guid")) {
                uuid = readProperty(parser, "guid");
            } else if (name.equals("pubDate")) {
                String pubDateString = readProperty(parser, "pubDate");
                pubDate = pubDateParser.parseDate(pubDateString);
            }

            if (title != null && link != null && description != null) {
                //Item item = new Item(title, link, description, thumbnailUrlText);
                Item item = new Item(pubDate, title, description, link);
                items.add(item);
                title = null;
                link = null;
                description = null;
                thumbnailUrlText = null;
            }
        }
        return items;
    }

    private String readProperty(XmlPullParser parser, String tagName)
            throws XmlPullParserException, IOException
    {
        return readProperty(parser, tagName, true);
    }

    private String readProperty(XmlPullParser parser, String tagName, boolean requireEndTag)
            throws XmlPullParserException, IOException
    {
        parser.require(XmlPullParser.START_TAG, ns, tagName);
        String data = readText(parser);
        if (requireEndTag)
            parser.require(XmlPullParser.END_TAG, ns, tagName);
        return data;
    }

    private String readThumbnailUrl(XmlPullParser parser)throws XmlPullParserException, IOException {
        String result = "";
        result = parser.getAttributeValue(ns, "url");
        return result;
    }

    // For the tags title and link, extract their text values.
    private String readText(XmlPullParser parser) throws IOException, XmlPullParserException {
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.getText();
            parser.nextTag();
        }
        return result;
    }
}
