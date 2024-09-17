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
    public void getSingleUser(){
        Response response = Reto2Request.getSingleUser(requestSpecification,"12");
        Reto2Questions.validateStatusCode(response, 200);
        System.out.println(response.asPrettyString());
    }

    @Test
    public void getSingleUserNotfound(){
        Response response = Reto2Request.getUserNotFound(requestSpecification,"23");
        Reto2Questions.validateStatusCode(response, 404);
        System.out.println(response.asPrettyString());
    }
    
}

