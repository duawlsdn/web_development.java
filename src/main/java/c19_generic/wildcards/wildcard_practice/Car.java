package c19_generic.wildcards.wildcard_practice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
    private String model;

    // 논리적인 상속관계를 무시하고 AnimalData 에서 Car 의 객체를 생성하고 싶다면
    // public class Car extends Animal 로 작성, move() 메서드 오버라이드
    // c13-16,19 번 참고
}
// Main.java 으로 이동
