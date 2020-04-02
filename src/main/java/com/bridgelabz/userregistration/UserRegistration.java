package com.bridgelabz.userregistration;

public class UserRegistration
{
    public static final String PATTERN_OF_FIRSTNAME="^[A-Z][a-z]{2,}$";
    public static final String PATTERN_OF_LASTNAME="^[A-Z][a-z]{2,}$";

    public boolean registerFirstName(String firstName)
    {
        return firstName.matches(PATTERN_OF_FIRSTNAME);
    }
    public boolean registerLastName(String lastName)
    {
        return lastName.matches(PATTERN_OF_LASTNAME);
    }
}
