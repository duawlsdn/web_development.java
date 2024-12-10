package c14_abstraction.abstract_classes;
/*
    abstract : 추상적인

    추상클래스
    1. 추상 메서드가 하나라도 포함되면 해당 클래스는 추상 클래스로 정의돼야 한다.
    2. 추상 클래스는 생성할 수 없다.   -> 객체 생성이 불가능함을 의미
    3. 그 외의 다른 특징은 일반 클래스와 동일함
    4. 상속을 전제로 하는 클래스 이다.

    추상 클래스 : 추상 메서드가 하나 이상인 클래스
    추상 메서드 : 선언만 있고, 구현은 없는 메서드

    추상 클래스의 장점 :
        코드의 재사용성을 높이고 설계를 보다 명확하게 할 수 있도록 도와준다.

    추상 클래스의 목전
        1. 공통괸 기능 제공 : 여러 클래스에서 공통적으로 사용하는 기능을 추상 클래스에서 정의할 수 있다.
        2. 구체적인 구현 강제 : 추상 메서드를 통해 서브 클래스가 반드시 특정 메서드를 구현하도록 강제할 수 있다.
        3. 코드의 재사용성 : 중복되는 코드를 줄이고, 유지 보수성을 높일 수 있다.

    추상 클래스에서 주의할 점 :
        - 추상 클래스는 객체를 생성할 수 없다.

    super 키워드 - 슈퍼 클래스의 멤버 및 메서드에 접근하기 위해서 사용
        1. 서브 클래스에서 슈퍼클래스로 생성자를 호출할 때 사용 -> super(매개변수)
        2. 서브 클래스에서 슈퍼클래스로 메서드를 호출할 때 사용 -> super.메서드명()

        생성할 클래스 목록
        Factory.java       -> 얘가 디자인 패턴 중  Factory 형태는 아닙니다.
        PhoneFactory.java  -> Factory 상속 받으시오.
        TabletFactory.java -> Factory 상속 받으시오.

    부모클래스(super classes) 광범위
    자식클래스(sub classes) 세부적, 그리고 내부에 부모 클래스 보다 클래스나 메서드가 더 많다
 */
public class Main {
    public static void main(String[] args) {
        Factory factory1 = new Factory("일반 공장") {
            @Override
            public void produce(String model) {

            }

            @Override
            public void manage() {

            }
        };   // -> 추상 클래스에서 직접적으로 객체를 만들려고 하면 익명 클래스를 통해 생성됨
             // 추후 수업 예정
        // 폰 팩토리 객체 및 태블릿팩토리 객체 생성
        PhoneFactory phoneFactory1 = new PhoneFactory("애플 스마트폰 공장");
        TabletFactory tabletFactory1 = new TabletFactory("애플 태블릿 공장");

        phoneFactory1.produce("아이폰16");
        phoneFactory1.produce("아이폰16 프로");

        tabletFactory1.produce("아이패드 프로 13인치 7세대");

        System.out.println();

        phoneFactory1.manage();     // Factory.java 에 있던 추상 메서드를 manage 를
                                    // override 해서 재정의한 PhoneFactory 만의 메서드

        tabletFactory1.manage();

        System.out.println();
        phoneFactory1.printInfo();       // 슈퍼 클래스의 일반 메서드를
        tabletFactory1.printInfo();      // 서브 클래스의 객체가 호출함
    }
}
