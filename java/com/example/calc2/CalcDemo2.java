package com.example.calc2;
/**
 * packageName: com.example.calc
 * fileName   : CalcDemo2.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 계산기 앱을 실행하는 컨트롤러2
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */

import java.util.Scanner;

public class CalcDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp2 calcApp2 = new CalcApp2();
        System.out.println(CalcApp2.CALC_APP);
        System.out.println("첫번째 숫자 : ");
        System.out.println("연산기호 : ");
        System.out.println("두번째 숫자 : ");
        int n1 = scanner.nextInt();
        String op = scanner.next();
        int n2 = scanner.nextInt();
        String result = calcApp2.calc2(n1, op, n2);
        System.out.println("연산결과 : "+ result);
    }
}
