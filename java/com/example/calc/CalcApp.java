package com.example.calc;
/**
 * packageName: com.example.calc
 * fileName   : CalcApp.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 숫자2개와 연산자를 받아 계산하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */
public class  CalcApp {
    static String CALC_APP = " 계산기 ";
    int num1 = 0;
    int num2 = 0;
    String opcode = "";

    public String calc(int num1, String opcode, int num2) {
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int result = num1 + num2;
        return String.format(" %d %s %d = %d ",
                this.num1, this.opcode, this.num2, result);
    }
}