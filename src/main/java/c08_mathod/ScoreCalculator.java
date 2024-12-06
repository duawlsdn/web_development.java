package c08_mathod;

public class ScoreCalculator {
    /*
        총합을 내는 메서드
        오버로딩을 해서 매개변수 개수를 늘려서 총합을 계산

        평균을 내는 메서드(Math.abs())
     */

    // 1. 총합을 내는 메서드 : call4() 유형으로 작성 ->  매개변수 / return값
    public double calculateSum2(double score1, double score2) {
        return  score1 + score2;
    }

    // calculateSum() 메서드를 오버로딩하여 매개변수가 3,4,5개인 메서드들을 만드시오
    public double calculateSum3(double score1, double score2, double score3) {
        return  score1 + score2+ score3;
    }

    public double calculateSum4(double score1, double score2, double score3,double score4) {
        return  score1 + score2+ score3 + score4;
    }

    public double calculateSum5(double score1, double score2, double score3, double score4, double score5) {
        return  score1 + score2+ score3 + score4 + score5;
    }

    public double calculateSum21(double totalScore, double score){
        return totalScore + score;
    }

    // 2. 평균을 내는 메서드 : call4() 유형으로 작성
    public double calculateAvg (double totalScore, int numberOfSubjects){
        return totalScore/ numberOfSubjects;
    }
}
