package c19_generic.wildcards.wildcard_practice;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AnimalData<T> {
    private T animal;               // Main.java 와 비교했을 때 결과적으로 <? extends Animal>이 적용됬다면
                                    // animal 에 들어갈 수 있는 것은 Human 혹은 Tiger 클래스의 인스턴스 밖에 없음.
    public void printData(){
        ((Animal) animal).move();   // T 이기 때문에 Object 클래스의 객체가 들어 올수 있는데 명시적으로 다운캐스팅을 통해서
                                    // Animal 클래스의 인스턴스로 animal 이 바뀜 -> .move() 사용 가능
        if(animal.getClass() == Human.class){   // AnimalData 의 필드(animal)는 이상의 코드로 인해 Animal 클래스의 객체
            ((Human) animal).readBooks();       // 근데 그 animal 이 Human 클래스의 인스턴스이기도 하다면 readBooks() 호출
        }else if(animal.getClass() == Tiger.class){
            ((Tiger) animal).hunt();            // animal 을 Tiger 클래스로 명시적인 다운 캐스팅(Animal -> Tiger)하여 .hunt() 호출
        }

    }
    // Car.java 로 이동
}
