package com.example.service;

import com.example.domain.*;

/**
 * packageName: com.example.service
 * fileName   : StudentService
 * author     : yangjeongo
 * date       : 2022-02-07
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         yangjeongo        최초 생성
 */
public interface StudentService {
    String getBmi(BmiDTO bmi );
    String calc(CalcDTO Calc);
    String search (GoogleDTO Google);
    String getGrade(GradeDTO grade);
    String login(LoginDTO login);
}
