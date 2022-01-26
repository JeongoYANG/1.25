package com.example.grade;

import java.util.Scanner;

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
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("kor");
        int kor = scanner.nextInt();
        System.out.println("eng");
        int eng = scanner.nextInt();
        System.out.println("math");
        int math = scanner.nextInt();
        String grade = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(grade);

    }
}
