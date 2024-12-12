package c15_casting.centralcontroll;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("Speaker 의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Speaker 의 전원을 끕니다.");
    }

    // CentralControl에 다운캐스팅 해봐요
    public void changeMode(){
        System.out.println("음색을 바꿉니다.");
    }
}
