package c15_casting.centralcontroll;

public class Tv implements Power{
    @Override
    public void on() {
        // 재정의
        System.out.println("Tv 의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Tv 의 전원을 끕니다.");
    }

    /*
        Computer.java 도 이상과 같이 처리
        Speaker, LED 클래스 생성
     */
}
