package com.zgj.wifidog.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 2017/10/18.
 */
@Controller
public class PingController {
    @RequestMapping(value = "/wifidog/ping")
    protected void ping(HttpServletRequest request, HttpServletResponse response){
        System.out.println("ping接口被调用了："+request.getRequestURL().toString()+"?"+request.getQueryString());

        try {
            String pongStr4Origin = "Pong";
            response.getOutputStream().write(pongStr4Origin.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
