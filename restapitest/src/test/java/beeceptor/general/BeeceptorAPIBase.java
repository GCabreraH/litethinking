package beeceptor.general;

import org.junit.jupiter.api.BeforeEach;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utils.IConfigBase;

public class BeeceptorAPIBase implements IConfigBase {

    protected RequestSpecification requestSpecification;

    @BeforeEach
    public void configure(){

        RestAssured.baseURI = "https://caa91059517effafc26b.free.beeceptor.com";

        requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.accept(ContentType.JSON);
    }
    
}
