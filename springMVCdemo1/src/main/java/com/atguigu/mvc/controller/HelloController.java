package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-28 16:20
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }
}
