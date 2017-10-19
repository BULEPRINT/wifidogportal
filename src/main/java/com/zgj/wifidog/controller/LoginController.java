package com.zgj.wifidog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by user on 2017/10/18.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/wifidog/login")
    protected String login(HttpServletRequest request, HttpServletResponse response,Map<String,Object> map) throws ServletException,IOException{
        /**
         * 跳转到用户登录认证页面
         */
        map.put("gw_address",request.getParameter("gw_address"));
        map.put("gw_port",request.getParameter("gw_port"));
        map.put("gw_id",request.getParameter("gw_id"));
        map.put("url",request.getParameter("url"));
        map.put("dev_id",request.getParameter("dev_id"));
        return "login4origin";
    }
}
