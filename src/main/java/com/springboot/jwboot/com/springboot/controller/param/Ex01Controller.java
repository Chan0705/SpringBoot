package com.springboot.jwboot.com.springboot.controller.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex01Controller {

    @GetMapping("/ex01")
    public String method1(@RequestParam("id") String userId, @RequestParam("pw") String userPw, Model model){


        model.addAttribute("data1", "RequestPara 예시");
        model.addAttribute("data2", "id: " + userId + ", <br>pw: " + userPw);
                return "pages/viewPage";
    }

}
