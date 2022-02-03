package com.example.service;

import com.example.domain.BmiDTO;


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
public class BmiService {
    public String getbmi(BmiDTO bmi ) {
        //
        return String.format("정상 입니다.", bmi.getName ());
    }
}