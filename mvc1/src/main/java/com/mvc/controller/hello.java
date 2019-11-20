package com.mvc.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: bxguo
 * @time: 2019/11/20 10:50
 */
@Controller
public class hello {
    @RequestMapping("/index.do")
    public String hello(){
        System.out.println("com.mvc.controller.hello----------");
        return "index";
    }
}
