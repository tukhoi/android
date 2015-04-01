package com.davangsolutions.docbao.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Khoi on 3/31/2015.
 */
public class Feed extends BaseEntity<UUID> {
    private String _name;
    private Publisher _publisher;
    private Category _category;
    private String _title;
    private String _description;
    private Date _lastUpdatedTime;
    private String _link;
    private boolean _isExcluded;
    private List<Item> _items;

    public Feed()
    {
        _items = new ArrayList<Item>();
    }

    public Feed(UUID id, Publisher publisher, String name, String link) {
        this();
        this.setId(id);
        this._publisher = publisher;
        this._name = name;
        this._link = link;
    }

    public void addItem(Item item)
    {
        item.set_feedId(this.getId());
        _items.add(0, item);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Publisher get_publisher() {
        return _publisher;
    }

    public void set_publisher(Publisher _publisher) {
        this._publisher = _publisher;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public Date get_lastUpdatedTime() {
        return _lastUpdatedTime;
    }

    public void set_lastUpdatedTime(Date _lastUpdatedTime) {
        this._lastUpdatedTime = _lastUpdatedTime;
    }

    public String get_link() {
        return _link;
    }

    public void set_link(String _link) {
        this._link = _link;
    }

    public boolean is_isExcluded() {
        return _isExcluded;
    }

    public void set_isExcluded(boolean _isExcluded) {
        this._isExcluded = _isExcluded;
    }
}
