package reqresIn.Reto2API;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Reto2Request {
    public static Response getPageUser(RequestSpecification requestSpecification, String page){
        //parametro y valor.
        requestSpecification.param("page", page);
        //generar el response
        return requestSpecification.get("/api/users");
    }
}
