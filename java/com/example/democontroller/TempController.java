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

        
        System.out.println(" Q2. 팀장이 맡은 과제만 출력하세요. 예) 홍정명: 깊이, 스택 ");

        System.out.println(" Q3 스택을 담당한 사람을 출력하세요. 예) 담당한 사람 : 홍정명 ");

    }
}


