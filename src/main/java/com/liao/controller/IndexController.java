package com.liao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
public class  IndexController {

    @RequestMapping({"/index","/"})
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","<H1>hello,springboot</H>");
        model.addAttribute("msg2", Arrays.asList("学生1","学生2","学生3"));
        return "test";
    }
}
