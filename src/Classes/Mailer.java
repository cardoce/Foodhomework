/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.MailerInterface;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

/**
 *
 * @author fernandocardoce
 */
public class Mailer implements MailerInterface{
    
    private static String emailSender = "cardocerecipes@gmail.com";  
    private static String password = "220592uaca"; 

    @Override
    public void SendMail(String[] recipient, String recipeName, String recipeText) {
//        Validation needs to be refactor to check the full list of emails in the future
//       for this Sprint it fullfil th purpose beacuse we are only sending the email to 1 recipient
         if (!isValidEmailAddress(recipient[0])){
             JOptionPane.showMessageDialog(null,"Error: Invalid email");
         } else{
            Properties props = System.getProperties();
            String host = "smtp.gmail.com";
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.user", emailSender);
            props.put("mail.smtp.password", password);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);

                try {
                message.setFrom(new InternetAddress(emailSender));
                InternetAddress[] toAddress = new InternetAddress[recipient.length];

                for( int i = 0; i < recipient.length; i++ ) {
                    toAddress[i] = new InternetAddress(recipient[i]);
                }

                for( int i = 0; i < toAddress.length; i++) {
                    message.addRecipient(Message.RecipientType.TO, toAddress[i]);
                }

                message.setSubject(recipeName);
                message.setText(recipeText);
                Transport transport = session.getTransport("smtp");
                transport.connect(host, emailSender, password);
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
                JOptionPane.showMessageDialog(null,"Email send to: "+ recipient[0]);
            }
            catch (AddressException ae) {
                ae.printStackTrace();
            }
            catch (MessagingException me) {
                me.printStackTrace();
            }
         }

    }
    
    public static boolean isValidEmailAddress(String emailAddress){
        if (emailAddress == null) 
            return false;
        boolean result = true;
        try {
          InternetAddress emailAddr = new InternetAddress(emailAddress);
          if (! hasNameAndDomain(emailAddress)) {
            result = false;
          }
        }
        catch (AddressException ex){
          result = false;
        }
        return result;
  }
    
    private static boolean hasNameAndDomain(String emailAddress){
        String[] tokens = emailAddress.split("@");
        return 
          tokens.length == 2 ;
  }
    

}
