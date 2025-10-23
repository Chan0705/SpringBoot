package com.springboot.jwboot.com.springboot.controller;


import com.springboot.jwboot.com.springboot.controller.repository.MemberRepository;
import com.springboot.jwboot.dto.MemberDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/members") // 차 url
@AllArgsConstructor // 생성자 주입(=new와 동일한 기능)
@Controller
public class MemberController {

//    private MemberRepository repository = new MemberRepository();
    private MemberRepository repository; // @ALLArgsConstructor로 위 코드와 동일한 기능을 함
    
    // 회원가입 화면 요청
    @GetMapping("/add")
    public String addForm(){
        return "member/addForm"; // = addForm.html을 표출

    }

    // 회원 등록 처리
    @PostMapping("/add")
    public String add(@ModelAttribute MemberDTO member){
        System.out.println("member: " + member);
        repository.save(member); // list 저장
        return "redirect:/members"; // 등록 후 바로 /members로 이동
    }

    // 회웜 목록
    @GetMapping // 2차 url이 없을 경우 1차 url로 자동 연결
    public String list(Model model){
        List<MemberDTO> members = repository.findAll();
        //members 모델을 저장 후 뷰로 전달
        model.addAttribute("members", members);
        return "member/members";
    }

    //

}
