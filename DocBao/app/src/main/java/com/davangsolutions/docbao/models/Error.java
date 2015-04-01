package com.davangsolutions.docbao.models;

import java.util.List;

/**
 * Created by Khoi on 3/31/2015.
 */
public class Error {
    private String _message;
    private List<String> _details;

    public Error(DefinedError definedError)
    {
        this(definedError.toString(), null);
    }

    public Error(String message, List<String> details)
    {
        _message = message;
        _details = details;
    }

    public String get_message()
    {return _message;}

    public List<String> get_details()
    {return _details;}

    @Override
    public String toString()
    {
        StringBuilder error = new StringBuilder();
        error.append(_message + ":");
        error.append("\n");
        for (int i = 0; i < _details.size(); i++) {
            error.append("\t - " + _details.get(i) + "\n");
        }

        return error.toString();
    }
}
