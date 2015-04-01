package com.davangsolutions.docbao.services;

import com.davangsolutions.docbao.models.DefinedError;
import com.davangsolutions.docbao.models.Error;
import com.davangsolutions.docbao.models.Publisher;
import com.davangsolutions.docbao.models.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Khoi on 3/31/2015.
 */
public class PublisherService extends BaseService {

    public Result<List<Publisher>> getPublishers()
    {
        List<Publisher> publishers = new ArrayList(_publisherMap.values());
        if (publishers != null && publishers.size() > 0)
            return Result(publishers);
        else
            return Result(new Error(DefinedError.LoadPublishersFailed));
    }

    public Result<Publisher> getPublisher(UUID publisherId)
    {
        Publisher publisher = _publisherMap.get(publisherId);
        if (publisher != null)
            return Result(publisher);
        else
            return Result(new Error(DefinedError.PublisherIdNotFound));
    }
}
