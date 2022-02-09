package com.example.quiz.controller;

import com.example.quiz.service.Feb08Service;
import com.example.quiz.service.Feb08ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.quiz.controller
 * fileName   : TestController
 * author     : yangjeongo
 * date       : 2022-02-09
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         yangjeongo        최초 생성
 */
public class TestController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb08Service feb08Service = new Feb08ServiceImpl();
        feb08Service.baseball(scanner);
    }
}
