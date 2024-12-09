package c12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    while 반복문을 돌려서 5번 로또 번호 추출을 가능하게 하는 프로그램 작성

    1-45 까지의 숫자를 임의로 생성한 후, lottoNumbers 라는 배열에 저장
    로또 번호 6 -> index 가 6개인 배열이  : 게임 한번
                  5개 만들어 져야 함. -> 총 5000원치

    중복 제거와 관련된 부분이 걸릴 수 있습니다. -> getter / setter 학습한 부분 확인

    실행 예

    ' 여기 부분에 로또 로고 출력해주세요.'

    로또 번호 추첨기에 오신것을 환영합니다. 5 게임을 시작합니다. -> '5' 는 String 이 아닐 것
    이번 로또 당첨 번호는 다음과 같습니다.


 */
public class ArrayTest07 {
    public static void main(String[] args) {
        // 필요한 객체 생성
        // random.nextInt(a)의 의미 : 0 부터 a-1 까지의 int를 임의적으로 생성함.
        Random random = new Random();

        // 필요한 변수 선언
        int[] lottoNumbers = new int[6];
        int count = 5;          // 횟수에 해당하는 count 변수
        boolean duplicate = false; // duplicate : 중복이라는 의미 // false 일 경우에만
                                    // lottoNumbers 배열에 element 를 추가하면 됭
        int numbers = 0;

//        lottoNumbers[0] = random.nextInt(45)+1;
//        lottoNumbers[1] = // 대입 전에 중복 체크
//        lottoNumbers[2] = random.nextInt(45)+1;
//        lottoNumbers[3] = random.nextInt(45)+1;
//        lottoNumbers[4] = random.nextInt(45)+1;
//        lottoNumbers[5] = random.nextInt(45)+1;

//        System.out.println("이 부분에 로고를 출력");
//        System.out.println("로또 번호 추첨기에 오신것을 환영 합니다.");
//        System.out.println("이번 로또 추천 번호는 다음과 같습니다.");

        for(int i = 0; i < count; i ++) {
            lottoNumbers[i] = random.nextInt(45) + 1;
            numbers = random.nextInt(45) + 1;
            if (lottoNumbers[i] == numbers) {
                lottoNumbers[i] = random.nextInt(45) + 1;
            } else {
                lottoNumbers[i] += 0;
            }
        }
        System.out.println(Arrays.toString(lottoNumbers));

    }
}
