package reqresIn.singleUser;

import static org.junit.Assert.assertEquals;
import io.restassured.response.Response;

    //puntos de control
public class SingleUserQuestions {
    public static void validateStatusCode(Response response, Integer statusCodeExpected){
        assertEquals(
            "Validación de Status Code igual a 200",
            statusCodeExpected, // El valor esperado ahora es Integer
            (Integer)response.statusCode() // Convertimos el status code a Integer
        );
    }

}



