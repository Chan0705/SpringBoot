package com.springboot.jwboot.com.springboot.controller.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex02Controller {

    // id = 경로변수, {}로 표기
    @GetMapping("/boards/{id}") // /url의 주소
    // long - 정수 타입 객체 표기, int보다 큰 정수를 표기할 때 사용 * 8바이트
    public String method(@PathVariable("id") Long id, Model model){

        model.addAttribute("data1", "@PathVariable 예시");
        model.addAttribute("data2", "게시글 번호: " + id);

        return "pages/viewPage02"; // viewPage02의 화면을 출력함
    }

}
