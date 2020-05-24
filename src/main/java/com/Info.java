package com;

import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Info
{
    private Locale currentLocale;

    public Info(Locale newLocale)
    {
        this.currentLocale = newLocale;
    }

    public String getCountry()
    {
        return currentLocale.getCountry();
    }

    public String getLanguage()
    {
        return currentLocale.getLanguage();
    }

    public String getCurrency()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance(this.currentLocale);
        return currency.getCurrency().toString();
    }

    public String[] getWeekDays()
    {
        DateFormatSymbols dfs = new DateFormatSymbols(this.currentLocale);
        return dfs.getWeekdays();
    }

    public String[] getMonths()
    {
        DateFormatSymbols dfs = new DateFormatSymbols(this.currentLocale);
        return dfs.getMonths();
    }
}
