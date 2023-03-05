package com.example.ec2prac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/practices")
    public String practice(){
        return "연습입니다.";
    }
}
