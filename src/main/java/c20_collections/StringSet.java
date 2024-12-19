package c20_collections;

import java.util.*;


/*
    Set
        특징 :
            - 중복 요소를 허용하지 않으며, 요소의 순서는 보장되지 않음.
        구현체 :
            - HashSet : 중복을 허용하지 않으며, 순서를 보장하지 않음
            - TreeSet : 요소를 자동으로 '정렬' 합니다.
            - LinkedHashSet : 입력된 순서를 '유지'
 */
public class StringSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>();

        /*
            List 는 순서가 있고 중복을 허용하는 반면
            Set 의 경우 순서는 없고 중복을 허용하지 않기 때문에
            List -> Set 혹은 Set -> List 로의 형변환이 매우 중요합니다.
            List 를 통해 전체 설문을 받고, Set 을 통해 중복을 제거하여 후보군을 넘기는 방식으로 많이 사용
            또한 Set 으로 중복을 제거한 후 다시 List 로 형변환하여 .get(인덱스넘버)를 통해 조회하는 방법 역시 자주 사용
         */
        // Set 에서 요소 추가하는 메서드 -> .add()
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("python");
        strSet.add("python");
        strSet.add("python");
        strSet.add("1");
        strSet.add("1");
        strSet.add("1");
        strSet.add("1");
        strSet.add("2");
        strSet.add("3");

        // Set 출력
        System.out.println(strSet);

        // HashSet 을 List 로 변환
        strList.addAll(strSet);
        System.out.println("정렬 전 List : " + strList);

        // List 로 바뀌었으니 순서가 있고, 이를 정렬할 수 있습니다.
        Collections.sort(strList);
        System.out.println("정렬 후 List : " + strList);
    }
}
