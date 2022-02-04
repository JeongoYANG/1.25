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
        System.out.println(" Q1. 팀별 과제를 출력하세요 ");
        String[] arr = {"홍정명", "노홍주", "양정오", "전종현", "정경준",
                "깊이", "정렬", "그래프", "해시", "완전탐색"
                , "스택", "힙", "이분탐색", "탐욕법", "DP",
                "너비", "", "", "", "",
                "큐"};

        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if(i%5 == 0){s += "\n";}
            s += i + ":" +arr[i] + "\t";
        }

        System.out.println(s);
        System.out.println(" Q2. 팀장이 맡은 과제만 출력하세요. 예) 홍정명: 깊이, 스택, 너비, 큐 ");
        String zzang = "";
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("홍정명")){
                zzang += "";}
            if(i < 5){}
            zzang += i + ":" + arr[0]+ ": " + arr[5] + ", " +  arr[10] +", "+  arr[15] +", "+  arr[20];
            if(i == 0){break;};



        }

        }
    }






        /*for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] +" : "+
                    arr[i + 5] +" , "+
                    arr[i + 10] +" , "+
                    arr[i + 15] +" , "+
                    arr[i + 20]);*/



        /*
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
        }*/


