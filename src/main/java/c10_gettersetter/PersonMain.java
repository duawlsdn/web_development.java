package c10_gettersetter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("염진우");
        Person person3 = new Person(-100);
        Person person4 = new Person("사실 나는 사람이 아니다",1000);

        // 접근 지정자 private 코드 삽입 후 에는 오류 발생,주석처리
//        System.out.println(person4.name);
//        System.out.println(person4.age);

//        person4.name = "사실은";  -> 이상을 이유로 name 필드에 직접 접근을 하여 값을 변경하는 것도 불가능

//        System.out.println(person4.getName());
//
//        person3.setAge(20);
//        System.out.println(person3.getAge());

//        person4.setName("김삼");
//        person4.setAge(135);
//        System.out.println(person4.getName());
//        System.out.println(person4.getAge());

        Person person5 = new Person("김사");
        person5.setAge(200);
    }
}
