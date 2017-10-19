package com.zgj.wifidog.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by user on 2017/10/18.
 */
@Controller
public class Gw_messageConrtoller {
    @RequestMapping(value = "/wifidog/gw_message")
    protected  String  gwmessage(HttpServletRequest request, HttpServletResponse response,Map<String,Object> map){

            System.out.println("gw_message接口被调用了:"+request.getRequestURL().toString()+"?"+request.getQueryString());
            map.put("gw_address",request.getParameter("message"));
            return "/gw_message";
    }
}
