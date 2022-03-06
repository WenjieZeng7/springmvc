package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-01 15:25
 */
@Controller
public class InterceptorController
{
    @RequestMapping(value = "/testInterceptor")
    public String testInterceptor(){
        return "success";
    }
}
