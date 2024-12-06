package c06_condition;

import java.util.Scanner;

public class Condition02 {
    public static void main(String[] args) {
        /*
            else if는 여러 조건이 나올 수 있음 즉,
            if(조건식1){
                실행문1
            }else if(조건식2){
                실행문2
            }else if(조건식3){
                실행문3
            }else{
                실행문4
            }

            점수를 입력하면 점수대에 맞는 등급을 산출하는 프로그램을 작성하시오.
            100~90 : A
            89~80 : B
            79~70 : C
            69~60 : D
            59이하 : F

            실행 예
            점수를 입력하세요>>> 80
            당신의 등급은 B 입니다.
         */
        Scanner scanner = new Scanner(System.in);

        // 1) 변수 score 하나인 버전
        // 조건식에는 변수로 시작하는 것이 권장됨
        // 이상/이하보다는 초과/미만을 선호
        System.out.print("점수를 입력하세요>>>");
        int score = scanner.nextInt();
//        if (score > 89) {
//            System.out.println("당신의 등급은 A 입니다.");
//        } else if (score > 79) {
//            System.out.println("당신의 등급은 B 입니다.");
//        } else if (score > 69) {
//            System.out.println("당신의 등급은 C 입니다.");
//        } else if (score > 59) {
//            System.out.println("당신의 등급은 D 입니다.");
//        } else {
//            System.out.println("당신의 등급은 F 입니다.");
//        }

        // 2) score 변수와 String grade; 2개를 이용한 버전
        String grade;

        if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 등급은 " + grade + "입니다.");

        // 상수를 사용한 데이터를 제공했을 때 이에 맞춰서 조건문을 작성하시오
//        final int VIP_POINT = 80;
//        final int GOLD_POINT = 60;
//        final int SILVER_POINT = 40;
//        final int BRONZE_POINT = 20;
//
//        int point;
//        System.out.print("회원 포인트를 점수를 입력하세요>>>");
//        point = scanner.nextInt();
//        System.out.println("변수 하나인 과정");
//        System.out.println("--------------------------------");
//
//        // 변수 하나 짜리 작성하시오.
//        if(point >= VIP_POINT){
//            System.out.println("당신의 포인트는 " + point + ", 등급은 VIP 입니다.");
//        }else if(point >= GOLD_POINT){
//            System.out.println("당신의 포인트는 " + point + ", 등급은 GOLD 입니다.");
//        }else if(point >= SILVER_POINT){
//            System.out.println("당신의 포인트는 " + point + ", 등급은 SILVER 입니다.");
//        }else if(point >= BRONZE_POINT){
//            System.out.println("당신의 포인트는 " + point + ", 등급은 BRONZE 입니다.");
//        }else{
//            System.out.println("일반 회원 입니다.");
//        }
//        System.out.println("--------------------------------");
//        System.out.println("변수 두개인 과정");
//        System.out.println("--------------------------------");
//
//        // 변수 두개 짜리 작성하시오.
//        String grade;
//        if(point >= 80){
//            grade = "VIP";
//        }else if(point >= 60){
//            grade = "GOLD";
//        }else if(point >= 40){
//            grade = "SILVER";
//        }else if(point >= 20){
//            grade = "BRONZE";
//        }else{
//            grade = "일반";
//        }
//        System.out.println("당신의 점수는 " + point + " 점이며, 등급은" + grade + " 입니다.");
    }
}
