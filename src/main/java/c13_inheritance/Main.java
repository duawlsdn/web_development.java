package c13_inheritance;
/*
    c13_inheritance 패키지 생성
    클래스 생성목록
    Main
    Animal
    Tiger
    Human

    상속(inheritance)란?
        객체 지향 프로그래밍(OOP)의 핵심 개념 중 하나로 기존 클래스(부모, 슈퍼 클래스)의
        속성과 메서드를 재사용하여 새로운 클래스(자식, 서브클래스)를 만드는 것을 의미

    1. 왜 상속이 필요 한가?
        상속을 통해 공통적인 기능을 부모 클래스에 정의하고, 이를 '여러' 자식 클래스가 재사용할 수 있음
        ex) 동물(Animal) 클래스가 있고, 이를 상속받는 개, 고양이가 있다고 가정
        동물의 공통적인 특성(예: 이름, 나이)과 행동(예: 걷기, 먹기)을 부모 클래스에 정의하고
        개와 고양이는 각각 고유한 특성(예: 짖기, 울기)을 추가 할 수 있음.

        위의 과정을 거쳤을 때 얻을 수 있는 이점 : 중복된 코드를 작성하지 않아도 됨

        이전에는 Dog 클래스에 이름, 나이라는 필드를 선언하고, 걷기, 먹기 메서드를 정의한 후
        Cat 클래스에 이름, 나이 필드를 선언하고, 걷기, 먹기 메서드를 정의해야만 했다면,
        이제는 해당 부분에 대한 코드 중복을 줄일 수 있다는 점에서 상속의 의의가 있다

    2. 상속의 특징
        1) 단일 상속 : 자바는 단일 상속만 지원함. 하나의 클래스는 한 번에 하나의 부모 클래스만 상속 받을 수 있어 상속구조가 간단 명확
        2) super 키워드 : 클래스의 생성자 및 setter 에서 학습한 this 와 비슷한 개념으로 부모 클래스의 멤버에 접근하거나 부모 클래스의 생성자를 호출할때 사용
        3) 메서드 오버라이딩 : 자식 클래스에서 부모 클래스의 메서드를 '재정의' 할 수 있음
                            이를 통해 자식 클래스는 부모 클래스의 기본 동작을 자신만의 방식으로 변경 가능
        4) final 키워드 : 클래스나 메서드에 final 을 사용하면 상속이 제한됨
            final 클래스 : 상속 자제가 불가능
            final 메서드 : 메서드 오버라이딩 불가능

    3. 상속의 장점
        1) 코드 재사용성 : 동일한 코드를 반복적으로 작성하지 않아도 됨
        2) 유지보수의 용이성 : 부모 클래스의 변경 사항이 자식 클래스에 반영되기 때문에 수정이 용이
        3) 객체 간 관계 표현 : IS-A 관계를 명확히 나타냄
            IS-A 관계란 ex) '개'는 '동물'을 일종이다라는 의미로,
            IS-A는 is a kind of의 축약형
            즉, 우리가 현재 만든 클래스들을 기준으로 봤을 떄는
            'Tiger' 는 'Animal' 의 일종
            'Human' 은 'Animal' 의 일종 이라고 정의
 */
public class Main {
    public static void main(String[] args) {

        // Animal  클래스의 객체 생성
//        Animal animal1 = new Animal();
//        Animal animal2 = new Animal("바둑이");
//        Animal animal3 = new Animal(1);
//        Animal animal4 = new Animal("나비",2);

//        animal1.move();
//        animal2.move();
//        animal3.move();
//        animal4.move();

//        Tiger tiger1 = new Tiger("티거",3);
//        tiger1.move();

        Human human1 = new Human(); // 이 경우 "사람이 생성되었습니다" 출력
        human1.setAnimalName("염진우");
        human1.setAnimalAge(29);
        human1.move();

        Human human2 = new Human("김일");  // 이 경우 "사람이 생성되었습니다" 뜨지 않음
        human2.move();
    }
}
