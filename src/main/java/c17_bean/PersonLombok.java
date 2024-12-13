package c17_bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/*
    12월 21일 스프링 수업 들어갈 때 다시 할 예정
    project 생성시에 maver / intellij / gradle 중에서 gradle 선택
    -> build.gradle 파일 만들어짐
    -> wrap groovy 로 만들어야 했는데 Kotlin 으로 만들어버리는 바람에
    -> build.gradle.kits 형태로 만들어져서 늦어짐

    lombok '의존성 주입' -> 마찬가지로 의존성 주입에 대한 개념은 spring 에서 배움
    chrome 에서 mvn 검색 -> https://mvnrepository.com/
    lombok 검색 -> 가장 상위 패치 선택
    현재 저희가 한 방식 gradle(Kotlin)파트 클릭해서 복사
    build.gradle.kits 에서

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        compileOnly("org.projectlombok:lombok:1.18.36")
        annotationProcessor("org.projectlombok:lombok:1.18.36")

    }

    이거 하시면 우측 상단에 코끼리 + 새로고침 모양이 뜹니다. 그거 클릭하시면
    롬북 설정이 마무리 됩니다.(가끔 안되는 경우 intellij를 껐다 켜야함)
 */
@RequiredArgsConstructor
@AllArgsConstructor

public class PersonLombok {
    private final String name;
    private int age;

//    @ 애너테이션 사용을 하게 될 경우에 명시적인 생성자를 코드 작성하게 되면
//    충돌이 일어나기 때문에 둘 중에 하나만 쓰셔야 합니다.
//    public PersonLombok(String name) {
//        this.name = name;
//    }
//
//    public PersonLombok(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
}
