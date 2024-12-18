package c19_generic.wildcards.wildcard_practice;

import lombok.ToString;

@ToString
public class Tiger extends Animal{

    // 상속 받은 메서드
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    // 호랑이 고유 메서드
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }

    // Human.java 들어가서 ToString 애너테이션 쓰시고, 오버라이드 해서
    // 사람이 두 발로 뜁니다. 하세요.
}
