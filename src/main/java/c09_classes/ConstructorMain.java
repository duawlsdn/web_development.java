package c09_classes;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor0 = new Constructor(); // 기본 생성자는 자동 생성되기 때문에 정의 하지 않아도 된 경우

        // constructor0 의 필드에 대입
        constructor0.num = 38;
        constructor0.name = "안근수";
//
//        Constructor constructor1 = new Constructor(37);
//
//        // 이름과 나이르 constructor1에 대입
//        constructor1.num = 29;
//        constructor1.name = "염진우";
//
//        System.out.println(constructor0.name);
//        System.out.println(constructor0.num);
//        System.out.println("---------------------");
//        System.out.println(constructor1.name);
//        System.out.println(constructor1.num);

        System.out.println("2024.12.03 수업시작 부분");
//        Scanner scanner = new Scanner(System.in);

        int age = 0;
        String name;

//        Constructor constructor2 = new Constructor(); // 기본 생성자를 통한 객체 생성
//        System.out.print("당신의 나이를 입력하세요 >>>> ");
//        constructor2.num = scanner.nextInt(); // Scanner로 입력받은 데이터를 곧장 객체의 필드에 대입하는 방식
//        scanner.nextLine(); // nextInt() 쓰는 바람에 enter 누르면 넘어감 -> 배리어용 nextLine() 삽입
//        System.out.print("당신의 이름을 입력하세요 >>>> ");
//        constructor2.name = scanner.nextLine();
//
//        System.out.println("당신의 이름은 " + constructor2.name + "이고\n당신의 나이는 " + constructor2.num + "입니다.");
//
//        // 위에서 name 변수와 age 변수를 사용해서 직접 생성자를 만든다면,
//        System.out.print("당신의 나이를 입력하세요 >>>> ");
//        age = scanner.nextInt();
//        Constructor constructor3 = new Constructor(age); // 사전에 입력 받은 데이터를 매개 변수 생성자의 arugment로 사용한 방식
//        System.out.println(constructor3.num);

        // Constructor(String title)을 이용한 객체 생성
//        Constructor constructor4 = new Constructor("김일");
//        constructor4.num = 20;
//        System.out.println(constructor4.name);
//        System.out.println(constructor4.num);

        // Constructor(int num, String name)을 이용한 객체 생성
        Constructor constructor5 = new Constructor(21,"김이");
        System.out.println(constructor5);
        constructor5.showInfo();
        System.out.println(constructor5.toString());
    }
}
