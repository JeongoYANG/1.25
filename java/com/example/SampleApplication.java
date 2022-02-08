package com.example;

import com.example.quiz.controller.Feb07Controller;
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
        phoneContorller.execute(scanner);
        QuizController quizController = new QuizController();
        quizController.execute(scanner);
        while (true) {
            System.out.println("0.Exit,  2.Feb07, 3.Phone, 4.Quiz, 5.Member, 9.Algo,");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("0.Exit");
                    return;
                case "2" :
                    System.out.println("2.Feb07");
                    break;
                case "3" :
                    System.out.println("3.Phone");
                    break;
                case "4" :
                    System.out.println("4.Quiz");
                    break;
                case "5" :
                    System.out.println("5.Member");
                    break;
                case "9" :
                    System.out.println("9.Algo");
                    break;
            }
        }


    }


}
