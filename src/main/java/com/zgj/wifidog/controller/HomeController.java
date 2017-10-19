package com.zgj.wifidog.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2017/10/18.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index(){
        return "/index";
    }
}
