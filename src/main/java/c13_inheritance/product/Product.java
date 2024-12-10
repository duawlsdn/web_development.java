package c13_inheritance.product;

import jdk.jfr.Category;

public class Product extends Item{
    private int price;
    private int stock;

    // AllArgsConstructor 로 만들기 위해 부모클래스에 없는 필드를 추가

    public Product(String name, String category, int price, int stock) {
        super(name, category);
        System.out.println("Product가 생성되었습니다.");
        // 여러분들은 기본적으로 사용하던 방식의 생성자 내부에 필드 대입하는 코드를 작성해야 함.
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String category) {
        super(name, category);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        System.out.println("Product 제품명 변경 : " + name);
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        System.out.println("Product 카테고리 변경 : " + category);
        super.setCategory(category);
    }

    // Item 클래스에 없는 필드와 관련된 Setter / Getter를 생성하시오 -> 얘네는 @Override가 아니다

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayInfo(){
        System.out.println("제품명 : " + getName() + "\n카테고리 : " + getCategory());
        System.out.println("가격 : " + getPrice() + "\n재고 : " + getStock());

    }
}
