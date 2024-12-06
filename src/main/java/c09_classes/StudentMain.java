package c09_classes;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(2015,"염진우","B");

        student.showInfo();

        Student02 student02 = new Student02("이이");
        Student02 student03 = new Student02(123456);
        Student02 student04 = new Student02(516548, "이삼");
        Student02 student05 = new Student02(65184,"이사",100.0);
    }
}
