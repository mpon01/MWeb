/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Mer
 */


//ssl = 465
//tls = 587
public class JavaMail {
    public static void sendMail(String recepient) throws Exception {
       System.out.println("Preparing to send a mail message.");
       
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
;
        
        final String myEmail = "p.mer00256@gmail.com";
        final String myPassword = "utxsmmaysawtywqm";
        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail, myPassword); 
            } 
        });
        
        Message message = prepareMessage(session, myEmail, recepient);
        Transport.send(message);
        System.out.println("Mail message sent successfully.");
        
    }

    private static Message prepareMessage(Session session, String myEmail, String recepient) {
        Message message = null;
        try {
            message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Email Confirmation for Sign Up from Web Tech class");
            message.setText("Hello, \n This is a confirmation email that you signed up/filled the student admission form.");
        } catch (Exception ex) {
            Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return message;
    }
    
}
