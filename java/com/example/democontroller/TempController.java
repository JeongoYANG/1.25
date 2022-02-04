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
                , "스택", "힙", "이분탐색", "탐욕법", "DP"};

        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";
        }

        System.out.println(s);
        System.out.println(" Q2. 팀장이 맡은 과제만 출력하세요. 예) 홍정명: 깊이, 스택 ");
        s = "";
        String l = "홍정명";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(l)) {
                for (int j = 0; j < 3; j++) {
                    s += arr[i + j * 5] + ",";
                }
            }
            if (i == 14) {
                break;
            }
            ;


        }
        System.out.println(s);
        System.out.println(" Q3 스택을 담당한 사람을 출력하세요. 예) 담당한 사람 : 홍정명 ");
        s = "";
        s = arr[10] + "을 담당한 사람: " + arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("스택을 담당한 사람")) {
            }
        }

        System.out.println(s);
        System.out.println(" Q4 팀원별 과제 수를 출력하세요 예) 홍정명(2개), 노홍주(2개), 양정오(2개), 전종현(2개), 정경준(2개)");
        s ="";
        String cm = "";
        cm += arr[0] +"(2개), ";
        cm += arr[1] +"(2개), ";
        cm += arr[2] +"(2개), ";
        cm += arr[4] +"(2개)";
        cm = "";
        int cm0 = 0;
        int cm1 = 0;
        int cm2 = 0;
        int cm3 = 0;
        int cm4 = 0;
        int[] intArr = new int[5];
        for(int i = 0; i< 5; i++){
            if(arr[i].equals(arr[5])){
                cm0++;
            }
            if(arr[i].equals(arr[6])){
                cm1++;
            }
            if(arr[i].equals(arr[7])){
                cm2++;
            }
            if(arr[i].equals(arr[8])){
                cm3++;
            }
            if(arr[i].equals(arr[9])){
                cm4++;
            }
            /*cm += arr[i] +"(2개), \n";*/
        }


        System.out.println(arr[0]+ "의 카운트는 " +cm0);
        System.out.println(arr[1]+ "의 카운트는 " +cm1);
        System.out.println(arr[2]+ "의 카운트는 " +cm2);
        System.out.println(arr[3]+ "의 카운트는 " +cm3);
        System.out.println(arr[4]+ "의 카운트는 " +cm4);

        System.out.println(" Q5 입력한 과목의 인덱스를 추출하세요 ");
        for (int i=0; i<arr.length; i++){
            if (arr[i].equals("정렬")){
                System.out.println("정렬의 인덱스: "+i);

            }
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


