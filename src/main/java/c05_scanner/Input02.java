package c05_scanner;

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("x 입력 : ");
//        int x = scanner.nextInt();
//        System.out.print("y 입력 : ");
//        int y = scanner.nextInt();
//        System.out.println("x + y = " + (x+y)); // 올바른 연산 출력
//        System.out.println("x + y = " + x+y);  // x,y가 String 취급 받아 틀린 연산 출력

        /*
            평균 계산기를 작성하시오.
            지시 사항
            1. 사용자로 부터 세 개의 실수를 받아, 이 숫자들의 평균 및 합을 계산하고 출력
            2. 사용자에게 첫번째 실수를 입력받으세요.
            3. 사용자에게 두번째 실수를 입력받으세요.
            4. 사용자에게 세번째 실수를 입력받으세요.
            5. 총합과 평균을 계산하고 출력하세요.

            실행 예
            첫번째 실수를 입력받으세요 >>> 100
            두번째 실수를 입력받으세요 >>> 80
            세번째 실수를 입력받으세요 >>> 60

            총합 : 240
            평군 : 80
         */

        System.out.print("첫번째 실수를 입력 받으세요>>>");
        double num1 = scanner.nextDouble();
        System.out.print("두번째 실수를 입력 받으세요>>>");
        double num2 = scanner.nextDouble();
        System.out.print("세번째 실수를 입력 받으세요>>>");
        double num3 = scanner.nextDouble();
        System.out.println();
        System.out.println("총합 : " + (num1+num2+num3));
        System.out.println("평균 : " + ((num1+num2+num3)/3));


    }
}
