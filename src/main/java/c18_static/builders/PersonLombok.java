package c18_static.builders;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class PersonLombok {
    // 필드 선언
//    private String name;
    private final String name;
    private int age;
    private String address;
}
