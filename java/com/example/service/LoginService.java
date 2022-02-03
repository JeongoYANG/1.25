package com.example.service;

import com.example.domain.LoginDTO;


public class LoginService {
    public String getlogin(LoginDTO login) {
        return (login.getPw ().equals(LoginDTO.PASSWORD)) ?
                String.format(" %s 님의 비밀번호 %s 가 맞습니다. 로그인 성공 ",login.getName (),login.getPw ())
                : String.format(" %s 님의 ID 는 맞고, 비밀번호 %s 가 틀립니다. 로그인 실패 ",login.getId (),login.getPw ());
    }
}