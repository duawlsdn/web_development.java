package c15_casting.centralcontroll;

public class LED implements Power{
    @Override
    public void on() {
        System.out.println("LED 의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED 의 전원을 끕니다.");
    }

    public void changColor(){
        System.out.println("색깔을 바꿉니다.");
    }

}
