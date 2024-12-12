package c15_casting.centralcontroll;

import java.util.Arrays;

public class CentralControl {

    // 필드 선언
    private Power[] deviceArray;    // 필드를 배열로 선언한 경우가 처음이기 때문에
    // 좀 주목해서 보도록 하겠습니다.

    // 매개변수 생성자
    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // Main 에 각 클래스의 객체들을 하나씩 생성 -> CentralControl 제외
    // Computer computer1 = new Computer();

    // 전자제품들을 배열에 CentralControl 의 객체의 필드인 배열에 추가해주는 메서드
    public void addDevice(Power device) {
        // checkEmpty() 는 조금 있다가 정의
        // 개발 환경에서는 만들다보면 추가적으로 메서드 구현이 필요한 경우가 있어
        // 일부러 checkEmpty()를 먼저 작성한 후 addDevice()를 작성하는게 아니라
        // 순서를 지금과 같이 하게 되었습니다.

        int emptyIndex = checkEmpty();      // checkEmpty()의 리턴값이 addDevice 에서 이용되는 '함수형 프로그래밍'

        if (emptyIndex == -1) {   // java 에서는 마이너스인덱스 개념이 없기 때문에 checkEmpty()
            // 메서드에서 -1을 반환시킨 이유는
            // 비어있는 배열이 없다는 의미이기 때문에 다음과 같이 작성
            System.out.println("더 이상 장치를 연결 할 수 없습니다.");
            return;             // 해당 메서드를 종료한다는 의미로 return; 을 사용함 ';'에 주목
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName());
        // 객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력됨
        // 객체명.getClass().getSimpleName() -> 클래스명만 출력
    }

    public int checkEmpty() {    // 비어있는 배열의 index 를 반환 할 거기 때문에
        // 그리고 그 비어있는 배열의 index 에 addDevice()를 통해
        // 새로운 전자제품을 등록하는 방식으로 코딩할 예정
        // 배열 내부를 탐색하여 비어있는 '첫 번째' 인덱스를 리턴할 예정
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {  //  deviceArray[i] 에 값이 없다면
                return i;
            }
        }
        return -1;
    }

    // 배열 내부에 있는 elements 들의 전원을 전부 켜고, 끄는 메서드 구현
    public void powerOn() {
        // 배열 내부에 있는 요소들(객체들 - Power의 자식 클래스들의 객체)의 공통된 메서드인 .on()을
        // 실행시킬 예정
        // 해당 경우에 생겨날 수 있는 문제점 :
        //         특정 배열 인덱스 내에 아무 객체가 없다면 .on()을 적용시켰을 경우 컴파일 에러가 나기
        //          때문에 해당부분을 감안한 코드 작성
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                // 특정 인덱스 넘버의 element 가 null 값이라면
                continue;           // 해당 반복문파트는 종료하고 다음 반복문 인덱스로 넘기겠다는 의미
            }
            deviceArray[i].on();        // continue 가 실행되지 않았다면 해당 라인의 코드가 실행되도록 작성
        }
    }

    // 전원 버튼을 끄는 메서드 powerOff()를 구현하세요.
    public void powerOff() {
        for (int i = 0; i < deviceArray.length; i++) {
            // 비어있으면 지나가고, 아니면 꺼야함.
            if (deviceArray[i] == null) {
                continue;
            }
            deviceArray[i].off();
        }
    }

    // 향상된 for 문을 이용하여 powerOff2() 메서드 구현 -> Main 에서 powerOff2() 실행
    public void powerOff2() {
        // 자료형 변수명(객체명) : 반복가능객체(배열)
        for(Power device : deviceArray){
            if(device == null){
                continue;
            }
            device.off();
        }
    }

    // displayInfo()에 해당하는 메서드 작성 -> 배열의 요소를 하나씩 뽑아내는 것도 가능하고, 배열 전체를 출력
    // 코드 내부에 sout을 구현하겠다는 의미 -> void 이기 때문
//    public void displayInfo1() {
//        // 내부에 sout 구현
//        // 배열이 가득차지 않았을 경우 대비
//        // 각 요소들을 하나씩 뽑게 될 예정 그 경우 null 값을 만나게 되면 컴파일 오류
//        // 배열 내부의 요소를 하나씩 뽑게 되는 방식이 뭐였는지 떠올리셔야 합니다.
//        for (int i = 0; i < deviceArray.length; i++) {
//            if (deviceArray[i] == null) {
//                continue;
//            }
//            System.out.println("현재 연결 된 장치 목록 : " + deviceArray[i].getClass().getSimpleName());
//        }
//    }

    public void displayInfo2() {
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                System.out.println("슬롯[" + i + "]번 : 비어 있음");
                continue;
            }
            System.out.println("슬롯[" + i + "]번 : " + deviceArray[i].getClass().getSimpleName() );
        }
    }
    public void displayInfo3(){
        // 배열 전체 출력하는 메서드
        System.out.println("현재 연결 된 장치 목록 : ");
        System.out.println(Arrays.toString(deviceArray));
    }

    // 배열 내부를 돌면서 요소의 고유 메서드들을 호출 하는 예제 메서드
    public void performSpecificMethod(){
        for(Power device : deviceArray){
            if(device instanceof Computer){
                // deviceArray 내부에 있는 요소라면 기본적으로 Power 인터페이스의 객체
                // (그런데 인터페이스는 객체 생성 불가능)이거나 혹은
                // Power 인터페이스를 상속 받은 클래스의 객체에 해당
                // 이상의 코드는 배열 내부의 요소가 Computer 클래스의 인스턴스라면 다운 캐스팅을 실행
                Computer computer = (Computer) device;  // 실행이 된다면 Computer 클래스로 다운 캐스팅
                // 이제 객체명 computer 는 Computer 클래스의 인스턴스 이므로 Computer 클래스에 정의된
                // 고유 메서드를 실행 가능
                computer.computer();
            }else if(device instanceof Mouse){
                Mouse mouse = (Mouse) device;
                mouse.leftClick();  // LED 클래스에 changColor() 메서드 정의
                                    // sout("색깔을 바꿉니다.")라고 한 후에 다운 캐스팅

            }else if(device instanceof LED){
                LED led = (LED) device;
                led.changColor();
            }
        }
    }
}
