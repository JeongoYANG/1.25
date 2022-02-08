package com.example;

import com.example.Member.controller.MemberController;
import com.example.phone.controller.PhoneContorller;
import com.example.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        PhoneContorller phoneContorller = new PhoneContorller();
        QuizController quizController = new QuizController();
        MemberController memberController = new MemberController();
        while (true) {
            System.out.println("0.Exit, 1.Phone, 2.Quiz, 3.Member, 4.Algo,");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("0.Exit");
                    return;
                case "1" :
                    phoneContorller.execute(scanner);
                    System.out.println("1.Phone");
                    break;
                case "2" :
                    quizController.execute(scanner);
                    System.out.println("2.Quiz");
                    break;
                case "3" :
                    memberController.execute(scanner);
                    System.out.println("3.Member");
                    break;
                case "4" :
                    System.out.println("4.Algo");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }


    }


}
