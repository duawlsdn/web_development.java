package c18_static.builders;
/*
    1. 빌더 패턴(Builder Patten)이란?
        빌더 패턴은 객체의 생성 과정에서 '복잡한 생성자'를 대신하여 객체를 단계적으로 생성할 수 있도록
        도와주는 디자인 패턴. GOF(Gang of Four) 디자인 패턴 중 하나로, 객체 생성 시 가독성과 유연성을
        제공하는 것이 목표.

        주요 특징 :
            1) 객체를 생성하는 여러 개의 필드를 명시적으로 관리 할 수 있음
            2) 불필요한 생성자 오버로딩을 줄여 가독성을 높임
            3) 체이닝 메서드를 사용하여 객체를 직관적으로 사용

    2. 빌더 패턴이 생기게 된 원인
        1. 복잡한 생성자 문제
            객체의 필드가 많아질수록 생성자의 파라미터 수도 늘어남
            - Person.java 주석 확인
        2. 생성자 오버로딩 문제 = 생성자에 팔요헌 조합이 다를 경우 수많은 생성자를 만들어야 함
            -> 유지 보수에 악영향
        3. 가독성과 유지보수
            코드를 작성하고 읽는 입장에서 객체를 생성할 때 어떤 값이 어떤 필드에 해당하는지
            명확하지 않아 실수를 유발 할 수 있음.

        -> 이상을 이유로 빌더 패턴의 개념이 생겨났습니다. -> Person.java 에 작성 할 예정

    3.

    4.
 */
public class PersonMain {
    public static void main(String[] args) {
        // Person.java 에서 정의한 Builder Patten 을 이용하여 객체를 생성하는 방법
        Person person1 = new Person.Builder("김일")  // private final String name; 으로 정의
                .build();

        Person person2 = new Person.Builder("김이")
                .age(20)
                        .build();

        Person person3 = new Person.Builder("김삼")
                .address("서울 특별시 종로구")
                        .build();

        Person person4 = new Person.Builder("김사")
                .age(21)
                        .address("부산광역시 북구")
                                .build();

        Person person5 = new Person.Builder("김오")
                .address("강원도")
                        .age(24)
                                .build();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        // 기존 생성 방법의 경우
        // Person person1 = new Person("김일"); -> 생성자를 private 으로 했기 떄문에 불가능
        // Person person2 = new Person("김이");
        // person2.setAge(20);

        // Person person3 = new Person("김삼");
        // person3.setAddress("서울특별시 종로구");

    }
}
