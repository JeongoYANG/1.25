package com.example.bmi;

/**
 * packageName: com.example.bmi
 * fileName   : BmiApp
 * author     : yangjeongo
 * date       : 2022-01-25
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         yangjeongo        최초 생성
 */
public class BmiApp {
    public static String webSite = "      Bmi ";
    private String name;
    private String cm;
    private String kg;
    public String bmi (String name, String cm, String kg){
        this.name = name;
        this.cm = cm;
        this.kg = kg;
        String res = String.format("%s 정상", this.name);
        return res;
    }
}
