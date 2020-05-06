package com.atguigu.springboot2020.controller;

import com.atguigu.springboot2020.annotation.CheckArgs;
import com.atguigu.springboot2020.annotation.LogTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    @LogTime
    @CheckArgs
    public String hello(String name) {

        try {
            int i = 1 / 1;
            return "hello";
        } catch (Exception e) {
            System.out.println("抛异常了");
        } finally {
            System.out.println("执行finally了");
        }


        return "hello, " + name;
    }
}
