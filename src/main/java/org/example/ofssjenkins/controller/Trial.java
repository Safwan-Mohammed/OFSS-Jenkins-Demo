package org.example.ofssjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Trial {

    @GetMapping("/oracle")
    public String printGreetings(){
        return "Hi Oracle!";
    }

    @GetMapping("")
    public String print(){
        return "Hi Guest!";
    }

//    @GetMapping("test")
//    public int test(){
//        return 1/0;
//    }

}