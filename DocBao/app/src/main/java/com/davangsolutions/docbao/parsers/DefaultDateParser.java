package com.davangsolutions.docbao.parsers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Khoi on 3/31/2015.
 */
public class DefaultDateParser implements IDateParser {
    @Override
    public Date parseDate(String pubDateString)
    {
        try {
            //Tue, 31 Mar 2015 09:22:03 +0700
            SimpleDateFormat formatter = new SimpleDateFormat("ccc, d MMM yyyy HH:mm:ss zzzz");
            return formatter.parse(pubDateString);
        }
        catch (ParseException pe)
        {
            return null;
        }
    }
}
