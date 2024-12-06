package c09_classes;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a1 = new ClassA();  // Scanner 때와 유사하다는 것을 확인
        // 이상의 코드는 여태까지 Scanner 에서 해왔지만 명시적으로 설명하지 않았던 객체 생성 방식에 해당

        a1.name = "염진우";    // 객체명.멤버변수명 = 데이터값 -> a1 객체의 멤버변수 name 에 "염진우"를 대입

        a1.callName();  // 객체명.메서드명() 르 통해 ClassA 클래스의 객체 a1의 메서드 활용

        // 새로운 객체 생성
        ClassA a2 = new ClassA();
        a2.name = "염진운";

        a2.callName();
    }
}
