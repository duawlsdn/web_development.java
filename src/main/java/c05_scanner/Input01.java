package c05_scanner;

import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        /*
            .nextInt() -> 입력값을 int로 고정해야 함
            .nextDouble() -> 입력값을 숫자로 쓰기만 하면 실수 형태로 전환
            .nextLine() -> 개행이 생기는 시점을 기준으로 String 데이터를 출력
            .next() -> 띄어쓰기를 포함하지 않는 String 데이터를 반환
         */
        // .nextLine()과 .next()의 비교
        Scanner scanner = new Scanner(System.in);
        //
        System.out.print("이름을 입력하세요>>>");
        String name1 = scanner.next();
        // .next()를 쓰게 되는 경우 공백을 기준으로 데이터를 나누고, 그 후 enter를 사용하게 되면
        // .nextLine()에서 데이터를 입력받지 못하게 됨, 이를 막기 위해 배리어를 필요로 함
        scanner.nextLine(); // -> 엔터키를 한번 막아주는 비어있는 .nextLine()
        String name2 = scanner.nextLine();
        System.out.println("당신의 이름은 : " + name1 + ", " + name2);
    }
}
