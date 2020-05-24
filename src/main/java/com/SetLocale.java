package com;

import java.util.Locale;

public class SetLocale
{
    private Locale currentLocale;

    public SetLocale(String language, String country)
    {
        currentLocale = new Locale(language, country);
        Locale.setDefault(currentLocale);
    }

    public Locale getCurrentLocale()
    {
        return currentLocale;
    }
}
