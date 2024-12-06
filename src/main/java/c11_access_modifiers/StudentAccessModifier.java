package c11_access_modifiers;
/*
    접근지정자(Access Modifiers) :
        클래스, 메서드, (필드) 변수 등에 대한 접근 권한을 제어하는 데 사용됨

        종류 :
            1) public : 모든 클래스에서 접근할 수 있음
            2) protected : 같은 패키지 내의 클래스 및 이 클래스를 상속 받은 자식 클래스에 접근 가능
            3) default(package-private) : 접근 지정자를 명시하지 않으면 default 로 간주되며, 같은 패기지 내의 클래스에서만 접근 가능
            4) private : 같은 클래스 내에서만 접근 가능

 */
public class StudentAccessModifier {
    private int StudentCode;
    private String StudentName;
    private  double studentAvg;

    // 기본 생성자 / 매개변수 생성자 전부 선언하세요.

    // 필드 별 Setter / Getter 선언하세요.

    // 기본 생성자를 통해 StudentAccessModifierMain 에 student1 객체를 생성하세요.

    // 학번 20241205, 이름 , 평균 100.0을 대입

    // showInfo() 메서드를 public으로 정의
    // 실행 예
    // 안근수 학생의 학번은 20241205이며, 평균점수는 100.0 점입니다.

    // 기본 생성자 , alt + Ins 후에 아무런 필드를 선택하지 않는다는 것은 기본 생성자를 만들겠다는 의미
    // 해당 코드가 있는 이유는 기본적으로 기본 생성자가 default 이지만,
    // 하나라도 생성자를 정의하는 순간 기본 생성자가 역시 명시적으로 정의돼있어야 하기 때문
    // 기본생성자 : alt + Insert -> Select None

    StudentAccessModifier() {
    }

    // 매개변수 생성자
    public StudentAccessModifier(int studentCode) {
        StudentCode = studentCode;

    }

    // 매개변수 생성자
    public StudentAccessModifier(String studentName) {
        StudentName = studentName;
    }

    // 매개변수 생성자
    public StudentAccessModifier(double studentAvg) {
        this.studentAvg = studentAvg;
    }

    // 매개변수 생성자
    public StudentAccessModifier(int studentCode, String studentName, double studentAvg) {
        StudentCode = studentCode;
        StudentName = studentName;
        this.studentAvg = studentAvg;
    }

    // Getter
    public int getStudentCode() {
        return StudentCode;
    }

    public String getStudentName() {
        return StudentName;
    }

    public double getStudentAvg() {
        return studentAvg;
    }

    // Setter
    public void setStudentCode(int studentCode) {
        StudentCode = studentCode;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentAvg(double studentAvg) {
        this.studentAvg = studentAvg;
    }

    public void showInfo(){
        System.out.println(StudentName+" 학생의 학번은 "+StudentCode+"이며, 평균점수는 "+studentAvg+" 점입니다.");
    }

}
