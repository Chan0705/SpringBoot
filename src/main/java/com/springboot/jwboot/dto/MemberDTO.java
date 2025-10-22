package com.springboot.jwboot.dto;

// 도메인 객체


import lombok.*;
import org.springframework.stereotype.Controller;

@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 매개변수를 모두 가진 생성자
@ToString
@Getter
@Setter
@Controller
public class MemberDTO {
    private Long id; // 번호(순서)
    private String name; // 이름
    private String email; // 이메일

}
