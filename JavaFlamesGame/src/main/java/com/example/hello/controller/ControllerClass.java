package com.example.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.service.ServiceClass;

@RestController
public class ControllerClass {
	
	@Autowired
	ServiceClass sc;
	
	@GetMapping("/job/{a}/{b}")
	public ResponseEntity<String> flames(@PathVariable String a,@PathVariable String b)
	{
		return ResponseEntity.ok(sc.method1(a, b));
	}

}
