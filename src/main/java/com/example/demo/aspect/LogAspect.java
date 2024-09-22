package com.example.demo.aspect;

import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    private final HttpServletRequest request;

    public LogAspect(HttpServletRequest request) {
        this.request = request;
    }

    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void controllerPointcut() {}

    @After("controllerPointcut()")
    public void logAfter(JoinPoint joinPoint) {
        String method = request.getMethod();
        String path = request.getRequestURI();
        String queryParams = request.getQueryString();

        System.out.println("HTTP Request: ");
        System.out.println("Method: " + method);
        System.out.println("Path: " + path);
        System.out.println("Query Params: " + (queryParams != null ? queryParams : "None"));
    }
}