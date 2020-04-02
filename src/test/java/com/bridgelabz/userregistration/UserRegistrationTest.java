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
    @Test
    public void registerEmail_givenEmail_shouldReturnTrue()
    {
        UserRegistration userregister=new UserRegistration();
        boolean result=userregister.registerEmail("ganesh123@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void registerMobleNo_givenMobileNo_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerMobileNo("91 9604830174");
        Assert.assertTrue(result);
    }

    @Test
    public void registerPassword_ifPasswordShort_shouldReturnFalse()
    {
        UserRegistration userregister=new UserRegistration();
        boolean result=userregister.registerPassword("1234");
        Assert.assertFalse(result);
    }
}
