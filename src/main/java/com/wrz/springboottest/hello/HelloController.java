package com.wrz.springboottest.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("get/{id}")
    public String get(@PathVariable String id){
        //需要使用add吗
        System.out.println("到:"+id);
        return "hello spring boot:"+id;
    }
}
