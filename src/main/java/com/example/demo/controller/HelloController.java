package com.example.demo.controller;

import com.example.demo.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    IHelloService helloService;

    @GetMapping()
    public String hello() {
        return helloService.hello();
    }
}
