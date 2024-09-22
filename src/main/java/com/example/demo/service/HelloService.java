package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
    @Override
    public String hello() {
        return "hello";
    }
}
