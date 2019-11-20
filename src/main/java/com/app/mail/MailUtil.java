package com.app.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailUtil {
	@Autowired
	private JavaMailSender sender;
	
	public void send(String toAdress,String subj,String textMessage) {
		
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message);
		try {
			helper.setTo(toAdress);
			helper.setSubject(subj);
			helper.setText(textMessage);
			sender.send(message);
		} catch (MessagingException e) {
		
			e.printStackTrace();
			
		}
		
		
	}

}
