package c12_arrays;

import java.util.Arrays;

/*
    다차원 배열(Multi Dimensional Array)  중에 2차원 배열

    다차원 배열은 2차원 이상의 배열을 의미하지마, 개발 환경 상 2차원 배열 이상을 사용하는 경우는 극히
    드룸기 때문ㅇ ㅔ2차원 배열을 기준으로 강의

    형식 :

    int[][] arr = new int[크기][크기]                     선언 - 1
    int[][] arr2 = new int[크기][]                       선언 - 2
    int[][] arr3 = {{1, 2}, {3, 4}, {5, 6}}              선언 - 3

    2차원 배열 선언 시, 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야 합니다.
    -> 2번 방식 참조
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        int[][] arr3 = {{1, 2}, {3, 4}, {5, 6}};

//        System.out.println(arr3);
//        System.out.println(arr3[0]);
//        System.out.println(arr3[0][0]);

//        System.out.println(Arrays.toString(arr3)); // Arrays.toString()의 경우 1차 배열에만 적용

        // 배열의 각 요소를 출력하는 반복문을 작성하시오.
//        for(int i = 0 ; i < arr3.length; i++){
//            // 이상의 반복문을 사용할 경우 배열 내부의 배열들이 출력됨 -> 주소를 통해 / 값 X
//            System.out.println(arr3[i]);
//            // 이 문제를 해결하기 위해 이중 for문을 작성할 필요가 있음.
//            for(int j = 0; j < arr3[i].length; j++){
//                // 두번째 반복문에서 arr[i].length 의 의미가 중요합니다.
//                System.out.print(arr3[i][j] + " ");
//            }
//            System.out.println();
//            System.out.println("---실행문 3 영역에 첫번째 반복문 후 Arrays.toString() 메서드 활용---");
//            System.out.println(Arrays.toString(arr3[i]));
//        }

        // 2차 배열을 기준으로 할 때 첫번째 반복문을 작성할 경우 2차 배열의 요소인 1차 배열들이 나옴
        // -> 1차 배열이기 때문에 Arrays.toString() 으로 배열 전체 출력이 가능하다는 의미
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(Arrays.toString(arr3[i]));
//        }
//
//        // 1차원 배열의 출력 방식 Arrays.toString(배열이름)
//        System.out.println("Arrays.toString() : " + Arrays.toString(arr3));
//
//        // 다차원 배열의 출력 방식 Arrays.deepToString(배열이름)
        System.out.println("Arrays.deepToString() : " + Arrays.deepToString(arr3));

        // 2차원 배열을 prettyWriting 으로 작성
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int[][] arr3 = {            // 해당 배열의 크기는 int[3][2]
//                {1, 2},
//                {3, 4},
//                {5, 6}
//        };
    }
}
