package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-28 17:40
 */
@Controller
@RequestMapping(value = "/test")
public class RequestMappingController {

    @RequestMapping(value = "/testRequestMapping")
    public String success(){
        return "success";
    }

    @RequestMapping("/testpojo")
    public String testPOJO(User user){
        System.out.println(user);
        return "success";
    }
}
