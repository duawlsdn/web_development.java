package c09_classes;

public class CarMain {
    public static void main(String[] args) {
        // 클래스명 객체명 = new 클래스명();
        Car myCar = new Car();
        myCar.color = "빨강";
        myCar.speed = 89;
        myCar.drive();

        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.speed = 0;
        yourCar.stop();
    }
}
