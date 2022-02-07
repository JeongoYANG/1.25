package com.example.service;

import java.util.Scanner;
import java.util.Random;

/**
 * packageName: com.example.service
 * fileName   : Feb07Service
 * author     : yangjeongo
 * date       : 2022-02-07
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         yangjeongo        최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {
    Random random = new Random();

    @Override
    public void dice(Scanner scanner) {
        System.out.println("주사위 게임");
    }

    @Override
    public void rps(Scanner scanner) {
        System.out.println("가위바위보 게임");
    }

    @Override
    public void getPrime(Scanner scanner) {
        System.out.println("소수 구하기 게임");
    }

    @Override
    public void leapYear(Scanner scanner) {
        System.out.println("달력");
    }

    @Override
    public void numberGolf(Scanner scanner) {
        System.out.println("숫자 맞추기 게임");
        int num = random.nextInt(100) + 1;
        while (true) {
            int value = scanner.nextInt();
            if (num == value) {
                System.out.println("정답 입니다.");
                break;
            } else if (num < value) {
                System.out.println("정답이 아닙니다. 난수가 더 작습니다.");
            } else {
                System.out.println("정답이 아닙니다. 난수가 더 큽니다");
            }
        }
    }
}


