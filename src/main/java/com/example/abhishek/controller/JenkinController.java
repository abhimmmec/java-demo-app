package com.example.abhishek.controller;

import java.awt.Desktop;
import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JenkinController {

	 @GetMapping("/")
	    public String home() {
			 logger.info("Home page request received- rahul ki gaand fad di ");
        logger.info("Application triggered successfully from Jenkins build by abhishek");
	        return "index";
	    }
	  

}
