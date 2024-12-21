package c21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
    JSON(JavaScript Object Notation) : 본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따르지만,
        언어독립형 포멧.
        프로그래밍 언어나 플랫폼에 독립적이기 때문에 구문 분석 및 JSON 데이터 생성을 위한 코드는
        자바, 파이썬 등 다양한 언어에서 쉽게 이용 가능

        {
            "이름공간(key)": "값(value)",
            "값 구분자": "각각의 값들은 ','(콤마)로 구분되어야 합니다.",
            "이스케이프": "키가 값에서 큰따옴표를 쓰고 싶으면-특정 문자를 이스케이프 하려면- \" 처럼 문자 앞에 역슬래시를 붙입니다.",
            "자료형": "표현 가능한 자료형은 String, int, double, boolean, null, object, array 6개 입니다.",
            "문자열 값": "큰따옴표로 감싸서 표현됨 - 자바와 같음.",
            "숫자": 123456, // 큰따옴표 없이 표현됨
            "boolean 값": true,
            "null 값": null,
            "object 값": {
                "값1": 123456789,
                "값2": false,
                "값3": {
                    "객체 내부": "객체 위치 가능",
                    "구분자": "key-value 구분은 ':'(콜론)으로 이루어집니다."
                }
            },
            "Arrray 값": [
                "여기에 String을 넣고 싶다면 다시 ""를 써야합니다.",
                {
                    "현재 값의 인덱스": 1,
                    "해당 방식처럼": "배열 안에 여러 값을 넣는 것도 가능"
                },
                [ "배열", "내부에", "배열을", "삽입하는 것도", "가능합니다."]
            ],
            "JSON 예시": "마무리"
        }

    GSON : Google JSON 의 약칭 -> 자바에서 생성한 객체를 매개변수로 넣으면 GSON 객체를 생성해
        tojson() 메서드를 사용, Map 형태로 매칭시킨 데이터들을 JSON 'String' 으로 반환
        즉, json 포멧으로 일일이 작성해야 하는 번거로움을 줄여줌
 */
public class JSON01 {
    public static void main(String[] args) {
        // JsonObject 를 생성하고 속석(엔트리)(키-값 쌍)을 추가 하고(addProperty() 메서드 사용)
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username","jinwo");
        jsonObject.addProperty("password","1234");
        jsonObject.addProperty("email","wlsdn893@naver.com");
        jsonObject.addProperty("name","염진우");
        jsonObject.addProperty("age","29");

        System.out.println(jsonObject);

        // prettyPrinting 이 활성화 된 Gson 인스턴스 생성
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // prettyPrinting : 콘솔창에서 사람이 알아볼 수 있도록 정렬시켜둔 형태로 출력하는 방식

        // JsonObject 를 prtteyPrinting 이 적용된 JSON 문자열로 반환
        String json = gson.toJson(jsonObject);  // String 자료형인 것에 주목
        System.out.println(json);
        /*
            GSON 라이브러리 :
                목적 : Gson 라이브러리는 JAVA 객체를 JSON 형태로 변환 하거나, 그 반대로 변환하는 데 사용
                주요 클래스 :
                    Gson : 변환을 위해 사용되는 주요 클래스
                    GsonBuilder : Gson 인스턴스에 대한 사용자 정의 구성을 허용 -> 그래서 prettyPrinting
                    JsonObject : JSON 객체를 나타냄 (즉, Java 에서 사용).
         */
    }
}
