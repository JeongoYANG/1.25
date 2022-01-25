package com.example.hi;
/**
 * packageName: com.example.calc
 * fileName   : HiApp.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 나이와 이름을 받아 인사를 리턴하는 앱.
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */

public class HiApp {
    static String HI_APP = " 하이 ";
    String name = "";
    int age = 0;

    public String hi(String name, int age){
        this.name = name;
        this.age = age;
        return String.format("안녕 내 이름은 %s이고 %d살이야.",this.name ,this.age);
    }
}
