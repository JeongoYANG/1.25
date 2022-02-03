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
        for(int i = 0; i< grades.length; i++){
            System.out.println(" 수학점수 입력 ");
            grades[i] = null;
            grades[i] = new GradeDTO();
            grades[i].setMath(scanner.nextInt());
        }
        for(int i = 0; i < grades.length; i++){
            System.out.println(" 수학점수 : "+grades[i].getMath());
        }


    }
}
