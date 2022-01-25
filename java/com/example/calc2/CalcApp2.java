package com.example.calc2;
/**
 * packageName: com.example.calc
 * fileName   : CalcApp2.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 숫자2개와 연산자 받아서 결과를 리턴하는 앱2
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */

public class CalcApp2 {
    static String CALC_APP = " 계산기 ";
    int n1;
    int n2;
    String op;

    public String calc2(int n1, String op, int n2){
        this.n1 = n1;
        this.op = op;
        this.n2 = n2;
        int result = n1 + n2;
        return String.format(" %d %s %d = %d ",
                this.n1, this.op, this.n2 , result);
    }
}
