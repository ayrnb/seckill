package com.gjw.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class TestController {
    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("name","测试Demo");
        return "hello";
    }
}
