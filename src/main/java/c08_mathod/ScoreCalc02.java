package c08_mathod;

import java.util.Scanner;

public class ScoreCalc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ScoreCalculator scoreCalculator = new ScoreCalculator();

        int totalSubjects = 1;
        double score1 = 0;
        double score2;
        double totalScore = 0;
        double avgScore = 0;
        boolean endOfCalc = false;

        while (!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            if (score1 == -1) {
                break;
            }
            totalScore = scoreCalculator.calculateSum21(totalScore, score1);

            avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);

            System.out.println("-----------입력시 마다 나오는 합계와 평균입니다-------------");
            if (totalSubjects > 0) {
                avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);
                System.out.println("입력한 점수의 합계 : " + totalScore + "점\n입력한 점수의 평균 : " + avgScore + "점");
            } else {
                System.out.println("입력한 점수가 없습니다.");
            }
            totalSubjects++;
            // while 문 내에서 반복적으로 실행한 후 반복문이 끝나기전 다시 돌아간다 가정을 할 시 while 문 밖으로 나가기 전 마지막 라인에 추가한다.(단, 초기값이 1이라는 가정하에)
        }
    }
}
