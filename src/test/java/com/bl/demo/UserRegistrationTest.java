package com.bl.demo;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenValidFirstName_ShouldReturnTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("Rutuja");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValidLastName_ShouldReturnTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkLastName("Kalyane");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValidEmailId_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkEmailId("kalyanerutuja7@gmail.com");
        Assert.assertTrue(result);
    }
}
