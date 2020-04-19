package com.bl.demo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    String namePattern = "^[A-Z][a-z]{2,}$";
    public String emailIdPattern = "^\\w+([_+.-]\\w+)?@\\w+.[a-zA-Z]{2,3}([.][a-zA-Z]{2})?$";

    public boolean checkFirstName(String firstName)
    {
        boolean result = firstName.matches(namePattern);
        return result;

    }
    public boolean checkLastName(String lastName)
    {
        boolean result = lastName.matches(namePattern);
        return result;
    }
    public boolean checkEmailId(String emailId)
    {
        boolean result = emailId.matches(emailIdPattern);
        return result;
    }
}




