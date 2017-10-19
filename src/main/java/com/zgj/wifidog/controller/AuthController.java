package com.zgj.wifidog.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 2017/10/18.
 */
@Controller
public class AuthController {
    @RequestMapping(value = "/wifidog/auth")
    protected void auth(HttpServletRequest request, HttpServletResponse response){
        System.out.println("auth接口被调用了:"+request.getRequestURL().toString()+"?"+request.getQueryString());
        try {
            ServletOutputStream os = response.getOutputStream();
            /**
             * 根据dev_id的有无判断是否是官方版wifidog
             * 有dev_id  是官方版wifidog
             * 没有dev_id  是apfree版wifidog
             */
            response.getOutputStream().write("Auth: 1".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
