package com.example.service;

import com.example.domain.GradeDTO;


/**
 * packageName: com.example.grade
 * fileName   : GradeDemo
 * author     : yangjeongo
 * date       : 2022-01-26
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         yangjeongo        최초 생성
 */
public class GradeService {
    public String getgrade(GradeDTO grade) {
        int total = grade.getKor () + grade.getEng () + grade.getMath ();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";

        return String.format (" *########## %s ########\n " +
                        "* 이름: %s\n" +
                        "* > 국어: %d점\n" +
                        "* > 영어: %d점\n" +
                        "* > 수학: %d점\n" +
                        "* 총점: %d점\n" +
                        "* 평균(정수): %d점\n" +
                        "* 합격여부: %s\n" +
                        "* #######################\n ", GradeDTO.GRADE,
                grade.getName (),
                grade.getKor (),
                grade.getEng (),
                grade.getMath (), total, avg, pass);
    }

}
