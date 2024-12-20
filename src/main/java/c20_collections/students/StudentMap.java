package c20_collections.students;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {

        // Map 선언
        Map<Integer, String> studentMap = new HashMap<>();

        /*
            데이터를 입력
            20240001 김일
            20240002 김이
            20240003 김삼
            20240004 김사
            20240005 김오
            20240006 김육
         */
        studentMap.put(20240001,"김일");
        studentMap.put(20240002,"김이");
        studentMap.put(20240003,"김삼");
        studentMap.put(20240004,"김사");
        studentMap.put(20240005,"김오");
        studentMap.put(20240006,"김육");

        // studentMap 을 출력하세요.
        System.out.println("studentMap 전체 출력 :" + studentMap);

        // studentMap 의 Key 값들을 Set 으로 받아오세요.
        Set<Integer> KeySet = studentMap.keySet();
        System.out.println("Key 목록 Set : " + KeySet);

        // KeySet 의 모든 요소들을 KeyList 로 옮기세요.
        List<Integer> KeyList = new ArrayList<>();
        KeyList.addAll(KeySet);
        Collections.sort(KeyList);
        System.out.println("Set 목록 정렬 List : " + KeyList);
        // 혹시나 순서대로 정렬하고 싶으시면 StudentSet.java 에서 int orderId 부분부터 확인

        // 각 키의 value 들을 콘솔에 출력
        /*
            실행 예
            김일
            김이
            김삼
            김사
            김오
            김육
         */
        System.out.println(studentMap.get(20240001));
        System.out.println(studentMap.get(20240002));
        System.out.println(studentMap.get(20240003));
        System.out.println(studentMap.get(20240004));
        System.out.println(studentMap.get(20240005));
        System.out.println(studentMap.get(20240006));
    }
}
