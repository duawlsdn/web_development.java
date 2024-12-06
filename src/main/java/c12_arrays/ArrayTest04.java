package c12_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    여태까지 배운 자바 자체 클래스

    Scanner
    Random
    Arrays
    Integer
    Comparator

    Math.random() 메서드
    Java 에서 난수를 생성하기 위해 Math.random() 메서드를 사용 할 수 있음
    0.0 - 1.0 미만의 난수를 반환

    1. index 가 10 개인 배열을 만들고 Math.random()을 이용하여 값을 집어 넣으시오 -> 1 ~ 10 까지의 int 배열을 만들기
    2. 값이 입력된 배열을 출력할 것
    3. 해당 배열의 합을 구할 것
    4. 짝수만 추출해서 합을 구할 것
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        int answer = 0;
        int answer1 = 0;
//        double a = Math.random();
//        System.out.println(a);
//
//        // 이상의 메서드를 응용해서 0~9까지의 int 가 출력되도록 작성
//        int b = (int)(Math.random()*10);
//        System.out.println(b);
//
//        // 이상의 메서드를 응용해서 1~10까지의 int 가 출력되도록 작성
//        int c = (int)(Math.random()*10+1);
//        System.out.println(c);

        // 사용할 변수 선언
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] += (int) (Math.random() * 10) + 1;
            answer += arr[i];
            if (arr[i] % 2 == 0) {
                answer1 += arr[i];
            }
        }
        Arrays.sort(arr);
        // 값이 입력된 배열 출력
        System.out.println("배열 : " + Arrays.toString(arr));
        System.out.println("총 합 : " + answer);
        System.out.println("짝수의 총 합 : " + answer1);

        // 이상에서 확인할 수 있듯 반복문의 구조가 데이터 입력 당시/ 합을 구할 때/ 짝수 합을 구할 때 동일
    }
}
