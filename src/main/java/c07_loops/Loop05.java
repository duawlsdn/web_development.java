package c07_loops;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
        /*
        별찍기
        *
        **
        ***
        ****
        *****
         */

//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 한번 개행이 일어나긴 하지만 별 다섯개로 마무리 되는 코드
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 개행이 일어나지 않도록 하려면  i = 1로 고정시키면 됩니다.
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            숫자를 입력 받아 그 줄 수 만큼의 별찍기가 이루어질 수 있도록 작성하시오.

            실행 예

            숫자를 입력하세요>>>3
            *
            **
            ***
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요>>>");
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) { // or for(int j = 0; j < i+1; j++){
                // 실행문 2 -> 별이 찍히는 개수를 통제
                System.out.print("*");
            }
            // 실행문 3 -> 개행이 일어나는 것
            System.out.println();
        }

    }
}
