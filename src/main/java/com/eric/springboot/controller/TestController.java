package com.eric.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018-5-24.
 */
@Controller
public class TestController {
    @RequestMapping("/helloWorld")
    @ResponseBody
    public String helloWorld(){
        return "helloWorld";
    }
}
