package c13_inheritance.product;
/*
    1) 필드로 private String name. private String category 를 선언

    2) 생성자를 AllArgsConstructor 로 생성

    3) Setter / Getter 생성

    4) Product.java 로 가셔서 Item 이 부모클래스 / Product 가 자식 클래스가 되도록 명령어를 입력
 */
public class Item {
    private String name;
    private String category;

    // RequiredArgsConstructor 로 선언 하지 않은 이유 : 필드 두개가 전부
    // String 이기 때문에 컴파일 시에 오류가 날 확률이 있다
    // 생성자
    public Item(String name, String category) {
        System.out.println("Item을 생성하였습니다.");
        this.name = name;
        this.category = category;
    }

    // 메서드 생성
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}


