package com.example.naver;

/**
 * packageName: com.example.naver
 * fileName   : NaverApp
 * author     : yangjeongo
 * date       : 2022-01-25
 * desc       : 아이디 비번을 입력해 네이버에 로그인하는 앱
 * 클래스변수 : Naver logo 네이버 로고
 * 파라미터, 인스턴스변수 : ID아이디 PW비번
 * 로컬변수 : res 아이디 %s 환영합니다
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         yangjeongo        최초 생성
 */
public class NaverApp {
    public static String webSite = " Naver ";
    private  String Id = "";
    private String Pw = "";

    public String naver (String Id, String Pw){
        this.Id = Id;
        this.Pw = Pw;
        String res = " Id %s 환영합니다 ";
        return String.format(res, this.Id, this.Pw);
    }
}
