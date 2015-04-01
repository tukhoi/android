package com.davangsolutions.docbao.models;

import java.util.List;
import java.util.UUID;

/**
 * Created by Khoi on 3/31/2015.
 */
public class Category extends BaseEntity<UUID> {
    private String _categoryName;
    private List<Feed> _feeds;

    public Category(UUID id, String _categoryName, List<Feed> feeds) {
        this.setId(id);
        this._categoryName = _categoryName;
        this._feeds = feeds;
    }

    public String get_categoryName() {
        return _categoryName;
    }

    public void set_categoryName(String _categoryName) {
        this._categoryName = _categoryName;
    }
}
