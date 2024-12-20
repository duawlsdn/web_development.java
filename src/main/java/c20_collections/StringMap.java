package c20_collections;

import java.util.*;

/*
    Map
        특징 :
            - 데이터를 키-값 쌍(Key-Value Pair)으로 저장합니다.
            - 키는 중복을 허용하지 않으며, 값은 중복이 가능 -> JSON 이라는 형태와 가장 유사

        구현체 :
            1) HashMap - 순서를 유지하지 않습니다.
            2) LinkHashMap - 입력된 순서를 유지합니다.
            3) TreeMap - 키를 자동으로 정렬합니다.
 */
public class StringMap {
    public static void main(String[] args) {

        // HashMap 생성 및 초기화 -> Key 와 Value 가 들어가기 때문에 제네릭으로 두개의 타입을 설정할 필요(키 따로 값 따로)
        Map<String, String> map = new HashMap<>();

        // Map 에 데이터 삽입하는 방법 -> .put(키, 값)
        /*
            위의 메서드를 활용합니다(참고 .put() 인스턴스 메서드 입니다.)

            20240001 황지선
            20240002 정승환
            20240003 장시원
            20240004 이하온
            20240005 이진혁
            20240006 이시후

            입력이 끝났다면 출력 -> List 출력 방법과 동일
         */
        map.put("20240001","황지선");
        map.put("20240002","정승환");
        map.put("20240003","장시원");
        map.put("20240004","이하온");
        map.put("20240005","이진혁");
        map.put("20240006","이시후");
        // 키는 중복 X , 값은 중복 O
        System.out.println("map 전체 출력 :" + map);

        // 특정 키의 값 조회 -> .get() 사용 -> 값이 출력됨
        System.out.println(map.get("20240001"));

        // 1. 특정 키의 값 수정 -> .put() 사용하여 덮어쓰기
        // 20240006의 키를 가진 값을 염진우로 바꾼다고 가정
        map.put("20240006","염진우");
        System.out.println("수정 1 후 map 출력 : " + map);

        // 2. 특정 키의 값 수정 -> .replace() 사용
        map.replace("20240006","박승주");
        System.out.println("수정 2 후 map 출력 : " + map);

        // 특정 키 존재 여부 -> .containsKey()
        boolean searchSuccessFlag1 = map.containsKey("20240006");
        boolean searchSuccessFlag2 = map.containsKey("20240007");
        System.out.println(searchSuccessFlag1);
        System.out.println(searchSuccessFlag2);

        // 특정 키 존재 여부 -> .containsValue()
        boolean searchSuccessFlag3 = map.containsValue("안근수");
        System.out.println(searchSuccessFlag3);

        // Map 의 엔트리(Key - Value 동시에 지칭하는 개념)로부터 List 생성
        Set<Map.Entry<String, String>> entry = map.entrySet();
        System.out.println("map을 Set 형태로 전환 : " + entry);
        // 비어있는 List 생성
        List<Map.Entry<String, String>> entries = new ArrayList<>();
        System.out.println(entries);    // 여기에는 비어있는 entries List 만 출력
        // Set 에서 List 로 전환 -> 추후 가장 중요한 개념
        entries.addAll(entry);

        System.out.println("entry 리스트 출력 : "+entries);
        System.out.println(entries.get(0));

        // Key 들을 모아둔 Set 출력
        // 1) Set 선언 및 초기화
        // 자료형<Key 자료형> 변수명 = 맵이름.KeySet();
        Set<String> KeySet = map.keySet();
        // 2) 출력
        System.out.println("Key 목록 Set : " + KeySet);
        // 3) 이거 List 로 바꿔서 순서 정렬
        List<String> keyList = new ArrayList<>();
        keyList.addAll(KeySet);
        Collections.sort(keyList);
        System.out.println("Set 목록 정렬 List : " + keyList);

        // Value 컬렉션 출력 -> <> 내부에 Value  의 자료형 넣어셔야 합니다.
        Collection<String> values = map.values();
        System.out.println("values 들 : " + values);
        System.out.println(values.getClass());  // List 나 Set 이 아니라 Values 라는 클래스에 해당

        /*
            students 패키지 내에 StudentSet, StudentMap 만드시고 Main 적용
         */
    }
}
