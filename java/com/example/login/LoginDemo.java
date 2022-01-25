package com.example.login;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println (LoginApp.LOGIN_APP);
        System.out.println ("id : ");
        System.out.println ("pw : ");
        System.out.println ("name : ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String result = loginApp.login(id, pw, name);
        System.out.println ("result");
    }
}