package beeceptor.users;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUserRequest {

    public static Response postCreateUser(RequestSpecification requestSpecification, String userPayload){
        return requestSpecification.body(userPayload).post("/api/users/");
    }
    
}
