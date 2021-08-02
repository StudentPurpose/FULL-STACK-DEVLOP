package com.slokam.edu.learning.controller;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("file")
public class FileController {
@Value("${app.files.upload.location}")
private String uploadLocation;
private Logger LOGGER=LoggerFactory.getLogger(FileController.class);
@PostMapping("upload")
public void fileUpload(MultipartFile ourFile)throws IOException
{
	 LOGGER.info(ourFile.getOriginalFilename());
	  LOGGER.info(ourFile.getSize()+"    size is");
	  ourFile.transferTo(new File(uploadLocation+ourFile.getOriginalFilename()));
	 
}
//http://localhost:8080/file/upload
@GetMapping("download/{fileName}")
public ResponseEntity<FileSystemResource> 
downloadFile(@PathVariable("fileName") String fileName) throws IOException {

	FileSystemResource fis = new FileSystemResource( new File(uploadLocation+fileName));
	return ResponseEntity.ok()
			.header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename="+fileName)
			.body(fis);
	
}

@GetMapping("display/{fileName}")
public ResponseEntity<FileSystemResource> 	display(@PathVariable("fileName") String fileName) {

	FileSystemResource fis = new FileSystemResource( new File(uploadLocation+fileName));
	return ResponseEntity.ok()
			.body(fis);
	
}

}
