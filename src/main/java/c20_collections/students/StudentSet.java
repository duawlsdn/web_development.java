package c20_collections.students;

import java.util.*;

public class StudentSet {
    public static void main(String[] args) {
        // students 라는 Set 을 만드세요.
        Set<Student>  students = new HashSet<>();

        // Set 내부에 데이터르 입력하세요.
        students.add(new Student(20250001,"강미경"));
        students.add(new Student(20250002,"권상재"));
        students.add(new Student(20250003,"김은수"));
        students.add(new Student(20250004,"박수빈"));
        students.add(new Student(20250005,"염진우"));
        students.add(new Student(20250006,"이승혁"));
        /*
            20250001    강미경
            20250002    권상재
            20250003    김은수
            20250004    박수빈
            20250005    염진우
            20250006    이승혁
         */
        // 전체 Set 을 출력
        System.out.println(students);

        // 정렬을 하기 위해 List 를 선언하세요. -> studentList
        List<Student> studentList = new ArrayList<>();

        // 비어있는 List 에 Set 의 값들을 전부 대입
        studentList.addAll(students);

        // List 에서 오름차순으로 정렬
        // 정렬된 List 출력


        // 20250001 학번을 지닌 학생 객체를 Set 에서 삭제
//        for(Student student : students){
//            if(student.getId() == 20250001){
//                students.remove(student);
//                break;
//            }
//        }
//        System.out.println(students);
//
//        // 20250002 학번을 지닌 학생의 이름을 이진혁 으로 바꾸세요.
//        for(Student student : students){
//            if(student.getId() == 20250002){
//                student.setName("이진혁");
//                break;
//            }
//        }
//        System.out.println(students);
//
//        // 20250003 학번을 지닌 학생의 이름을 출력
//        for(Student student : students){
//            if(student.getId() == 20250003){
//                System.out.println(student.getName());
//                break;
//            }
//        }
//
//        // 박수빈 님의 학번을 출력
//        for(Student student : students){
//            if(student.getName().equals("박수빈")){
//                System.out.println(student.getId());
//                break;
//            }
//        }

        // 종합
        for(Student student : studentList){
            if(student.getId() == 20250001){
                students.remove(student);
                System.out.println("20250001 학번 삭제 리스트 : " + students);
                System.out.println();
            }else if(student.getId() == 20250002){
                student.setName("이진혁");
                System.out.println("20250002 학번의 학생의 이름 변경 : " + student);
                System.out.println();
            }else if(student.getId() == 20250003){
                System.out.println("20250003 학번의 학생의 이름 출력 : " + student.getName());
                System.out.println();
            }else if(student.getName().equals("박수빈")){
                System.out.println("박수빈 님의 학번 : " + student.getId());
                System.out.println();
            }
        }

        students.addAll(studentList);
        System.out.println("List 출력 : " + studentList);
        System.out.println("Set 출력 : " + students);
        // 이상의 코드에사 가 중복으로 나왔던 점을 알수 있습니다.
        // 참조자료형이기 때문에 생겨 날 수 있는 문제로 테스트 전까지 확인 불가능

        // 중복 제거
        // 비어있는 Set 하나 다시 선언해서 거기다가 studentList 의 데이터를 다 넣으면 됩니다. 예를들어
        // students2.addAll(studentList) 형태로 하면 중복 없이 데이터가 저장

        students.clear();
        students.addAll(studentList);
        System.out.println("재대입 set : " + students);

        // List 에서 오름차순으로 정렬

        // 정렬된 List 출력

        // 정렬이 적용된 List 하나 선언
        // 순서를 정렬할 int 하나 선언
        int dorderId = 20250000;
        List<Student> sortedStudents = new ArrayList<>();
        for(int i = 0; i < students.size(); i++){   // size() 는 Set 의 사이즈대로 반복
            dorderId++;
            for(Student student : students){
                if(student.getId() == dorderId){    // 객체의 필드인 id 가 20250001부터 해서 오른차순 정렬
                    sortedStudents.add(student);    // 해당 실행문이 실행됐다면 위의 조건문이 true 를
                }                                   // 하기 때문에 순서대로 List 에 저장될 예정입니다.
            }
        }
        System.out.println("정렬된 List : " + sortedStudents);

    }
}
