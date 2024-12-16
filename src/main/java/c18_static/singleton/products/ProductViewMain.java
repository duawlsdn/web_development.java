package c18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {

        //ProductView productView1 = ProductView.getInstance();
        // 이상의 방법으로 객체명을 지정해 놓고 해당 객체의 메서드들을 실행시키는 방법 사용

        // ProductView.getInstance() 메서드는 대문자 P이고, 싱글톤에서 분석했듯, static 메서드 입니다.
        // 그리고 getInstance() 리턴값은 instance 라는 static 필드 이기 때문에
        // ProductView productView1 = ProductView.getInstance() 대입을 생략하고
        // 곧장 실행을 시켜봤습니다.
        // 하지만 return 값이 instance 라는데에 주목!
        // 그리고 instance 필드를 확인해본 결과 자료형이 ProductView  클래스의 객체임을 확인 할 수 있기
        // 때문에, 인스턴스 메서드를(static 이 없는) 실행한 결과와 동일한 값이 나오게 됨.
        ProductView.getInstance().ShowMainView();
        // 16 라인에서 생성한 instance 와 18번 라인에서 생성한 instance 는 동일
        ProductView.getInstance().ShowOrderView();
    }
}
