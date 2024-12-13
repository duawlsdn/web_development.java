package c16_object_classes;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("안근수",20241213);
        Student student2 = new Student("염진우",20240000);

        System.out.println("지시 사항 4 번 : " +student1.equals(student2));
        System.out.println("지시 사항 3 번 : " +student1.hashCode());
        System.out.println("지시 사항 3 번 : " +student2.hashCode());
        System.out.println("지시 사항 6 번 : " +student1);
        System.out.println("지시 사항 6 번 : " +student2);
    }
}
