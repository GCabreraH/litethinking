package reqresIn.Reto2API;

import org.junit.jupiter.api.Test;
import general.ResqresApiBase;
import io.restassured.response.Response;


/* Consumir servicios Rest de la API https://reqres.in/ Generar puntos de control que usted considere necesario en el escenario de pruebas. 
Para todas las peticiones crear su jsonschema y validar el body response. */

public class Reto2Test extends ResqresApiBase {

    @Test
    public void listAllPage2Users(){
        Response response = Reto2Request.getPageUser(requestSpecification,"2");
        Reto2Questions.validateStatusCode(response, 200);
        System.out.println(response.asPrettyString());
    }

    @Test
    public void singleTestUser12(){
        Response response = Reto2Request.getPageUser(requestSpecification,"2");
        Reto2Questions.validateStatusCode(response, 200);
        System.out.println(response.asPrettyString());
    }
    
}

