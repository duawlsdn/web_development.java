package c18_static.builders.travelplan;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class TravelPlan {
    private String destination;
    private String departureDate;
    private String returnDate;
    private int numberOfTravelers;
    private String hotelName;
    private String flightNumber;
}