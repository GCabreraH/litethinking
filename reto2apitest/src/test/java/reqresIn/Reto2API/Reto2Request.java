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
        public static Response getSingleUser(RequestSpecification requestSpecification, String userId){
            // Aquí simplemente añadimos el userId al path del endpoint
            return requestSpecification.get("/api/users/" + userId); 
    }
}
