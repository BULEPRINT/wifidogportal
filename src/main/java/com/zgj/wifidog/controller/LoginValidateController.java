package com.zgj.wifidog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 2017/10/18.
 */
@Controller
public class LoginValidateController {

    @RequestMapping(value = "/loginValidate")
    protected void loginValidate(HttpServletRequest request, HttpServletResponse response){
        response.setCharacterEncoding("UTF-8");
        try {
            String gw_address = (String) request.getParameter("gw_address");//路由器地址
            String gw_port = (String) request.getParameter("gw_port");//路由器端口
            String url = (String) request.getParameter("url");//成功后的重定向url
            String gw_id = (String) request.getParameter("gw_id");
//            String dev_id = (String) request.getParameter("dev_id");
            String mac=(String) request.getParameter("mac");//客户端mac地址
//gw_address="192.168.1.132";
            System.out.println("====="+gw_address);
            if ("".equals(gw_address)||gw_address==null){
                String urld="http://localhost";
                response.sendRedirect(urld);
            }else{
                //拼接重定向url
                String token=System.currentTimeMillis()+"";
                String redirectUrl="http://"+gw_address+":"+gw_port+"/wifidog/auth?"+"token="+token+"&url="+url;
                System.out.println("---"+redirectUrl);
                response.sendRedirect(redirectUrl);
            }

        } catch (IOException e) {
            e.printStackTrace();try {
                response.getOutputStream().write("认证登录时出现异常!".getBytes("UTF-8"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
