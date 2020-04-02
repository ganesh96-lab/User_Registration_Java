package com.bridgelabz.userregistration;


public class UserRegistration
{
    public static final String PATTERN_OF_FIRSTNAME="^[A-Z][a-z]{2,}$";
    public static final String PATTERN_OF_LASTNAME="^[A-Z][a-z]{2,}$";
    public static final String PATTERN_OF_EMAIL="^[0-9a-zA-Z]+([_+-.][0-9a-zA-Z]+)*+" +
                                                "@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
    public boolean registerFirstName(String firstName)
    {
        return firstName.matches(PATTERN_OF_FIRSTNAME);
    }
    public boolean registerLastName(String lastName)
    {
        return lastName.matches(PATTERN_OF_LASTNAME);
    }
    public boolean registerEmail(String emailId)
    {
        return emailId.matches(PATTERN_OF_EMAIL);
    }
}
