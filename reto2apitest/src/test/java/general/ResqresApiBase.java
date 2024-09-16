package general;

import org.junit.jupiter.api.BeforeEach;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utils.IConfigBase;

public class ResqresApiBase implements IConfigBase {
    protected RequestSpecification requestSpecification;

    @BeforeEach
    public void configure() {
        // Configuración inicial
        RestAssured.baseURI = "https://reqres.in";

        // Inicialización del requestSpecification
        requestSpecification = RestAssured.given();
    }
}
