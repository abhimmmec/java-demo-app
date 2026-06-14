package com.example.abhishek.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JenkinController {

    private static final Logger logger = LoggerFactory.getLogger(JenkinController.class);

    @GetMapping("/")
    public String home() {

        logger.info("Home page request received");
        logger.info("Application triggered successfully from Jenkins build");

        return "index";
    }
}
