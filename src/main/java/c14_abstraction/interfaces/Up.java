package c14_abstraction.interfaces;

public interface Up {
    // public void onUp(); -> 추상 메서드 쓸 때 이런식으로 했었는데, 인터페이스는 상관없습니다.
                            // interface 에서의 method 들은 전부 자동으로 public

    // 추상 메서드 선언
    void onUp();

}
