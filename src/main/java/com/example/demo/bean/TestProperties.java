package com.example.demo.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "javastack")
public class TestProperties {
    private String name;

    private String site;

    private String author;

    private List<String> users;

    private Map<String, String> params;

    private Security security;
}

@Data
class Security {
    private String securityKey;

    private String securityCode;
}
