package com.springboot.jwboot.com.springboot.controller.repository;

//

import com.springboot.jwboot.dto.MemberDTO;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Repository // 스프링빈으로 등록
public class MemberRepository {

    // list 저장을 위한 ArrayList 생성
    private List<MemberDTO> list = new ArrayList<>();

    // 번호(순서) 저장
    private long sequence = 0L;

    // 회원가입
    public MemberDTO save(@ModelAttribute MemberDTO member){

        member.setId(++sequence); // 부여번호가 자동적으로 ++(+1) 됨
        list.add(member); // 받은 파라미터를 저장
        return member;
    }

    // 회원 목록 보기
    public List<MemberDTO> findAll(){
        return list;
    }


}
