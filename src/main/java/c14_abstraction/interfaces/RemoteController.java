package c14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    /*
        AllArgsConstructor 를 정의하세요.
     */

    public RemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 메서드 정의
    // PowerButton 의 메서드 구현
    public void onPressedPowerButton() {
        powerButton.onPressed();            // 필드로 powerButton 객체를 지니고 있기 때문에
        // PowerButton 클래스에서 정의했던 메서드를 호출 가능
    }

    // ChannelDownButton 의 메서드 구현
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    // ChannelUpButton 의 메서드 구현
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        channelUpButton.onUp();
    }


    public  void onPressedVolumeDownButton(){
        volumeDownButton.onPressed();
    }

    public  void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }

    public  void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }

    public  void onUpVolumeUpButton(){
        volumeUpButton.onUp();
    }

}
