package c08_mathod;

public class Overloading {
    /*
        method overloading
        매개변수의 형태가 다르면 동일한 메서드 명을 가지고 정의 할 수 있다. - > return 타입 고정

        즉, 메서드 명은 동일하고, parament에 들어가는 자료형 및 변수명이 다름을 의미
     */
    public static void add() {
        System.out.println("add()");
    }

    // call2() 타입의 method 정의 -> 메서드 명은 동일하게 가져가야 overloading에 해당
    public static void add(String s) {
        System.out.println("add(String s)");
//        System.out.println(s);
    }

    // call2() 타입의 method 정의 이지만 parament를 복수로 변형
    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println("a+b = " + (a + b));
    }
//    public int add(int a, int b){
//        // 지역 변수 선언 및 초기화
//        int result = 0;
//        result = a+b;
//        return result;
//    }

    public static void add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println(s + " " + a);
    }

    public static void add(int a, String s) {
        System.out.println("add(int a, String s)");
        System.out.println(a + " " + s);
    }

    public static void main(String[] args) {
        add();
        add("String을 사용한 call2() 타입의 add(String s) 입니다.");
        add(1, 2);
        add("안녕하세요", 10);
        add(29, "내 나이임");
        add("아직만으로는", 28);
    }
}
