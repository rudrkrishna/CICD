package com.CICD.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/checkStatus")
    public ResponseEntity<String> checkStatus(){
        return new ResponseEntity<>("Service is up and running", HttpStatus.OK);
    }
}
