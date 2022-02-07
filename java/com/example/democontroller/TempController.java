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
        String[] arr = {"홍정명", "노홍주", "양정오", "전종현", "정경준",
                "깊이", "정렬", "그래프", "해시", "완전탐색"
                , "스택", "힙", "이분탐색", "탐욕법", "DP"};

        Scanner scanner = new Scanner(System.in);
        while(true){
            switch (scanner.next()){
                case "0":
                    System.out.println("시스템종료");return;
                case "1":
                    quiz1(arr);break;
                case "2":
                    quiz2(arr);break;
                case "3":
                    quiz3(arr);break;
                case "4":
                    quiz4(arr);break;

            }
        }
    }

    private static void quiz4(String[] arr) {
        System.out.println(" Q4 팀원별 과제 수를 출력하세요 ");
        int count = 0;
        String countManager = "";
        System.out.println (countManager);
        countManager += arr[0]+" (2개),";
        countManager += arr[1]+" (2개),";
        countManager += arr[2]+" (2개),";
        countManager += arr[3]+" (2개),";
        countManager += arr[4]+" (2개) ";
        countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i< arr.length; i++){
            if (arr[i].equals (arr[5])) {count0++;}
            if (arr[i].equals (arr[6])) {count1++;}
            if (arr[i].equals (arr[7])) {count2++;}
            if (arr[i].equals (arr[8])) {count3++;}
            if (arr[i].equals (arr[9])) {count4++;}
        }
        System.out.println (arr[0]+"의 카운트는 "+count0);
        System.out.println (arr[1]+"의 카운트는 "+count1);
        System.out.println (arr[2]+"의 카운트는 "+count2);
        System.out.println (arr[3]+"의 카운트는 "+count3);
        System.out.println (arr[4]+"의 카운트는 "+count4);

        System.out.println (countManager);

    }

    private static void quiz3(String[] arr) {
        String s;
        System.out.println(" Q3 스택을 담당한 사람을 출력하세요. 예) 담당한 사람 : 홍정명 ");
        s = arr[10] + "을(를) 담당한 사람 : " + arr[0];

        System.out.println(s);
    }

    private static void quiz2(String[] arr) {
        System.out.println(" Q2. 팀장이 맡은 과제만 출력하세요. 예) 홍정명: 깊이, 스택 ");
        String zzang = "";
        String l = "홍정명";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("홍정명")) {
                for (int j = 0; j < 3; j++) {
                    zzang += arr[i + j * 5] + ",";
                }
                if (i == 14) {
                    break;
                }
            }
        }
        System.out.println(zzang);
    }

    private static void quiz1(String[] arr) {
        System.out.println(" Q1. 팀별 과제를 출력하세요 ");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + "." + arr[i] + "\t";
            if (i == 14) {
                break;
            }
        }
        System.out.println(s);
    }

}








