package c14_abstraction.interfaces;

public class AirConditionerController {

    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;

    public AirConditionerController(PowerButton powerButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }

    public void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }

    // ChannelUpButton 의 메서드 구현
    public void onPressedTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }

    public void onUpTemperatureUpButton() {
        temperatureUpButton.onUp();
    }
}
