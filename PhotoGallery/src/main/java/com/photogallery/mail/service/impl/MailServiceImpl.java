package com.photogallery.mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.photogallery.mail.service.MailService;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	private JavaMailSender mailSender;  
   
	@Override
    public void sendMail(String from, String to, String subject, String msg) {  
        //creating message  
        SimpleMailMessage message = new SimpleMailMessage();  
        message.setFrom(from);  
        message.setTo(to);  
        message.setSubject(subject);  
        message.setText(msg);  
        //sending message  
        mailSender.send(message);     
    }  	
}
