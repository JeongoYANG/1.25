package com.example.democontroller;

import com.example.domain.BmiDTO;
import com.example.service.BmiService;
import com.example.domain.GoogleDTO;
import com.example.service.GoogleService;
import com.example.domain.CalcDTO;
import com.example.service.CalcService;
import com.example.domain.GradeDTO;
import com.example.service.GradeService;
import com.example.domain.LoginDTO;
import com.example.service.LoginService;

import java.util.Scanner;

/**
 * packageName: com.example.democontroller
 * fileName   : DemoController
 * author     : yangjeongo
 * date       : 2022-02-03
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         yangjeongo        최초 생성
 */
public class StudentController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        CalcDTO Cacl = new CalcDTO ();
        CalcService calcService = new CalcService ();
        BmiDTO bmi = new BmiDTO ();
        BmiService bmiService = new BmiService ();
        GoogleDTO Google = new GoogleDTO ();
        GoogleService googleService = new GoogleService ();
        GradeService gradeService = new GradeService ();
        GradeDTO Grade = new GradeDTO ();
        LoginDTO login = new LoginDTO ();
        LoginService loginService = new LoginService ();
        while (true) {
            System.out.println ("메뉴 선택");
            String menu = "1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN";
            System.out.println (menu);
            String sel = scanner.next ();
            String res = "";
            switch (sel) {
                case "0":
                    System.out.println ("Exit");
                    return;
                case "1":
                    res = "BMI";
                    System.out.println (BmiDTO.Bmi + "\n 이름, 키, 몸무게");
                    bmi.setName (scanner.next ());
                    bmi.setCm (scanner.next ());
                    bmi.setKg (scanner.next ());
                    res = bmiService.getbmi (bmi);
                    break;        case "2":
                    res = "CALC";
                    System.out.println (CalcDTO.CALC + "\n 숫자1, 연산자, 숫자2 입력");
                    Cacl.setNum1 (scanner.nextInt ());
                    Cacl.setOpcode (scanner.next ());
                    Cacl.setNum2 (scanner.nextInt ());
                    res = calcService.getCalc (Cacl);
                    break;
                case "3":
                    res = "GOOGLE";
                    System.out.println (GoogleDTO.Google + "\n 검색어 입력");
                    Google.setSearch ();
                    res = googleService.getGoogle (Google);
                    break;
                case "4":
                    res = "GRADE";
                    System.out.println (GradeDTO.GRADE + "\n 이름, 국어, 영어, 수학 ");
                    Grade.setName (scanner.next ());
                    Grade.setKor (scanner.nextInt ());
                    Grade.setEng (scanner.nextInt ());
                    Grade.setMath (scanner.nextInt ());
                    res = gradeService.getgrade (Grade);
                    break;
                case "5":
                    res = "LOGIN";
                    System.out.println (LoginDTO.Login + "\n 아이디, 비번, 이름 ");
                    login.setName (scanner.next ());
                    login.setId (scanner.next ());
                    login.setPw (scanner.next ());
                    res = loginService.getlogin (login);
                    break;
                default:
                    res = "1~5 중 선택하세요";
                    break;

            }
            System.out.println (res);
        }

      /*  if (select.equals("1")){res = "BMI";}else
        if (select.equals("2")){res = "CALC";}else
        if (select.equals("3")){res = "SEARCH";}else
        if (select.equals("4")){res = "GRADE";}else
        if (select.equals("5")){res = "LOGIN";}
       */

    }
}