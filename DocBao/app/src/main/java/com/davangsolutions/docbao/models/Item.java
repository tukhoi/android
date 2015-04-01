package com.davangsolutions.docbao.models;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Khoi on 3/31/2015.
 */
public class Item extends BaseEntity<String> {
    private UUID _feedId;
    private Date _publishedDate;
    private String _title;
    private String _summary;
    private String _link;

    public Item(Date publishedDate, String title, String summary, String link) {
        this._publishedDate = publishedDate;
        this._title = title;
        this._summary = summary;
        this._link = link;
    }

    public String get_link() {
        return _link;
    }

    public void set_link(String _link) {
        this._link = _link;
    }

    public UUID get_feedId() {
        return _feedId;
    }

    public void set_feedId(UUID _feedId) {
        this._feedId = _feedId;
    }

    public Date get_publishedDate() {
        return _publishedDate;
    }

    public void set_publishedDate(Date _publishedDate) {
        this._publishedDate = _publishedDate;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_summary() {
        return _summary;
    }

    public void set_summary(String _summary) {
        this._summary = _summary;
    }
}
