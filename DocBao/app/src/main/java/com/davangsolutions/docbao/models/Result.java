package com.davangsolutions.docbao.models;

/**
 * Created by Khoi on 3/31/2015.
 */
public class Result<T> {
    private T _target;
    private Error _error;

    public Result(T target, Error error)
    {
        _target = target;
        _error = error;
    }

    public boolean hasError()
    {
        return _error != null;
    }

    public T get_target()
    {
        return _target;
    }

    public Error get_error()
    {
        return _error;
    }

    public String getErrorString() { return _error.toString(); }
}
