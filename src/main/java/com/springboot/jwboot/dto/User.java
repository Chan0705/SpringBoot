package com.springboot.jwboot.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder // 데이터 생성
@ToString // 문자열 정보 출력 위한 @
@Getter
@Setter
public class User {

    public String id;
    public String pw;


}
