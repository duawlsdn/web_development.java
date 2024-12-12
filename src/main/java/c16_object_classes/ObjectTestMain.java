package c16_object_classes;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest("염진우","부산광역시 부산진구");
//        objectTest1.displayInfo();
//
//        System.out.println(objectTest1.showInfo());

        // 객체 그 자체를 sout  시켰을 때
        System.out.println(objectTest1);
        // 이상과 같이 작성했을 때 현재(1212_2118기준)으로는 참조자료형이기 때문에 주소값만 나옴
        System.out.println(objectTest1.toString());
    }
}
