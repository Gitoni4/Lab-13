package app;

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import com.*;


public class LocaleExplore
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your language");
        String language = scanner.nextLine();

        System.out.println("Type your country");
        String country = scanner.nextLine();

        Locale currentLocale = new SetLocale(language, country).getCurrentLocale();

        Info currentLocaleInfo = new Info(currentLocale);

        ResourceBundle bundle = ResourceBundle.getBundle("Messages");

        System.out.println(bundle.getString("prompt"));
        String command = scanner.nextLine();

        while (!command.equals("exit"))
        {
            if (command.equals("Show available locales"))
            {
                System.out.println(bundle.getString("locales"));
                DisplayLocales.showAll();
            }
            else if (command.equals("Show current locale"))
            {
                System.out.println(bundle.getString("locale.set"));
                System.out.println(currentLocale.getDisplayName());
            }
            else if (command.equals("Show info"))
            {
                System.out.println(bundle.getString("info"));
                System.out.println(currentLocaleInfo.getCountry());
                System.out.println(currentLocaleInfo.getLanguage());
                System.out.println(currentLocaleInfo.getClass());
                System.out.println(Arrays.toString(currentLocaleInfo.getWeekDays()));
                System.out.println(Arrays.toString(currentLocaleInfo.getMonths()));
            }
            else
            {
                System.out.println(bundle.getString("invalid"));
            }

            System.out.println(bundle.getString("prompt"));
            command = scanner.nextLine();
        }
    }
}
