package c16_object_classes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("염진우","코리아아이티");
        Teacher teacher2 = new Teacher("염진우","코리아아이티");

        // teacher1 객체의 클래스 정보 얻기
        Class tClass = teacher1.getClass();
//
//        System.out.println(tClass); // class c16_object_classes.Teacher -> 결과 값
//
//        System.out.println(tClass.getSimpleName()); // Teacher -> 결과 값
//        System.out.println(teacher1.getClass().getSimpleName());
//
//        System.out.println(teacher1); // Teacher{name='염진우', schoolName='코리아아이티'}

        // 클래스의 모든 필드(Field) 정보 출력하는 반복문
        Field[] fields = tClass.getDeclaredFields();
//        for(int i = 0; i < fields.length; i++){
//            System.out.println(fields[i].getName());                    // 필드명 출력
//            System.out.println(fields[i].getType().getSimpleName());    // 필드의 타입(자료형) 출력
//            System.out.println();
//        }
        // 위의 일반 for문을 향상된 for문으로 작성하시오.
//        System.out.println("---- Field 관련 ----");
//        for(Field field : fields){
//            System.out.println(field.getName());
//            System.out.println(field.getType().getSimpleName());
//            System.out.println();
//        }

        // 클래스의 모든 메서드(Methods) 정보를 출력하는 반복문
        Method[] methods = tClass.getDeclaredMethods();
//        System.out.println("---- Method 관련 ----");
//        for(int i = 0; i < methods.length; i++){
//            System.out.println(methods[i].getName());
//            System.out.println(methods[i].getReturnType());
//            System.out.println();
//        }

//        for(Method method : methods){
//            System.out.println(method.getName());
//            System.out.println(method.getReturnType());
//            System.out.println();
//        }
        // 이하의 코드의 경우 배열 전체를 출력할 경우 사람이 보기에 가독성이 떨어지기 때문에
        // 위와 같이 반복문을 통해 각 요소를 출력하는 방식을 택함
//        System.out.println(Arrays.toString(fields));
//        System.out.println();
//        System.out.println(Arrays.toString(methods));

        System.out.println(teacher1.getClass() == teacher2.getClass()); // true -> 각 개체가 동일한 클래스에서 생된 객체인지 확인
        System.out.println(teacher1 instanceof Teacher);                // true -> teacher1 이 Teacher 클래스의 객체인지 확인

        c16_object_classes.equals_test.Teacher teacher3 = new c16_object_classes.equals_test.Teacher("염진우", "코리아아이티");
        // teacher3 의 경우 다른 경로에 있는 Teacher 클래스의 인스턴스
//        System.out.println(teacher3 instanceof Teacher);
        // 이상의 코드의 경우 Teacher 가 .equals_test 패키지에 있는 클래스가 아니라
        // c16_object_classes 에 있기 때문에 오류 발생함

        System.out.println(teacher1.getClass() == Teacher.class);   // true
        System.out.println(teacher2.getClass() == Teacher.class);   // true
        System.out.println("teacher3에 대한 정보 입니다.");
//        System.out.println(teacher3.getClass() == Teacher.class); // 위와 동일한 이유로 오류발생
    }
}
