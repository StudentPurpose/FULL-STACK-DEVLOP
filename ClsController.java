package com.slokam.edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.edu.learning.entity.Subject;
import com.slokam.edu.learning.service.ClsService;

@RestController
public class ClsController {

	@Autowired
	private ClsService clsService;
	
	@GetMapping("getSubjectsByClassname/{name}")
	public ResponseEntity<List<Subject>> getSubjectsByClassname(
			@PathVariable("name") String name){
		List<Subject> subjects = clsService.getSubjectsByClassname(name);
		return ResponseEntity.ok(subjects);
	}
	 @GetMapping("getSubjectsByClassid/{id}") public
	 ResponseEntity<List<Subject>> getSubjectsByClassid(
	 @PathVariable("id") Integer id){ List<Subject> subjects =
	 clsService.getSubjectsByClassid(id); return
	 ResponseEntity.ok(subjects); }
	
	 @GetMapping("getSubjectsBySubjectid/{id}")
	 public ResponseEntity<List<Subject>> getSubjectsBySubjectid(
	 @PathVariable("id") Integer id)
	 { List<Subject> subjects =	 clsService.getSubjectsBySubjectid(id); 
	 return ResponseEntity.ok(subjects); 
	 }
	
	 @GetMapping("getAll")
	 public ResponseEntity<List<Subject>> getAll()
	 {
		 return (ResponseEntity<List<Subject>>) ResponseEntity.ok();
	 }
	 
	 
	
}
