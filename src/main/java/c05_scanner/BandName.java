package c05_scanner;

import java.util.Scanner;

public class BandName {
    public static void main(String[] args) {
        // Scanner class를 import -> 콘솔창에 입력을 하기 위해
        Scanner scanner = new Scanner(System.in);

        // 변수 선언 -> 초기화하지 않음
//        String name;
//        String age;
//        String school;
//        String mbti;
//
//        System.out.print("이름이 무엇입니까? >>>");
//        // 변수 초기화
//        name = scanner.nextLine();
//        System.out.print("몇 살입니까? >>>");
//        age = scanner.nextLine();
//        System.out.print("학교가 어디입니까? >>>");
//        school = scanner.nextLine();
//        System.out.println("MBTI는 어떻게 됩니까?? >>>");
//        mbti = scanner.nextLine();
//
//    1)System.out.print("제 이름은 " + name + "이고, 나이는 " + age + "살입니다.\n" + school + "에 졸업 하였으며, MBTI는 " + mbti + "입니다.");
//        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
//        System.out.println(school + "에 졸업 하였으며, MBTI는 " + mbti + "입니다.");

        // pantsColor, lastFood 변수를 선언 -> String

        // 입력 받기 위한 안내문을 작성하고, 변수에 데이터를 대입하세요.
        // 지급 입은 하의 색깔이 무엇인가요?
        // 마지막으로 먹은 음식이 무엇인가요?

        // pantsColor와 lastFood를 이용하여 밴드 네임을 출력하세요.
        // 당신의 밴드 이름은 그레이 시리얼입니다.

        // 1. 변수 선언,초기화 같이
//        System.out.println("pantsColor와 lastFood를 이용하여 밴드 네임을 출력하세요.");
//        System.out.println("지급 입은 하의 색깔이 무엇인가요? >>>");
//        String pantsColor = scanner.nextLine();
//        System.out.println("마지막으로 먹은 음식이 무엇인가요?");
//        String lastFood = scanner.nextLine();
//        System.out.println("당신의 밴드 이름은 " + pantsColor +" "+ lastFood + " 입니다.");

        // 2. 변수 선언 따로 초기화 따로
        String Logo = """
                                   \s
                ,---.              |
                |---.,---.,---.,---|
                |   |,---||   ||   |
                `---'`---^`   '`---'
                                   \s
                """;
        String pantsColor;
        String lastFood;

        System.out.println(Logo);
        System.out.println("지급 입은 하의 색깔이 무엇인가요? >>>");
        pantsColor = scanner.nextLine();
        System.out.println("마지막으로 먹은 음식이 무엇인가요?");
        lastFood = scanner.nextLine();
        System.out.println("당신의 밴드 이름은 " + pantsColor + " " + lastFood + " 입니다.");


    }
}
