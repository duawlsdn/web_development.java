package c13_inheritance;

public class Tiger extends Animal{    // 클래스명 extends 부모클래스 명령어를 통해 상속 가능

    // 기본 생성자
    public Tiger() {
    }

    // 매개변수 생성자 super() 키워드를 이용
    public Tiger(String animalName) {
        super(animalName);
    }
    public Tiger(int animalAge) {
        super(animalAge);
    }
    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    // Animal 에서 정의한 메서드를 오버라이드할 예정
    // @Override(오버라이드) : 부모 클래스의 메서드를 가져와 해당 자식 클래스에 맞게 '재정의'하는 것
    @Override
    public void move(){
        super.move();   // super()의 경우는 생성자
                        // super.메서드명() 의 경우 부모 클래스의 메서드를 호출

        // 재정의 영역
        System.out.println("네 발로 걷습니다.");
    }
}
