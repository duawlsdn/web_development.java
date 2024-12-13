package c16_object_classes.equals_test;

import java.util.Objects;

public class Teacher {
    // 필드 설정
    private String name;
    private String schoolName;

    // All
    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    // get , set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // toString @Override
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    // equals @Override
    // equals() 는 주로 문자열끼리 동일한지를 확인하는 용도로 String 클래스에서 많이 사용되지만 해당 메서드 역시
    // Object 클래스에서 overriding 받은 것이다. -> 즉 String 클래스에서는 문자열끼리만 비교하는 용도로 '재정의'함.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;  // 매개변수가 object 클래스의 객체라는 것은 어떤 것이라도 들어올 수 있다는 의미
        // 이를 명시적 다운캐스팅을 통해 Teacher 의 인스턴스로 만들어줬음
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    // hashCode @Override
    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
