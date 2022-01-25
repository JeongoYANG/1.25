package com.example.calc;
/**
 * packageName: com.example.calc
 * fileName   : CalcDemo.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println(CalcApp.CALC_APP);
        System.out.println("첫번째 숫자 : ");
        System.out.println("연산기호 : ");
        System.out.println("두번째 숫자 : ");
        int num1 = scanner.nextInt();
        String opcode = scanner.next();
        int num2 = scanner.nextInt();
        String result = calcApp.calc(num1, opcode, num2);
        System.out.println("연산결과 : "+ result);
    }
}