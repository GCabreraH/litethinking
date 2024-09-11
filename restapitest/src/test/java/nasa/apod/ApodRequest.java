package nasa.apod;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApodRequest {
    
    public static Response getApod(RequestSpecification requestSpecification, String date){
        requestSpecification.param("date", date);
        return requestSpecification.get("/planetary/apod");
    }

    public static Response getApod(RequestSpecification requestSpecification, String startDate, String endDate){
        requestSpecification.param("start_date", startDate);
        requestSpecification.param("end_date", endDate);
        return requestSpecification.get("/planetary/apod");
    }
}
