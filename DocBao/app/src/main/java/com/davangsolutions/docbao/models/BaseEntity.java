package com.davangsolutions.docbao.models;

/**
 * Created by Khoi on 3/31/2015.
 */
public abstract class BaseEntity<TId> {
    private TId Id;

    public TId getId() {
        return Id;
    }

    public void setId(TId id) {
        Id = id;
    }
}
