package com.example.calc;
/**
 * packageName: com.example.calc
 * fileName   : CalcApp.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 숫자2개와 연산자를 받아 계산하는 앱
 *  * 클래스변수 :
 *  * 파라미터,인스턴스변수 :
 *  * 로컬변수 :
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
        int res = 0;
        /*if (opcode.equals("+")){
            res = num1 + num2;
        }else if (opcode.equals("-")){
            res = num1 - num2;
        }else if (opcode.equals("*")){
            res = num1 * num2;
        }else if (opcode.equals("/")){
            res = num1 / num2;
        }else {
            res = 0;
        }*/

        switch (opcode){
            case "+": res = num1 + num2; break;
            case "-": res = num1 - num2; break;
            case "*": res = num1 * num2; break;
            case "/": res = num1 / num2; break;
        }


        String result = String.format(" %d %s %d = %d ",
                this.num1, this.opcode, this.num2, res);
        return result;
    }
}