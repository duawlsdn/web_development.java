package c07_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            기본예제
            n에 숫자를 입력 받아 몇번 반복할지 정하고, 1 부터  n까지 더하는 반복문을 작성하시오.

            실행 예
            몇번 반복할지 입력하세요>>> 100
            합은 5050입니다.
         */
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        System.out.print("몇 번 반복할지 입력하세요>>>>");
        n = scanner.nextInt();

        // 1번 풀이(++)
        for(int i = 0; i<n; i++){
            result1 += i+1;
        }
        System.out.println("합은 " + result1 + " 입니다.");

        // 2번 풀이(++)
        for(int i = 0; i< n+1; i++){
            result2 += i;
        }

        // 3번 풀이(++)
        for(int i = 0; i <= n; i++){
            result3 += i;
        }

        // 4번 풀이(--)
        for(int i = n; i > 0; i--){
            result4 += i;
        }
        System.out.println(result4);
    }
}
