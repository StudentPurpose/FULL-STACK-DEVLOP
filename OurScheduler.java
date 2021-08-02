package com.slokam.edu.learning.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class OurScheduler {
	
	@Autowired
	private MailSender mailsender;
	@Scheduled(cron="${app.time}")

	public void scheduleOne()
	{
		System.out.println(new Date());
		
		 /*SimpleMailMessage message=new SimpleMailMessage();
		 message.setFrom("mnaresh12@gmail.com");
		 message.setTo("chsaiteja77@gmail.com");
		 message.setSubject("this is simple subject");
		 message.setText("hi sai teja i am naresh"); mailsender.send(message);
		*/
		
	}

}
