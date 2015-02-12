package com.davangsolutions.myfirstapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ntkho_000 on 2/12/2015.
 */
public class Feed
{
    String title = "";
    String link = "";
    String description = "";
    String language = "";
    String copyright = "";
    String pubDate = "";

    final List<FeedItem> entries = new ArrayList<FeedItem>();

    public Feed()
    {}

    public Feed(String title, String link, String description, String language, String copyright, String pubDate)
    {
        this.title = title;
        this.link = link;
        this.description = description;
        this.language = language;
        this.copyright = copyright;
        this.pubDate = pubDate;
    }

    public List<FeedItem> GetItems()
    {
        return entries;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getPubDate() {
        return pubDate;
    }

    @Override
    public String toString() {
        return "com.davangsolutions.myfirstapp.Feed [copyright=" + copyright + ", description=" + description
                + ", language=" + language + ", link=" + link + ", pubDate="
                + pubDate + ", title=" + title + "]";
    }

}
