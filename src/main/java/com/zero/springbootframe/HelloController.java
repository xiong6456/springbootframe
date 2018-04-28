package com.zero.springbootframe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${fdName}")
    private String fdName;
    @RequestMapping("hello")
    public String hello(){
        return fdName;
    }
}
