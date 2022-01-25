package com.example.kakao;
/**
 * packageName: com.example.calc
 * fileName   : KakaoDemo.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 카카오 앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */

import java.util.Scanner;

public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp kakaoApp = new KakaoApp();
        System.out.println(KakaoApp.KAKAO_APP);
        System.out.println("telno");
        String telno = scanner.next();
        System.out.println("message");
        String message = scanner.next();
        String result = kakaoApp.kakao(telno, message);
        System.out.println(result);
    }
}
