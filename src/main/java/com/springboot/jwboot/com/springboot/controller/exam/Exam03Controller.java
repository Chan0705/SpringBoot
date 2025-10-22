package com.springboot.jwboot.com.springboot.controller.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    //@RestController //(문자열을 화면에 보여줌)
    public class Exam03Controller {

        @GetMapping("/exam03")
        public String requestMethod(Model model){
            // 모델로 데이터를 저장함 - "data1"를 view로 전달
            model.addAttribute("data1", "Model 예제");
            model.addAttribute("data2", "/exam03");
            return "pages/view03";
        }
}
