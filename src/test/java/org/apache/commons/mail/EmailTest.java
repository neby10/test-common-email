package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	private static final String[] EMPTY_EMAILS = {};
    private int timeout = 100;
    private String[] testValidChars = {" ", "a", "A", "", "0123456789", "01234567890123456789"};
    private String parameterName = "";
    // Email abstract, EmailConcrete points to Email class
    private EmailConcrete email;
    @Before
    public void setUpEmailTest() throws Exception {
        email = new EmailConcrete();
    }
    @After
    public void tearDownEmailTest() throws Exception {
        
    }
	
}
