package reqresIn.singleUser;

import org.junit.jupiter.api.Test;
import general.ResqresApiBase;
import io.restassured.response.Response;


/* Consumir servicios Rest de la API https://reqres.in/ Generar puntos de control que usted considere necesario en el escenario de pruebas. 
Para todas las peticiones crear su jsonschema y validar el body response. */

public class singleUserTest extends ResqresApiBase {

    @Test
    public void singleTest(){
        Response response = SingleUserRequest.getSingleUser(requestSpecification,"2");
        SingleUserQuestions.validateStatusCode(response, 200);

    }
    
}

