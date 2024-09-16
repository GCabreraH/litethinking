package reqresIn.singleUser;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SingleUserRequest {
    public static Response getSingleUser(RequestSpecification requestSpecification, String page){
        //parametro y valor.
        requestSpecification.param("page", page);
        //generar el response
        return requestSpecification.get("/api/users");
    }
}
