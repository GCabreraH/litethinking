package beeceptor.users;

import static org.junit.Assert.assertEquals;

import io.restassured.response.Response;

public class CreateUserQuestions {

    public static void validateStatusCode(Response response){
        // Punto de control 1: Validacion del Status Code. 
        assertEquals(
            "Validacion del Status Code", 
            200, 
            response.statusCode()
        );
    }
    
}
