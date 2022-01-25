package com.example.hello;
/**
 * packageName: com.example.calc
 * fileName   : HelloApp.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 아이디와 패스워드 이름을 받아 리턴하여 인사하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */

public class HelloApp {
    static String HELLO_APP = " 헬로우 ";
    String id;
    String pw;
    String name;
    String 안녕;

    public String hello(String id, String pw, String name, String 안녕){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.안녕 = 안녕;
        return String.format(" ID : %s , PW : %s , Name : %s , 안녕 : %s", this.id, this.pw, this.name, this.안녕);
    }
}
