package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest
{
    @Test
    public void registerFirstName_givenFirstName_shouldReturnTrue()
    {
        UserRegistration userregister=new UserRegistration();
        boolean result=userregister.registerFirstName("Ganesh");
        Assert.assertTrue(result);
    }

    @Test
    public void registerLastName_givenLastName_shouldReturnTrue()
    {
        UserRegistration userregister=new UserRegistration();
        boolean result=userregister.registerLastName("Ghodke");
        Assert.assertTrue(result);
    }
}
