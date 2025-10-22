package com.springboot.jwboot.com.springboot.controller.param;

import com.springboot.jwboot.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Ex03Controller {

    // id = 경로변수, {}로 표기
    @GetMapping("/userForm") // /url의 주소
    // long - 정수 타입 객체 표기, int보다 큰 정수를 표기할 때 사용 * 8바이트
    public String formPage(){
        return "pages/userForm"; // userForm 화면을 출력함
    }

    @PostMapping("/login")
    public String resultPage(@ModelAttribute User user, Model model){
        System.out.println("user: " + user);
        
        model.addAttribute("data1", "@PathVariable 예시 - 결과 페이지");
        model.addAttribute("data2",
                "id: " + user.getId() + "<br>pw: " + user.getPw());
        
        return "pages/viewPage03"; // viewPage03 출력
        
    }

    // 문자열 보내기 - Json으로 전송
    @GetMapping("/exJson")
    public @ResponseBody User httpGet(){
        User user = User.builder()
                .id("today")
                .pw("12345")
                .build();
        return user;

    }

}
