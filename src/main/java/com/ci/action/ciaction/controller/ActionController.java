package com.ci.action.ciaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

    @GetMapping("/")
    public String hello() {
        return "hello world";
    }

}
