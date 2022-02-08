package com.example.Member.domain;

public class LoginDTO {
    public static String Login = "로그인 앱";
    private String id;
    private String pw;
    private String name;

    public static String PASSWORD = "abc";
    public String getId(){return id;}
    public void setId(String id){this.id = id;}
    public String getPw(){return pw;}
    public void setPw(String pw){this.pw = pw;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}



   /* switch (pw){
        case "abc" : res = String.format(" %s 님의 비밀번호 %s 가 맞습니다. 로그인 성공 ",name,pw); break;
        default: res = String.format(" %s 님의 ID 는 맞고, 비밀번호 %s 가 틀립니다. 로그인 실패 ",id,pw);
    }*/



    /*
    if (pw.equals("abc")){
        res = String.format(" %s 님의 비밀번호 %s 가 맞습니다. 로그인 성공 ",name,pw);}
    else{
       res = String.format(" %s 님의 ID 는 맞고, 비밀번호 %s 가 틀립니다. 로그인 실패 ",id,pw);}
   }*/


}