package com.springboot.jwboot.com.springboot.controller.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/exam02") // 1차 url
@Controller
@RestController //(문자열을 화면에 보여줌)
public class Exam02Controller {

    // method=RequestMethod.GET => GetMapping
    // method=RequestMethod.POST => PostMapping / 주로 form에서 사용
    @RequestMapping("/rest") // 2차 url(하위)
    public String requestMethod(){
        return "<h2>@RestController예시</h2>";

}
}
