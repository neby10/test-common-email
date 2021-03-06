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

     // addBcc Tests
    @Test
    public void testAddBcc() throws Exception {
        email.addBcc(TEST_EMAILS);
        assertEquals(4, email.getBccAddresses().size());
    }

    // addCc Tests
    @Test
    public void testAddCc() throws Exception {
        email.addCc(TEST_EMAILS);
        assertEquals(4, email.getCcAddresses().size());
    }

    // addHeader Tests
    @Test (expected = IllegalArgumentException.class)
    public void testAddHeader() throws Exception {
        email.addHeader(parameterName, "abc.com");
        //assertThrows(IllegalArgumentException.class, () -> email.addHeader(parameterName, "abc.com"), "empty parameter should throw");
    
    }

    // addReplyTo Tests
    @Test
    public void testAddReplyTo() throws Exception {
        email.addReplyTo(parameterName);
        assertEquals(null, email.addReplyTo(parameterName));
    }

    //buildMimeMessage Tests
    @Test
    public void testBuildMimeMessage() throws Exception {
        email.buildMimeMessage();
    }

     // getHostName Tests
    @Test
    public void testGetHostName() throws Exception {
        email.getHostName();
        assertEquals(null, email.getHostName());
    }

    // getMailSession Tests
    @Test
    public void testGetMailSession() throws Exception {
        email.getMailSession();
    }

    // getSentDate Tests
    @Test
    public void testGetSentDate() throws Exception {
        email.getSentDate();
    }

    // getSocketConnectionTimeout Tests
    @Test
    public void testGetSocketConnectionTimeout() throws Exception {
        email.setSocketConnectionTimeout(timeout);
        email.getSocketConnectionTimeout();
        assertEquals(100, email.getSocketConnectionTimeout());
    }

    // setFrom Tests
    @Test (expected = EmailException.class)
    public void testSetFrom() throws Exception {
        email.setFrom("myemailcom");
        //assertThrows(EmailException.class, () -> email.setFrom("myemailcom"), "invalid email should throw");
    }
	
}
