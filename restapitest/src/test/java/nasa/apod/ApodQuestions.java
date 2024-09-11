package nasa.apod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ApodQuestions {

    public static void validateStatusCode(Response response, Integer statusCodeExpected){
        assertEquals(
            statusCodeExpected,
            response.statusCode(),
            "Validacion del Status Code"
        );
    }

    public static void validateUrl(Response response, String expectedUrl){
        JsonPath jsonPath = new JsonPath(response.body().asString());
        assertEquals(
            expectedUrl,
            jsonPath.getString("url"), 
            "Validacion de la url"
        );
    }

    public static void validateErrorMessage (Response response, String expectedError){
        JsonPath jsonPath = new JsonPath(response.body().asString());
        assertEquals(
            expectedError,
            jsonPath.getString("msg"), 
            "Validacion del mensaje de error"
        );
    }
    
}
