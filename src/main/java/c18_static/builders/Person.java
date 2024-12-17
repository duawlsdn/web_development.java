package c18_static.builders;

public class Person {
    // 빌더 패턴에 대한 예시입니다. 전체 구조를 중점적으로 확인
    // 필드 선언(일부로 3개만 선언)
    private String name;
    private int age;
    private String address;

    // private 으로 생성자를 만듭니다. -> 즉, Main 에서 생성자를 통해서 객체 생성 못함
    // 여기서부터 차이점이 생기니 유의
    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    // Person 클래스의 내부 클래스로 Builder 클래스를 정의
    public static class Builder{
        // Builder 클래스 내부에 필드 선언
        private final String name; // -> final을 적용했을 때와 아닐 때의 예시를 둘다 표시
        private int age;
        private String address;

        // Builder 클래스의 생서자를 정의
        // name 에 final 를 적용했으므로 RequiredArgs 형태로 정의
        public Builder(String name){
            this.name = name;
        }

        // final 적용 안했을 때는 이하와 같이 작성하지면 됩니다 -> @Builder 를 이용했을 때 이렇게 나옵니다.
//        public Builder name(String name){
//            this.name = name;
//            return this;
//        }

        // 나머지 not final 인 선택적 필드 추가를 위한 메서드 추가
        // -> 통상적인 method 정의 방법과 달리 Person 클래스의 필드 이름을 메서드 명명
        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        // 최종 객체 생성 메서드
        public Person build(){
            return new Person(this);     // 이 단계까지 왔을 때 Person 의
                                                // 객체가 생성
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    // PersonMain.java 로 이동

    // 빌더 패턴말고 기존의 방식대로 생성자를 정의하는 내용.
    // 이하의 코드가 불편해서 빌더 패턴이 나옴

//    // 필드 선언
//    private String name;
//    private int age;
//    private String address;
//    private String phoneNumber;
//
//    // PersonMain.java 에서 2-1 문제에 해당하는 부분
//    public Person(String name, int age, String address, String phoneNumber) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//    }
//
//    // PersonMain.java 에서 2-2 문제에 해당하는 부분
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }
}
