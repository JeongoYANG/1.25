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
public class StudentServiceImpl implements StudentService{


    @Override
    public String getBmi(BmiDTO bmi) {
        return String.format("정상 입니다.", bmi.getName ());
    }

    @Override
    public String calc(CalcDTO Calc) {
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

    @Override
    public String search(GoogleDTO Google) {
        return String.format("%s를(을) 검색한 결과 입니다",Google.getSearch ());
    }

    @Override
    public String getGrade(GradeDTO grade) {
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

    @Override
    public String login(LoginDTO login) {
        return (login.getPw ().equals(LoginDTO.PASSWORD)) ?
                String.format(" %s 님의 비밀번호 %s 가 맞습니다. 로그인 성공 ",login.getName (),login.getPw ())
                : String.format(" %s 님의 ID 는 맞고, 비밀번호 %s 가 틀립니다. 로그인 실패 ",login.getId (),login.getPw ());
    }
}
