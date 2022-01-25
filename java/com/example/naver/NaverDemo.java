package com.example.naver;

import java.util.Scanner;

/**
 * packageName: com.example.naver
 * fileName   : NaverDemo
 * author     : yangjeongo
 * date       : 2022-01-25
 * desc       : NaverApp을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         yangjeongo        최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println("Naver");
        System.out.println(" Id ");
        System.out.println(" Pw ");
        String Id = scanner.next();
        String Pw = scanner.next();
        String res = naverApp.naver(Id, Pw);
        System.out.println(res);

    }
}
