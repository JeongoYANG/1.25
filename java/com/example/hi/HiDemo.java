package com.example.hi;
/**
 * packageName: com.example.calc
 * fileName   : HiDemo.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : HiApp을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */

import com.example.login.LoginApp;

import java.util.Scanner;

public class HiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HiApp hiApp = new HiApp();
        System.out.println(HiApp.HI_APP);
        System.out.println("name");
        System.out.println("age");
        String name = scanner.next();
        int age = scanner.nextInt();
        String result = hiApp.hi(name, age);
        System.out.println(result);
    }
}
