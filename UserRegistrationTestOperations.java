package com.junitTesting.operations;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTestOperations {
    
	//UC1 firstname
	 @Test
	   public void givenFirstName_WhenProperFirstName_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addFirstName("Kapil");
	        Assertions.assertTrue(result);
	    }

	    //UC1 firstname false
	    @Test
	    public void givenFirstName_WhenNotProperFirstName_ShouldReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addFirstName("kapil");
	        Assertions.assertFalse(result);
	    }

	    //UC2 last name true
	    @Test
	    public void givenFirstName_WhenProperLastName_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addLastName("Gajbhiye");
	        Assertions.assertTrue(result);
	    }

	    //UC2 last name false
	    @Test
	    public void givenFirstName_WhenNotProperLastName_ShouldReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addFirstName("gajbhiye");
	        Assertions.assertFalse(result);
	    }

	    //UC3 EmailId true
	    @Test
	    public void givenFirstName_WhenProperEmailId_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addEmail("dsd.111@gmail.com");
	        Assertions.assertTrue(result);
	    }

	    //UC3 Email id false
	    @Test
	   public void givenFirstName_WhenNotProperEmailId_ShouldReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addEmail("dss.100@g.c");
	        Assertions.assertFalse(result);
	    }

	    //UC4 PhoneNumber true
	    @Test
	    public void givenFirstName_WhenProperPhoneNumber_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addPhoneNumber("91 9325569506");
	        Assertions.assertTrue(result);
	    }

	    //UC4 PhoneNumber false
	    @Test
	    public void givenFirstName_WhenNotProperPhoneNumber_ShouldReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addPhoneNumber("919325569506");
	        Assertions.assertFalse(result);
	    }


	    //*UC5 password only accept 8 character true
	    //*password should have at least one Upper case letter
	    //*password shoudat least one  have digits
	    @Test
	    public void givenFirstName_WhenProperPassword_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addPassword("Aa3ssdasd4$#");
	        Assertions.assertTrue(result);
	    }

	    //UC5 password false
	    @Test
	    public void givenFirstName_WhenNotProperPassword_ShouldReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.addPassword("aasasAasd$");
	        Assertions.assertFalse(result);
	    }

}





