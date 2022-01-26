package com.example.login;

public class LoginApp {

    String id = "";
    String pw = "";
    String name = "";
    static String PASSWORD = "com/example/abc";


    public String login (String id,String pw,String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        String res = "";

        /*if (PASSWORD.equals(pw)){
            res = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", this.id, this.pw);
        }
        else{
            res = String.format(" %s 님의 ID는 맞고, 비번 %s 가틀립니다. 로그인 실패 ", this.id, this.pw);
        }*/

        /*switch (pw){
            case "abc" : res = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", this.id, this.pw); break;
            default : res = String.format(" %s 님의 ID는 맞고, 비번 %s 가틀립니다. 로그인 실패 ", this.id, this.pw);
        }*/
        res = (pw.equals(PASSWORD)) ? String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", this.id, this.pw)
                : String.format(" %s 님의 ID는 맞고, 비번 %s 가틀립니다. 로그인 실패 ", this.id, this.pw);

        return res;

    }
}