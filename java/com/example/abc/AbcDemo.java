package com.example.abc;

import java.util.Scanner;

/**
 * packageName: com.example.abc
 * fileName   : AbcDemo
 * author     : yangjeongo
 * date       : 2022-01-26
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         yangjeongo        최초 생성
 */
public class AbcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbcApp abcApp = new AbcApp();
        String res = abcApp.getAbc();
        System.out.println(res);
    }
}
