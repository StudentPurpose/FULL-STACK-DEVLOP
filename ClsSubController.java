package com.slokam.edu.learning.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.edu.learning.entity.Cls_Sub;
import com.slokam.edu.learning.service.ClsService;

@RestController
public class ClsSubController {
	private static final Logger LOGGER=LoggerFactory.getLogger(ClsSubController.class);
	@Autowired
	private ClsService clsService;
	
	
	
	@PostMapping("saveData/{className}/{subName}")
	public ResponseEntity<Cls_Sub> saveData(@PathVariable String className,
											@PathVariable String subName)
	{
		LOGGER.info("entered into saveData method in clasSubController");
		Cls_Sub clsSub=clsService.saveData(className,subName);
		LOGGER.info("subname :"+subName);
		LOGGER.info("classname :"+className);
		LOGGER.info("exit form saveData method in clasubcontroller");
		LOGGER.info("my name is naresh");
		return ResponseEntity.ok(clsSub);
	}
	

}
