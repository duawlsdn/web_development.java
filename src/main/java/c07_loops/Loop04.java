package c07_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            while문

            형식 :

            while(조건문){
                실행문
            }
            1-5까지의 합을 구하는 for문 작성하세요.
         */
//        int result = 0;
//        for(int i = 0; i <6; i++){
//            result += i;
//        }
//        System.out.println(result);
//        int sum = 0;
//        int i = 0;
//        while(i<6){
//            sum += i;
//            System.out.println(sum);
//            i++; // i를 증가시켜서 무한루프에서 탈출시키고 합을 구하기 위함
//        }
//        System.out.println("최종합계 :" + sum);

        /*
            이상의 for문과 while문에서 확인 할 수 있듯이
            for문의 경우 :
                한계값을 설정하기 때문에 정확한 반복의 횟수를 알수 있음
                    -> 반복 횟수를 고정시킬 수 있을 떄 주로 사용
            while문의 경우 :
                외부에서 변수를 선언한 다음에 강제로 증가시키는 편이기 때문에 횟수를
                고려한 반복문에는 덜 적절함.
                대신, 특정 조건을 만족하는지 아닌지와 같이 횟수와 관계없는 경우
                while 반복문이 사용됨
         */
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        boolean continued = true;
        boolean endOfGame = false;
        // 범용적이고 읽기 쉬운 코드를 쓰기 위한 습관을 들이는 것이 중요
        // 그런데 초심자들의 경우 해당 코드가 읽기가 어려운 경우도 물론 존재하기 때문에
        // 차근차근 익숙해지도록 하겠습니다.
        while (!endOfGame) {
            System.out.print("계속하시겠습니까? >>>>");
            answer = scanner.nextInt();
            if (answer == 1) {
                endOfGame = true;
            }
        }

        while (continued) {
            System.out.print("계속하시겠습니까? >>>>");
            answer = scanner.nextInt();
            if (answer == 1) {
                continued = false;
            }
        }
    }
}
