package com.davangsolutions.myfirstapp;

import java.net.URL;

/**
 * Created by ntkho_000 on 2/12/2015.
 */
public class FeedItem
{
    private final String title;
    private final String link;
    private final String description;
    private final String thumbnailUrlText;

    public FeedItem(String title, String link, String description, String thumbnailUrlText) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.thumbnailUrlText = thumbnailUrlText;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() { return description; }

    public String getThumbnailUrlText() { return thumbnailUrlText; }

}
