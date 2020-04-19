package com.bl.demo;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    public void givenValidFirstName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("Rutuja");
        Assert.assertTrue(result);
    }
}
