package com.example.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.bmi
 * fileName   : BmiDemo
 * author     : yangjeongo
 * date       : 2022-01-25
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         yangjeongo        최초 생성
 */
public class BmiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println("Bmi");
        System.out.println("name");
        System.out.println("cm");
        System.out.println("kg");
        String name = scanner.next();
        String cm = scanner.next();
        String kg = scanner.next();
        String res = bmiApp.bmi(name, cm, kg);
        System.out.println(res);

    }
}
