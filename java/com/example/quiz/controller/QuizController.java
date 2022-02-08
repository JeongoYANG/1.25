package com.example.quiz.controller;

import com.example.quiz.service.QuizService;
import com.example.quiz.service.QuizServiceImpl;

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
    public void execute(Scanner scanner){
        Feb06controller feb06controller = new Feb06controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        Feb08controller feb08controller = new Feb08controller();
        Feb09controller feb09controller = new Feb09controller();

        while (true){
            System.out.println("0.Exit, 1).2월6일, 2).2월7일, 3).2월8일, 4).2월9일");
            switch (scanner.next()){
                case "0" :
                    System.out.println("0.Exit");
                    return;
                case "1" :
                    System.out.println("1).2월6일");
                    feb06controller.execute(scanner);
                    break;
                case "2" :
                    System.out.println("2).2월7일");
                    feb07Controller.execute(scanner);
                    break;
                case "3" :
                    System.out.println("3).2월8일");
                    feb08controller.execute(scanner);
                    break;
                case "4" :
                    System.out.println("3).2월9일");
                    feb09controller.execute(scanner);
                    break;

            }
        }
    }
}













