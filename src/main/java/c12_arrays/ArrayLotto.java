package c12_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayLotto {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lottoNumbers = new int[6];
        int count = 5;
        boolean duplicate = false;
        int number = 0;
        String logo = """
                ____ ____ ____ ____ ___\s
                |L | |O | |T | |T | |O |
                |__| |__| |__| |__| |__|

                """;
        System.out.println(logo);
        System.out.println("로또 번호 추첨기에 오신것을 환영 합니다.");
        System.out.println("이번 로또 추천 번호는 다음과 같습니다.");

        while (count > 0) {
            for (int i = 0; i < lottoNumbers.length; i++) {
                duplicate = false;
                // 배열에 값을 대입하기 전에 임시 변수인 number 에 대입 후 중복 확인하고
                // 중복되지 않는다면 이후에 lottoNumber 배열에 데이터 대입
                number = random.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {  // 한계값 j < lottoNumbers.length 를 사용X
                    // 중복을 확인하는 코드
                    if (lottoNumbers[j] == number) {
                        duplicate = true;
                        break;
                    }
                }

                // 중복이 되지 않으면 if 부분이 실행돼서 배열에 값을 대입
                // 중복이 된다면 else 부분이 실행됨 -> 이 경우 다시 한번 random.nextInt()를 실행해야 하기 때문에
                // i 를 하나 감소했다.
                if (!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
                Arrays.sort(lottoNumbers);
                System.out.println(Arrays.toString(lottoNumbers));
                count--;
            }
        }
    }
}
