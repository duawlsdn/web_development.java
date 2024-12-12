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
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        c16_object_classes.Teacher teacher = (c16_object_classes.Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    // hashCode @Override
    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
}
