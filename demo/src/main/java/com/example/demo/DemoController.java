package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DemoController {

	List<Student> list = new ArrayList<>();
	
	HttpHeaders h = new HttpHeaders();

	
	
	@PostMapping("messege")
	public ResponseEntity<String> setMessege(@RequestBody Student s)
	{
		list.add(s);
		return new ResponseEntity<>("ddata added",h,HttpStatus.CREATED);
	}
	
	@GetMapping("messege")
	public ResponseEntity<List<Student>> getMessege()
	{
		return new ResponseEntity<List<Student>>(list, HttpStatus.ACCEPTED);
	}
}
