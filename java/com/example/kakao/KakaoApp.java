package com.example.kakao;
/**
 * packageName: com.example.calc
 * fileName   : KakaoApp.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 전화번호와 이름을 받아 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */

/***
 * 전화번호와 메세지를 받아 전송하는 어플을 만드시오
 * String telno , String message
 */
public class KakaoApp {
    static String KAKAO_APP = " 카카오 ";
     String telno = "";
    String message = "";
    String test = "";

    public String kakao(String telno, String message){
        this.telno = telno;
        this.message = message;
        return String.format("telno : %s , message : %s ",this.telno, this.message);
    }
}
