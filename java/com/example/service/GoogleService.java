package com.example.service;

import com.example.domain.GoogleDTO;


/**
 * packageName: com.example.google
 * fileName   : GoogleDemo.java
 * author     : yangjeongo
 * date       : 2022-01-25
 * desc       : 구글앱을 받아 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         yangjeongo        최초 생성
 */
public class GoogleService {
    public String getGoogle (GoogleDTO Google) {
        return String.format("%s를(을) 검색한 결과 입니다",Google.getSearch ());
    }
}
