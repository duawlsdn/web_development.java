package c16_object_classes;
/*
    모든 클래스는 Object 클래스를 상속 받는다. -> 우리가 정의한 것 말고 기존에 있는 class 들을 의미
 */
public class ObjectTest extends Object{
    private String name;
    private String address;

    // NoArgConstructor 정의
    public ObjectTest() {
    }

    // All
    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // setter / getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // displayInfo() 정의
    public void displayInfo(){
        System.out.println("이름 : " + getName() + "\n주소 : " + getAddress());
    }
    // 실행 예
    // 이름 : 염진우
    // 주소 : 부산광역시 부산진구

    // showInfo()를 정의하는 데 sout 말고 return 형으로 작성 main 콘솔에 출력
    public String showInfo(){
        String result = "이름 : " + name + "\n주소 : " + address;
        return result;
    }

    // 기본적으로 toString()이라는 메서드는 어떤 특정한 클래스의 인스턴스를 전부다 String 형태로 바꿔주는 것을 의미,
    // Object 클래스의 메서드를 @Override 했음을 확인 할 수 있음.
    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }
}
