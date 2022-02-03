package com.example.domain;


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
public class BmiDTO {
    public static String Bmi = "Bmi측정앱";
    private String name;
    private String cm;
    private String kg;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCm(){
        return cm;
    }
    public void setCm(String cm){
        this.cm = cm;
    }
    public String getKg(){
        return kg;
    }
    public void setKg(String kg){
        this.kg = kg;
    }
}