package com.zb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/show/{name}")
    public String showHello(@PathVariable("name") String name){
        return "hello:"+name;
    }
}
