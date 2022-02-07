package com.example.democontroller;

import com.example.service.QuizService;
import com.example.service.QuizServiceImpl;

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
public class QuizController {
    public static void main(String[] args) {
        String[] arr = {"홍정명", "노홍주", "양정오", "전종현", "정경준",
                "깊이", "정렬", "그래프", "해시", "완전탐색"
                , "스택", "힙", "이분탐색", "탐욕법", "DP"};

        Scanner scanner = new Scanner(System.in);
        QuizService service = new QuizServiceImpl() {};
        while (true) {
            System.out.println("[MENU] 0.EXIT\n " +
                    "1. 팀별 과제 출력 \n" +
                    "2. 팀장이 맡은 과제만 출력 \n" +
                    "3. 큐를 담당한 사람을 출력 \n" +
                    "4. 팀원별 과제 수를 출력\n");
            switch (scanner.next()) {
                case "0":
                    System.out.println("시스템종료");
                    return;
                case "1":
                    service.quiz1(arr);
                    break;
                case "2":
                    service.quiz2(arr);
                    break;
                case "3":
                    service.quiz3(arr);
                    break;
                case "4":
                    service.quiz4(arr);
                    break;
            }
        }
    }
}













