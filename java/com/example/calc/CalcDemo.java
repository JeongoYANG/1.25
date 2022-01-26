package com.example.calc;
/**
 * packageName: com.example.calc
 * fileName   : CalcDemo.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 계산기 앱을 실행하는 컨트롤러
 *  * 클래스변수 :
 *  * 파라미터,인스턴스변수 :
 *  * 로컬변수 :
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
        int num1 = scanner.nextInt();
        System.out.println("연산기호 + - * /: ");
        String opcode = scanner.next();
        System.out.println("두번째 숫자 : ");
        int num2 = scanner.nextInt();
        String res = calcApp.calc(num1, opcode, num2);
        System.out.println("연산결과 : "+ res);
    }
}