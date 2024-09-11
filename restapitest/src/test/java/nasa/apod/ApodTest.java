package nasa.apod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import io.restassured.response.Response;
import nasa.general.NasaAPIBase;

public class ApodTest extends NasaAPIBase {

    @ParameterizedTest
    @CsvSource({
        "2024-09-03, 200, https://apod.nasa.gov/apod/image/2409/MoonPleiades_Dyer_960.jpg",
        "2023-09-04, 200, https://apod.nasa.gov/apod/image/2309/CrescentBubble_AlHarbi_1080.jpg",
        "2023-09-05, 200, https://apod.nasa.gov/apod/image/2309/SuperBlueMoon_Saragozza_960.jpg"
    })
    public void apodDaySuccesfull(String date, Integer statusExpected, String expectedUrl){
        Response response = ApodRequest.getApod(requestSpecification, date);

        ApodQuestions.validateStatusCode(response, statusExpected);
        ApodQuestions.validateUrl(response, expectedUrl);
    }

    @ParameterizedTest
    @CsvSource(value = {
        "2124-09-03| 400| Date must be between Jun 16, 1995 and Sep 04, 2024.",
        "1945-09-03| 400| Date must be between Jun 16, 1995 and Sep 04, 2024."
    }, delimiter = '|')
    public void apodDayError(String date, Integer statusExpected, String expectedError){
        Response response = ApodRequest.getApod(requestSpecification, date);

        ApodQuestions.validateStatusCode(response, statusExpected);
        ApodQuestions.validateErrorMessage(response, expectedError);
    }

    @Test
    public void apodRange(){
        Response response = ApodRequest.getApod(requestSpecification, "2024-05-27", "2024-06-01");
        ApodQuestions.validateStatusCode(response, 200);
    }

}
