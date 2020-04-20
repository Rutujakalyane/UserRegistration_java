package com.bl.demo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    public String namePattern = "^[A-Z][a-z]{2,}$";
    public String emailIdPattern = "^[a-zA-Z0-9]+([.+,-,_]?[a-zA-Z0-9]+)?[@][a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
    public String mobileNumberPattern="^[0-9]{2}[ ][0-9]{10}$";
    public String passwordPattern="^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,})";

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
    public boolean checkMobileNumber(String mobileNumber)
    {
        boolean result = mobileNumber.matches(mobileNumberPattern);
        return result;
    }
    public boolean checkPassword(String password)
    {
        boolean result = password.matches(passwordPattern);
        return result;
    }
}




