package com.atguigu.springboot2020.controller;

import com.atguigu.springboot2020.annotation.LogTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    @LogTime
    public String hello(String name) {
        return "hello" + name;
    }
}
