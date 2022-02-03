package com.example.democontroller;

import com.example.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.democontroller
 * fileName   : TempController
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
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeDTO[] grades = new GradeDTO[2];
        for(int i = 0; i < grades.length; i++){
            grades[i] = new GradeDTO();
            System.out.println(" 이름 ");
            grades[i].setName(scanner.next());
            System.out.println(" 수학 ");
            grades[i].setMath(scanner.nextInt());
            System.out.println(" 국어 ");
            grades[i].setKor(scanner.nextInt());
            System.out.println(" 영어 ");
            grades[i].setEng(scanner.nextInt());
            System.out.println("==============");
        }
        for(int i = 0; i < grades.length; i++){
            System.out.println(" 이름 : "+grades[i].getName());
            System.out.println(" 수학 : "+grades[i].getMath());
            System.out.println(" 국어 : "+grades[i].getKor());
            System.out.println(" 영어 : "+grades[i].getEng());
            System.out.println("==============");
        }
    }
}
