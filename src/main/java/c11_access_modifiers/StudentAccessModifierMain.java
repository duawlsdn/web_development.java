package c11_access_modifiers;

public class StudentAccessModifierMain {
    public static void main(String[] args) {
//        StudentAccessModifier student1 = new StudentAccessModifier();
//
//        student1.setStudentName("염진우");
//        student1.setStudentCode(20241205);
//        student1.setStudentAvg(100.0);
//
//        student1.showInfo();

        // 새로운 객체를 student01로 생성하는데, 생성시에 이름을 "이름"으로 만들어주세여
        // 클래스명 객체명 = new 매개변수생성자("이름")
        StudentAccessModifier student01 = new StudentAccessModifier("염진우");

        // 점수는 4.5, 학번은 10101로 입력하세요. -> 아직 없는 값에 데이터 대입
        student01.setStudentCode(10101);
        student01.setStudentAvg(4.5);

        // "이름"을 "이일"로 고치세요. -> 기존에 있는 값을 데이터에 재 대입
        student01.setStudentName("이일");

        // 고친 이름을 콘솔창에서 확인하기 위해 getter를 사용하세요 -> return 으로 정의돼있어 출력문을 명시해야함
        System.out.println(student01.getStudentName());

        // 이름이 "이일"로 고쳐졌다면, .showInfo()를 통해 전체 정보를 콘솔에 출력
        // showInfo()의 경우 메서드 내에 sout 으로 처리했기 때문에 getter 정보를 출력할 때와
        // 코드가 다릅니다. 주의!!!!!
        student01.showInfo();


    }
}
