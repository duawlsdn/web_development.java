package c14_abstraction.interfaces;

public class TemperatureUpButton extends Button {
    @Override
    public void onUp() {
        System.out.println("온도를 계속 올립니다.");
    }

    @Override
    public void onPressed() {
        System.out.println("온도를 한칸 올립니다.");
    }
}
