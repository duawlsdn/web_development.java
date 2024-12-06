package c09_classes;

/*
    여러 가지 생성자를 정의하세요.
    기본 생성자
    매개변수 생성자

    showInfo() 정의
    실행 예

    1. 기본 생성자 사용

    "해당 제품의 시리얼 넘버는 147548이고,
    제품명은 LG제이패드입니다."

    2. 시리얼 넘버 사용한 객체 생성

    해당 제품의 시리얼 넘버는 987654이고,
    제품명은 GS충전기입니다.

    3. 제품명을 사용한 객체 생성

    해당 젶품의 시리얼 넘버는 159357이고,
    제품명은 피치패드입니다.

    4. 시리얼 넘버 및 제품명을 사용한 객체 생성

    해당 제품의 시리얼 넘버는 4862이거,
    제품명은 블루미플립6입니다.

    ProductMain.java를 생성하고, 객체 생성하신 다음,
    1번-4번 해당 객체 생성방식이 다름, 1번 생성자를 사용하면 시리얼넘버,제품명을 입력하는 코드를 메인에 작성
 */
public class Product {
    // 필드 선언
    int productNum;
    String productName;

    // 기본생성자
    public Product() {
    }

    // 매개변수 생성자 -1(매개변수 하나)
    public Product(int productNum) {
        this.productNum = productNum;
    }

    // 매개변수 생성자 -2(매개변수 하나)
    public Product(String productName) {
        this.productName = productName;
    }

    // 매개변수 생성자 -3(매개변수 두 개)
    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    void showInfo(){
        System.out.println("해당 제품의 시리얼 넘버는 " + productNum + "이고,\n제품명은 " + productName + "입니다.");
    }
}
