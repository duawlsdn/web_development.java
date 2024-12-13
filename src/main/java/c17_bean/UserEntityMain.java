package c17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntityLombok user1 = new UserEntityLombok();

        /*
            username 에 abcdef
            passeord 1234
            email a@test.com
            name 여러분 이름을 넣은 다음에

            콘솔에 출력
         */

        user1.setUsername("abcdef");
        user1.setPassword("1234");
        user1.setEmail("a@test.com");
        user1.setName("염진우");

        // 이하의 코드에서 알 수 있는 것 : @Data 애너테이션 내부에는 toString() 메서드가 구현돼 있음.
        System.out.println(user1);

    }
}
