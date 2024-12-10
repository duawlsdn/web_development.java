package c14_abstraction.interfaces;
/*
    인터페이스는 일반 클래스와 달리 다중 상속이 가능하다고 수업
    그렇기 때문에 일반 클래스의 상속 명령어도 다릅니다.
    extends(일반 클래스 상속) / implements(인터페이스 상속시)
 */
public abstract class Button implements Press, Up, Down{
    @Override
    public  void onDown(){};

    @Override
    public  void onUp(){};

    @Override
    public void onPressed(){};
}
