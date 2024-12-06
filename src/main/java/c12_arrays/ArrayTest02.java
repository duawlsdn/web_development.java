package c12_arrays;
/*
    String[] names 배열을 선언하고
    출석부의 이름을 입려하도록 하여, names 배열에 집어 넣는 프로그램을 작성

    실행 예
    몇 명의 학생을 등록하겠습니까? >>>> 12
    1 번 학생 이름 : 강미경
    2 번 학생 이름 : 권상재
    3 번 학생 이름 : 김영환
    4 번 학생 이름 : 김은수
    5 번 학생 이름 : 박경호
    6 번 학생 이름 : 박수빈
    7 번 학생 이름 : 염진우
    8 번 학생 이름 : 이시후
    9 번 학생 이름 : 이하온
    10 번 학생 이름 : 장시원
    11 번 학생 이름 : 황지선
    12 번 학생 이름 : 옥진서

    [ 출력 결과 ]
    1. 강미경
    2. 권상재
    3. 김용환
    4. 김은수
    5. 박경호
    6. 박수빈
    7. 염진우
    8. 이시후
    9. 이하온
    10. 장시원
    11. 황지선
    12. 옥진서

    -> count 에 선언된 수  만큼 학생 이름을 입력할 수 있도록 반복문을 작성
 */

import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 몇 개짜리 방의 배열을 만들 것인가를 count 변수에 초기화
        int count = 0;
        String name;

        // 배열의 크기 결정 짓기 위해서
        System.out.print("몇 명의 학생을 등록하겠습니까? >>>>");
        count = scanner.nextInt();
        // 위에서 .nextInt()를 사용했고, 밑에 학생 이름을 입력받을 예정이기 떄문에
        scanner.nextLine(); // 배리어를 미리 작성

        // String 배열 선언 및 초기화
        String[] names = new String[count];

        // count 만큼 입력 받았기 때문에 count = names.length
        for(int i = 0; i < count; i++){
            System.out.print(i+1 + "번 학생 이름 : ");
            names[i] = scanner.nextLine();
        }
        System.out.println("[출력 결과]");
        for(int i = 0; i < names.length; i++){
            System.out.println(i+1+". "+names[i]);
        }


    }
}
