package com.example.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.quiz.service
 * fileName   : Feb09ServiceImpl
 * author     : yangjeongo
 * date       : 2022-02-10
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-10         yangjeongo        최초 생성
 */
public class Feb09ServiceImpl implements Feb09Service{
    @Override
    public void bobbleSort() {

    }

    @Override
    public void insertionSort() {

    }

    @Override
    public void selectionSort() {

    }

    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =0,ct=0;
        int [][]ar = new int[n][n];

        while(ct<(n*2)-1){
            for(int a=0; a<n; a++){
                for(int b=0; b<n; b++){
                    if(a+b==ct){
                        if(ct%2==0){
                            ar[a][b] = ++num;
                        }else{
                            ar[b][a] = ++num;
                        }
                    }
                }
            }
            ct++;
        }
        for(int a=0; a<n; a++){
            for(int b=0; b<n; b++){
                System.out.printf("%2d ",ar[a][b]);
            } System.out.println("");
        }
    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
