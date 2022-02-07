package com.example.democontroller;

import com.example.service.Feb07Service;
import com.example.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.democontroller
 * fileName   : Fed07Controller
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
public class Feb07Controller {
    /*
     * nt num = (int) (Math.random() * 6) +1;
     * 1. 주사위
     * 2. 가위바위보
     * 3. 입력받은 두 수 사이의 소수 구하기
     * 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기
     * 5. 임의로 입력받은 숫자 맞추기
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb07Service service = new Feb07ServiceImpl();

        while (true){
            String s = "";
            System.out.println("(MENU) 0.Exit, 1.Dice, 2.Rps 3.GetPrime, 4.LeapYear, 5.NumberGolf,");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit,");
                    return;
                case "1" :
                    System.out.println("Dice");
                    service.dice(scanner);
                    break;
                case "2" :
                    System.out.println("Rps");
                    service.rps(scanner);
                    break;
                case "3" :
                    System.out.println("GetPrime");
                    service.getPrime(scanner);
                    break;
                case "4" :
                    System.out.println("LeapYear");
                    service.leapYear(scanner);
                    break;
                case "5" :
                    System.out.println("NumberGolf");
                    service.numberGolf(scanner);
                    break;
                default: s = "0 ~ 5 중 선택하시오";
            }
            System.out.println(s);
        }
    }
}
