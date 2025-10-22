package com.springboot.jwboot.com.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링 컨테이너에 bean객체로 등록
public class HomeController{

    @RequestMapping("/")
    public String home(){
        return "home"; // home.html
    }

    @GetMapping("/time")
    public String timeMethod(){
        return "pages/time"; // pages/time.html로 이동
    }


        }