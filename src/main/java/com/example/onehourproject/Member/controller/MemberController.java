package com.example.onehourproject.Member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
        public String gethello(){
            return "Hello i'm mooner92";
    }
    @PostMapping("/join")
        public String join(){
        return "string";
    }

}
