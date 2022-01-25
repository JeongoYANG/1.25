package com.example.hello;
/**
 * packageName: com.example.calc
 * fileName   : HelloDemo.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : HelloApp을 받아 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();
        System.out.println(HelloApp.HELLO_APP);
        System.out.println("id");
        System.out.println("pw");
        System.out.println("name");
        System.out.println("안녕");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String 안녕 = scanner.next();
        String result = helloApp.hello(id, pw, name, 안녕);
        System.out.println("result");
    }
}
