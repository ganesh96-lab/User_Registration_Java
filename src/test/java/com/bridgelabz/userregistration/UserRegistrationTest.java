package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest
{
    @Test
    public void registerFirstName_givenFirstName_shouldReturnTrue()
    {
        UserRegistration userregister=new UserRegistration();
        boolean result=userregister.registerFirstName("Xyz");
        Assert.assertTrue(result);
    }
}
