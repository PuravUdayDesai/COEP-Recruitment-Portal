package org.coep.recruitment.portal.aspect;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.coep.recruitment.portal.Constants;

public class EmailAspect {

	public static void sendEmailWithoutAttachment(	String toEmailid,
													String mailToType,
													String subject,
													String bodyContent,
													String bodyContentType) throws MessagingException 
	{
	 	final String user=Constants.EMAIL_ID; 
 		final String password=Constants.EMAIL_PASSWORD;
	 	Properties props = new Properties();  
		props.put("mail.smtp.auth", true);
		props.put("mail.smtp.starttls.enable", true);
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587"); 
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
 		
 		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
 		{  
 	 		protected PasswordAuthentication getPasswordAuthentication()
 	 		{	  
			 		return new PasswordAuthentication(user,password);  
  	 		}  
 		});  
 		
 		session.getProperties().put("mail.smtp.ssl.trust", "smtp.gmail.com");
 		session.getProperties().put("mail.smtp.starttls.enable", "true");
 		
		 MimeMessage message = new MimeMessage(session);
		 
		message.setFrom(new InternetAddress(user));
 	 	message.addRecipient(mailToType.equalsIgnoreCase("TO")?Message.RecipientType.TO:mailToType.equalsIgnoreCase("BCC")?Message.RecipientType.BCC : Message.RecipientType.CC ,new InternetAddress(toEmailid)); 
		message.setSubject(subject);
		message.setContent(bodyContent,bodyContentType);
		Transport.send(message);	
	}
	
}