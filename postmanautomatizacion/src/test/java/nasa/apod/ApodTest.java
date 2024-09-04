package nasa.apod;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApodTest {

    @Test
    public void apodDay(){
        
        //configuracion inicial
            RestAssured.baseURI = "https://api.nasa.gov";
        //armar request
            RequestSpecification requestSpecification = RestAssured.given();
            requestSpecification.param("api_key","CdrPgq3EdL8kO5aDUjsvqYDOqUlYMgA74ktUiJiH");
            requestSpecification.param("date","2024-09-01");


        //generar response - hacer peticion

            Response response = requestSpecification.get("/planetary/apod");
            System.out.println("Response: \n"+response.asPrettyString());

        // 1. Validar Status Code 200
        assertEquals("Validación del Status code", 200, response.statusCode());

        // 2. Validar que el Content-Type es application/json
        assertEquals("Validación del Content-Type", "application/json", response.header("Content-Type"));

        // 3. Validar que la respuesta no es nula
        assertNotNull("Validación de que la respuesta no es nula", response.getBody());

        // 4. Validar que el campo "title" está presente en la respuesta
        assertTrue("Validación de que el campo 'title' está presente", response.jsonPath().get("title") != null);

        // 5. Validar que la respuesta tiene un campo "date" con el valor correcto
        assertEquals("Validación de la fecha", "2024-09-01", response.jsonPath().get("date"));

        // 6. Validar que el campo "url" en la respuesta es una URL válida
        String url = response.jsonPath().get("url");
        assertTrue("Validación de URL", url.startsWith("http"));

        // 7. Validar que el campo "explanation" no está vacío
        assertTrue("Validación de 'explanation' no vacío", !response.jsonPath().get("explanation").toString().isEmpty());

        // 8. Validar que el tamaño de la respuesta es mayor a 0
        assertTrue("Validación de tamaño de la respuesta", response.asString().length() > 0);

        // 9. Validar que el campo "media_type" es "image" o "video"
        String mediaType = response.jsonPath().get("media_type");
        assertTrue("Validación de media_type", mediaType.equals("image") || mediaType.equals("video"));

        // 10. Validar que el campo "service_version" está presente y es igual a "v1"
        assertEquals("Validación de service_version", "v1", response.jsonPath().get("service_version"));
        
    }
}
