package c08_mathod;

import java.util.Scanner;

/*
    Method02.java 파일을 확인, 별찍기 관련 if문을 변형(이유 : 가독성이 떨어짐)
    if-else문을 -> switch문으로 변형 (리팩토링 : repectoring
 */
public class Method03 {
    public static String getStar(int menuSelect, int totalLine) {
        String result = "";

        switch (menuSelect) {
            case 1:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 2:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i - 1; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < i + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 3:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 4:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < totalLine - i; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            default:
                System.out.println("잘못된 입력입니다.");
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowOfStars;
        int choice = 0;

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");

        System.out.print("메뉴 선택 : ");
        choice = scanner.nextInt();

        while (choice < 1 || choice > 5) {
            System.out.print("다시 메뉴를 선택하세요.>>>");
            choice = scanner.nextInt();
        }

        System.out.print("별의 줄 수 입력 : ");
        rowOfStars = scanner.nextInt();

        System.out.println("[호출 하신 결과입니다.(Refactorting)]");

        String stars = getStar(choice, rowOfStars);
        System.out.println(stars);
    }
}
