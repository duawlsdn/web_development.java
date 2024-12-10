package c14_abstraction.interfaces;

public interface Press {
    // 5번 라인의 의미는 실제로 public final String NAME = "button"; 과 동일
    String NAME = "button";     // 상수이기 때문에 선언과 동시에 초기화가 이루어져야 함
                                // 마간차지로 상수이기 때문에 개발자들이 알아 볼 수 있도록
                                // 전부 대문자로 상수명을 표기해야 함.

                                // 차이점으로는 상수임에도 불구하고 final 이 붙지 않았다는 점
                                // interface 에서는 자동으로 final 이 표기 된것을 간주됨

    // 안되는 것들 예시
//    private String name;          // 변수 선언 불가능
//    public Press();               // 생성자 선언 불가능
//    public  default void pop(){}  // 일반 메서드 선언 불가능

    // 추상메서드 정의
    void onPressed();
}
