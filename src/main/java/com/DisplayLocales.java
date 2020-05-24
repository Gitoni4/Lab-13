package com;

import java.text.DateFormat;
import java.util.Locale;

public class DisplayLocales
{
    public static void showAll()
    {
        Locale localeList[] = DateFormat.getAvailableLocales();

        for (Locale aLocale : localeList)
        {
            System.out.println(aLocale.getDisplayName());
        }
    }

    public static Locale[] getAll()
    {
        Locale localeList[] = DateFormat.getAvailableLocales();

        return localeList;
    }
}
