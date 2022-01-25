package com.example.google;

import java.util.Scanner;

/**
 * packageName: com.example.google
 * fileName   : GoogleDemo.java
 * author     : yangjeongo
 * date       : 2022-01-25
 * desc       : 구글앱을 받아 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         yangjeongo        최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();
        System.out.println("Google");
        System.out.println("search : ");
        String search = scanner.next();
        String res = googleApp.google(search);
        System.out.println(res);
    }
}
