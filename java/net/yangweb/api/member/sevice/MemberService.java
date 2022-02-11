package net.yangweb.api.member.sevice;

/**
 * packageName: net.yangweb.api.commom.service
 * fileName   : MemberService
 * author     : yangjeongo
 * date       : 2022-02-11
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         yangjeongo        최초 생성
 */
public interface MemberService {
    String memId(MemberService memId);
    String memName(MemberService memName);
    int memNumber(MemberService memNumber);
    String addr(MemberService addr);
    String phone1(MemberService phone1);
    String phone2(MemberService phone2);
    int height(MemberService height);
    String debutDate(MemberService debutDate);
}
