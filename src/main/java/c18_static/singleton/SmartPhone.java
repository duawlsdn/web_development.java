package c18_static.singleton;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class SmartPhone {
    // 필드 선언
    private String company;
    private String model;
    private String serial;

    // Factory.java 에서 대기
}
