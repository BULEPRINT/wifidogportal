package com.zgj.wifidog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 2017/10/18.
 */
@Controller
public class PortalController {
    @RequestMapping(value = "/wifidog/portal")
    protected void protal(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        System.out.println("调用了portal接口:"+request.getRequestURL().toString()+"?"+request.getQueryString());

        //1.如果没有dev_id，认为是官方版wifidog
        response.sendRedirect("http://www.seeyoo.cn/");
    }
}
