package c06_condition;

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        /*
            if문 -> 조건식을 제시하고, 그것이 참이라면 중괄호({}) 내의 실행문을 실행함.
            아닐 경우에는 else if 혹은 else를 사용할 수도 있음

            형식 :

            if(조건문){

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요>>>");
        int num = scanner.nextInt();

        // 1) if만 사용 했을 때의 예제
//        if(num > 0){
//            System.out.println("num은 양수 입니다.");
//        }
        // 2) if - else  구조 예제
//        if(num >= 0){
//            System.out.println("num은 양수이거나 0 입니다.");
//        }else{ // else는 if가 false일 때 실행되는 최종 조건문이므로 조건식이 포함되지 않음
//            System.out.println("num은 음수 입니다.");
//        }
        // 3) if - else if - else 구조의 예제
        if (num > 0) {
            System.out.println("num은 양수 입니다.");
        } else if (num == 0) { // if문의 조건식이 false 일 경우 차후 조건 : 순서가 중요함
            System.out.println("num은 0 입니다.");
        } else {
            System.out.println("num은  음수 입니다.");
        }

    }
}
