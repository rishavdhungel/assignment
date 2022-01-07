
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

    public static void main(String[] args) {

        // Recipient's email ID needs to be mentioned.
        String to = "rishavdhungel3@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "1811008_rishav@kusom.edu.np";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("1811008_rishav@kusom.edu.np", "");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("New Out Launch");
            String name;

            // Now set the actual message
            message.setText("Dear "+name +"\n"+
            "\n"+
            "We are going to launch the new Outlet @ New Road.\n"+
            "Please visit in the opening date and grab the heavy discounts upto 80%.\n"+
            "\n"+
            "Thank you!\n"+
            "ABC Outlet");


            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }

}
/*
import java.util.Properties;
import java.util.Scanner;
import java.io.Console;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class Mail{

	/**
	   Outgoing Mail (SMTP) Server
	   requires TLS or SSL: smtp.gmail.com (use authentication)
	   Use Authentication: Yes
	   Port for TLS/STARTTLS: 587
	 */
	 /*
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the correct sender gmail id with the IMAP enabled");
        String fromEmail = sc.nextLine();
		//String fromEmail = "1811008_rishav@kusom.edu.np"; //requires valid gmail id
        Console console = System.console();
        char[] password = console.readPassword("Enter Password for above email");
        //	final String password = "mypassword"; // correct password for gmail id
		final String toEmail = "rishavdhungel3@gmail.com"; // can be any email id //use email from database 
		
		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
		
                    // Get the Session object.
                Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromEmail, password);
            }
                });

            try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field
            message.setFrom(new InternetAddress(fromEmail));

            // Set To: header field
            message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(toEmail));

            // Set Subject: header field
            message.setSubject("My first message with JavaMail");

            // Put the content of your message
            message.setText("Hi there, this is my first message sent with JavaMail");

            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }

        }
	
}

*/


