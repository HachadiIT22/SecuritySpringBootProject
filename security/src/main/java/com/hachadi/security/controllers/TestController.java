package com.hachadi.security.controllers;


import com.hachadi.security.SecurityApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @GetMapping ("/test")
    public String test(){
        LOGGER.info("Hello this method test is invoked !!!!");
        return "Hello Every body";
    }
}
