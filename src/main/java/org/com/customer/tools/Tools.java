package org.com.customer.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Tools
{
    private static final String regex = "^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    private static final Pattern pattern = Pattern.compile(regex);

    public static boolean validateEmail(String emailValue)
    {
        Matcher matcher = pattern.matcher(emailValue);
        return matcher.matches();
    }
}
