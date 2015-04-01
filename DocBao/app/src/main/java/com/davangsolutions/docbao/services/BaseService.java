package com.davangsolutions.docbao.services;

import com.davangsolutions.docbao.models.Category;
import com.davangsolutions.docbao.models.Feed;
import com.davangsolutions.docbao.models.Publisher;
import com.davangsolutions.docbao.models.Result;
import com.davangsolutions.docbao.parsers.IParser;
import com.davangsolutions.docbao.parsers.ParseEngine;
import com.davangsolutions.docbao.models.Error;

import java.util.Map;
import java.util.UUID;

/**
 * Created by Khoi on 3/31/2015.
 */
public abstract class BaseService {
    private IParser _parser;
    protected Map<UUID, Publisher> _publisherMap;
    protected Map<UUID, Category> _categoryMap;
    protected Map<UUID, Feed> _feedMap;

    protected BaseService() {
        _parser = new ParseEngine();
    }

    protected void initializeData()
    {
        _publisherMap = DataBank.getPublishers();
        _categoryMap = DataBank.createCategories()
    }

    protected<T> Result Result(T target)
    {
        return new Result(target, null);
    }

    protected<T> Result Result(Error error)
    {
        return new Result(null, error);
    }
}
