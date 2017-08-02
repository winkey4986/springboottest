package com.wrz.springboottest.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("get/{id}")
    public String get(@PathVariable String id){
        return "hello spring boot:"+id;
    }
}
