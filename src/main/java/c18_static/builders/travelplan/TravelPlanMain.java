package c18_static.builders.travelplan;
/*
    응용 과제 :
        여행 계획 객체 생성

    다음과 같은 속성을 가진 여행 계획(TravelPlan) 객체 생성
        1. 여행지(destination) : 파리
        2. 출발일(departureDate) : 2024-12-17
        3. 귀국일(returnDate) : 2024-12-26
        4. 여행자 수(numberOfTravelers) : 2
        5. 호텔 이름(hotelName) : 아난티코브
        6. 비행편번호(flightNumber) : AF123

    지시 사항
        1. @Builder 및 @ToString 이용
        2. 위의 속성의 예시에 적어둔 데이터를 기준으로 객체 생성
        3. 생성된 객체인 travelPlan1 을 sout 을 통해 콘솔에 출력
 */
public class TravelPlanMain {
    public static void main(String[] args) {
        TravelPlan travelPlan1 = TravelPlan.builder()
                .destination("파리")
                .departureDate("2024-12-17")
                .returnDate("2024-12-26")
                .numberOfTravelers(2)
                .hotelName("아난티코브")
                .flightNumber("AF123")
                .build();

        System.out.println(travelPlan1);
        // 위 코드는 new 사용 X, Builder 에서 필수 생성자가 없었기 때문에

        TravelPlanNoLombok travelPlanNoLombok1 = new TravelPlanNoLombok.Builder("런던", "2025-01-01")
                .build();
        // 하지만 TravelPlanNoLombok 과 Builder 에서 final 로 지정한 속성 때문에
        // Builder 의 생성자를 이용하는 경우 new 와 .Builder(인수들)로 대문자 Builder 사용
        System.out.println(travelPlanNoLombok1);
    }
}
