package net.yangweb.api.buy.sevice;

/**
 * packageName: net.yangweb.api.commom.service
 * fileName   : BuyService
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
public interface BuyService {
     int num(BuyService num);
     String memId(BuyService memId);
     String prodName(BuyService prodName);
     String groupName(BuyService groupName);
     int price(BuyService price);
     int amount(BuyService amount);
}
