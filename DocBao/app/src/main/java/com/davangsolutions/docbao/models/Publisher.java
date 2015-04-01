package com.davangsolutions.docbao.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Khoi on 3/31/2015.
 */
public class Publisher extends BaseEntity<UUID> {
    private String _name;
    private String _link;
    private List<Feed> _feeds;

    public Publisher()
    {
        _feeds = new ArrayList<Feed>();
    }

    public Publisher(UUID id, String name, String link)
    {
        this();
        this.setId(id);
        this._name = name;
        this._link = link;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_link() {
        return _link;
    }

    public void set_link(String _link) {
        this._link = _link;
    }
}
