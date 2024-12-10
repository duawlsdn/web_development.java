package c14_abstraction.interfaces;

public class VolumeUpButton extends Button{
    @Override
    public void onUp() {
        System.out.println("볼륨 계속 올리기");
    }

    @Override
    public void onPressed() {
        System.out.println("볼륨 한칸 올리기");
    }
}
