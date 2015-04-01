package com.davangsolutions.docbao.parsers;

import com.davangsolutions.docbao.models.Item;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

/**
 * Created by Khoi on 3/31/2015.
 */
public interface IParser {
    public List<Item> parse(InputStream inputStream)
            throws XmlPullParserException, IOException, ParseException;
}
