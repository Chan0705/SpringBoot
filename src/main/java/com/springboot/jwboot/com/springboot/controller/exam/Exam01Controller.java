package com.springboot.jwboot.com.springboot.controller.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exam01Controller {

//    localhost:8080/exam01
    @RequestMapping(value = "exam01") // 본래는 , method=RequestMethod.GET까지 들어감
    // method=RequestMethod.GET => GetMapping
    // method=RequestMethod.POST => PostMapping / 주로 form에서 사용
    public String requestMethod(){
        return "pages/view01";
    }

}
