package c12_arrays;
/*
    github 파일 업로드 방법

    git add .  = 파일을 저장소에 올릴 준비

    git status  = 어떤 파일이 변경되었는지 보여주는 명령어

    git commit -m "feat: 깃허브에 올리는 메모"

    git push  = 저장소에 "밀어올리는" 명령어
 */
import java.util.Arrays;

public class ArrayTest06 {
    public static void main(String[] args) {
        // 빈 배열 선언
        int[][] arr = new int[5][5];

        // 사용할 변수 선언
        int num = 0;

        // 1부터 25까지의 숫자를 arr 배열에 순서대로 값을 넣으시오.
//        [
//          [1, 2, 3, 4, 5],
//          [6, 7, 8, 9, 10],
//          [11, 12, 13, 14, 15],
//          [16, 17, 18, 19, 20],
//          [21, 22, 23, 24, 25]
//        ]
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = ++num;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
