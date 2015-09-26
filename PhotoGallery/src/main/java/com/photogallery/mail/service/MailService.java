package com.photogallery.mail.service;

public interface MailService {

	void sendMail(String from, String to, String subject, String msg);

}
