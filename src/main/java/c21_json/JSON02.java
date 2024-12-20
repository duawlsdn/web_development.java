package c21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON02 {
    public static void main(String[] args) {

        // prettyPrinting 이 가능한 gson 객체 생성
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // 비교 할 수 있는 일반 gson 객체 생성
        Gson gson = new Gson();

        // 사용할 변수 선언
        String userJson;    // json 은 기본적으로 String 자료형이기 때문에 선언 할때 String 빼먹으면 안됨.
        String productJson;

        // User 객체 선언
        User user = new User("jinwo","1234","wlsdn893@naver.com","염진우","29");
        System.out.println(gson.toJson(user));
        System.out.println("----프리티 프린팅 적용----");
        System.out.println(gsonBuilder.toJson(user));

        // 이상에서의 코드는 User 클래스를 정의하고 생성자를 통해서 필드에 값을 집어 넣은 상태로
        // JSON 형태로 바꿨습니다. 하지만 이런 방법만 있는 것이 아니라
        // JsonObject 를 이용하는 방법이 있습니다. -> JSON01.java 에서 수업

        // JsonObject 형태로
        // studentCode 20240001
        // studentName 염진우
        // studentAge 29 로 생성한 후
        // gson 과 gsonBuilder 를 통해 해당 JSON 파일을 콘솔창에 띄워보세요.

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("studentCode","20240001");
        jsonObject.addProperty("studentName","염진우");
        jsonObject.addProperty("studentAge","29");

        System.out.println(gson.toJson(jsonObject));
        System.out.println(gsonBuilder.toJson(jsonObject));

        /*
           이상의 코드 라인은 JsonObject 를 이용한 방법

           이제 이거 밑으로는 Map -> JSON 형태로 변환
           Map 으로 만들거니까 Map 선언
           먼저 Map -> Json
         */
        Map<String, String> map = new HashMap<>();
        // Map 에서 엔트리 추가 하는 법 -> .put()
        map.put("productCode","NT960XGK-KH51G");
        map.put("productName","갤럭시북4 프로");
        System.out.println("일반 gson : " + gson.toJson(map));
        productJson = gsonBuilder.toJson(map);

        System.out.println("prtteyPrinting : " + productJson);

        // Json -> Map
        Map<String, String> jsonData1 = gson.fromJson(productJson,Map.class);
        System.out.println("jsonData1 => Map 으로 바꾼 사례 : " + jsonData1);

    }
}
