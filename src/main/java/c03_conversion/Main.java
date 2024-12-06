package c03_conversion;

public class Main {
    public static void main(String[] args) {
        // date type의 변환 -> 용량 상의 문제로 일어나는 이슈를 해결하기 위해.
        // upcasting(업 캐스팅 : 더 큰 용량의 자료형으로 변환 시키는 것)
        // 1) upcasting
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 형변환을 하기 위해서는 '(바꿀데이터타입) 변수명' 을 작성한다.
        System.out.println("변형 : " + (int) cast1); // A = 65 ,  아스키코드

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int) cast2); // a = 97
        // 2) upcasting의 두번째 방법
        char cast3 = 'b';
        // upcasting을 진행할 변수를 '새로운 자료형 변수형 = 기존 변수;' 형태로 작성
        int cast4 = cast3;
        System.out.println(cast3);
        System.out.println(cast4);

        // downcasting (다운 캐스팅 : 더 작은 용량의 자료형으로 변환시키는 것)
        int cast5 = 99;
        System.out.println(cast5);
        // downcasting의 첫번째 방법
        System.out.println((char) cast5);

        // downcasting의 두번째 방법ㅊ
        char cast6 = (char)cast5;
        System.out.println(cast6);


    }
}
