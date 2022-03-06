package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-28 21:05
 */
@Controller
public class ScopeController {

    @RequestMapping(value = "testServletAPI")
    public String testServletAPI(HttpServletRequest request){
        request.setAttribute("testScope","hello,servletAPI");
        return "success";
    }
}
