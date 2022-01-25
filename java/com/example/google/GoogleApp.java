package com.example.google;

/**
 * packageName: com.example.google
 * fileName   : GoogleApp.java
 * author     : yangjeongo
 * date       : 2022-01-25
 * desc       : 검색결과를 보여주는 구글 앱
 * 클래스변수 : GOOGLE LOGO 구글로고
 * 파라미터, 인스턴스변수 : search 검색결과
 * 로컬변수 : res 검색결과
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         yangjeongo        최초 생성
 */
public class GoogleApp {
    public static String webSite = "Google";
    private String search = "";

    public String google (String search){
        this.search = search;
        String res = "검색 결과는 %s 입니다";
        return String.format(res, this.search );
    }
}
