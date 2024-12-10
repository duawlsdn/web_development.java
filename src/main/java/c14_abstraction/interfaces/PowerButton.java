package c14_abstraction.interfaces;
/*
    아까전에 Button 클래스의 경우에는 인터페이스를 다중 상속 받았습니다.
    즉, Press, Up, Down 이 가지고 있는 각각의 특징을 Button 클래스에 모아놨다고 볼 수 있음
    이를 PowerButton, ChannelUpButton, ChannelDownButton 등으로 나누어 각각 Button 클래스를 상속 하도록 작성 예정
 */
public class PowerButton extends Button{

    private boolean status;

    @Override
    public void onPressed() {
        if(status){          // 25라인이 실행되기 위해서는 status = true 여야만 하므로,
            status = false;  // if문 내에는 전원을 끄는 명령어가 삽입 되어야 함.
            System.out.println("전원을 끕니다.");
        }else{
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }
}
