package com.hyp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HYP
 * @create 2020-11-09 10:05
 */
@Controller

public class HelloServlet {
   @PostMapping("/hello")
    public String hello( String name,Model model){
     model.addAttribute("msg",name);
        System.out.println(name);
        return "hello";

    }
}
