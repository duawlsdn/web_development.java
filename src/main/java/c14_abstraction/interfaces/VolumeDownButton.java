package c14_abstraction.interfaces;

public class VolumeDownButton extends Button{
    @Override
    public void onDown() {
        System.out.println("볼륨 계속 내리기");
    }

    @Override
    public void onPressed() {
        System.out.println("볼륨 한칸 내리기");
    }
}
