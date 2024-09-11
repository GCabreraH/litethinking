package nasa.general;

import org.junit.jupiter.api.BeforeEach;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utils.IConfigBase;

public class NasaAPIBase implements IConfigBase {

    protected RequestSpecification requestSpecification;

    @BeforeEach
    public void configure(){
        // Configuracion Inicial
        RestAssured.baseURI = "https://api.nasa.gov";

        // Armar el Request
        requestSpecification = RestAssured.given();
        requestSpecification.param("api_key", "blRuk5X0tQndyUAnMeawu9AbrLL3SgnYzP22Ckgs");
    }
    
}
