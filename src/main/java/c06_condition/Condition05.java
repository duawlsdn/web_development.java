package c06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        // 사용하는 외부 클래스 명시
        Scanner scanner = new Scanner(System.in);

        // 사용될 변수명 명시
        int score;
        int changedScore;
        String grade = "";

        System.out.print("당신의 점수를 입력하세요>>>>");
        score = scanner.nextInt();
        changedScore = score / 10;
        // int changedScore가 올바른 값이 출력되는지 확인하기 위한 test code
//        System.out.println(changedScore);
        /*
            changedScore = 10 ghrdms 9 이면 A
            changedScore = 8 ghrdms B
            changedScore = 7 ghrdms C
            changedScore = 6 ghrdms D

            실행 예
            당신의 점수는 __ 이거, 학점은 __ 등급 입니다.
         */
        if (score < 0 || score > 100) {
            System.out.println("점수를 잘못입력하셨습니다.");
            grade = "X";
        } else {
            switch (changedScore) {
                case 10:
//                    grade = "A";
//                    break;
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
//                case 5 : 50점대 까지는 커버가 되지만, 40 ~ 1점까지의 영역에서 오류발생함
                default:
                    grade = "F";
                    break;
            }
            System.out.println("당신의 점수는 "+ score +"점 이고, 학점은 " + grade +" 등급 입니다.");
        }
    }
}
