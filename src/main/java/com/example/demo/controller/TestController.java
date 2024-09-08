package com.example.demo.controller;

import com.example.demo.bean.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestProperties testProperties;

    @GetMapping("/test")
    public String test() {
        System.out.println(testProperties);

        return "test";
    }
}
