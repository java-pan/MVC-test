package com.hyp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author HYP
 * @create 2020-11-10 21:26
 */
@RestController
public class AjaxTest {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }
    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:parm=>"+name);
        if ("hyp".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }



    }
}
