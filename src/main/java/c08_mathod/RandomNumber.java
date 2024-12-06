package c08_mathod;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        // import  할 클래스 목록
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 사용할 변수 목록
        int a;
        int b;

        System.out.print("a에 입력할 값을 정하세요. >>> ");
        // 이하의 코드에서 주목해야 하는 점은 method 의 이름입니다.
        // 서로 다른 클래스에서 동일한 메서드가 발견된다는 것은,
        // 결과적으로 .nextInt()라는 메서드가 어느 클래스에 종속되어 있느냐에 따라 서로 다른 결과값을 가진다는 것을
        // 의미합니다. 그러므로 클래스명 혹은 객체명의 경우 해당 클래스가 무엇인지 명확하게 밝혀주는 이름을 사용해야 합니다.
        a = scanner.nextInt();  // scanner 의 nextInt() 메서드는 argument 를 요구하지 않음.
        b = random.nextInt(a);  // random 의 nextInt() 메서드의 경우 '한계값'이라는 argument 를 요구함.

        System.out.println("a의 값 : " + a + "\nb의 값 : " + b);
    }
}
