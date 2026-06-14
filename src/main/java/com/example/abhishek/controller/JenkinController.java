package com.example.abhishek.controller;

import java.awt.Desktop;
import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JenkinController {

	 @GetMapping("/")
	    public String home() {
	        return "index";
	    }
	  

}
