package com.example.service;
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

import com.example.domain.CalcDTO;

public class CalcService {
    public String getCalc(CalcDTO Calc) {
        int res = 0;
        switch (Calc.getOpcode ()) {
            case "+":
                res = Calc.getNum1 () + Calc.getNum2 ();
                break;
            case "-":
                res = Calc.getNum1 () - Calc.getNum2 ();
                break;
            case "*":
                res = Calc.getNum1 () * Calc.getNum2 ();
                break;
            case "/":
                res = Calc.getNum1 () / Calc.getNum2 ();
                break;
        }
        return String.format ("%d %s %d = %d",
                Calc.getNum1 (), Calc.getOpcode (), Calc.getNum2 (), res);
    }
}