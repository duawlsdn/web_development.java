package c15_casting.centralcontroll;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("Computer 의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Computer 의 전원을 끕니다.");
    }

    // 다운 캐스팅을 위한 Computer 클래스만의 고유 메서드
    public void computer(){
        System.out.println("컴퓨터가 계산을 수행합니다.");
    }
}
