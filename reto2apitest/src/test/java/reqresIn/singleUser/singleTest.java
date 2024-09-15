package reqresIn.singleUser;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/* Consumir servicios Rest del API https://reqres.in/ Generar puntos de control que usted considere necesario en el escenario de pruebas. 
Para todas las peticiones crear su jsonschema y validar el body response. */

public class singleTest {

    @Test
    public void singleTest(){

        //configuracion inicial
            RestAssured.baseURI = "https://reqres.in";

        //armar el request
            RequestSpecification requestSpecification = RestAssured.given();
            requestSpecification.param("page", 2);

        //generar el response
            Response response = requestSpecification.get("/api/users");

        //puntos de control
        assertEquals("validación de Status Code igual a 200",201,response.statusCode());

        //ver en consola el response
            System.out.println("Response: "+ response.asPrettyString());
    }
    
}
