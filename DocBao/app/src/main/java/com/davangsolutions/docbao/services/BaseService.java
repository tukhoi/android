package com.davangsolutions.docbao.services;

import com.davangsolutions.docbao.models.Publisher;
import com.davangsolutions.docbao.models.Result;
import com.davangsolutions.docbao.parsers.IParser;
import com.davangsolutions.docbao.parsers.ParseEngine;
import com.davangsolutions.docbao.models.Error;

import java.util.Dictionary;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Khoi on 3/31/2015.
 */
public abstract class BaseService {
    private IParser _parser;
    protected Map<UUID, Publisher> _publisherList;

    protected BaseService() {
        _parser = new ParseEngine();
    }

    protected void initializeData()
    {
        _publisherList = DataBank.getPublishers();
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
