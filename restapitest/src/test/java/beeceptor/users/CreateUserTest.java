package beeceptor.users;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import beeceptor.general.BeeceptorAPIBase;
import io.restassured.response.Response;

public class CreateUserTest extends BeeceptorAPIBase {

    @ParameterizedTest
    @CsvSource({
        "David, david.pena@litethinking.com, asdfasf69786sdf89asd",
        "Maria, maria.gomez@example.com, password123456",
        "Carlos, carlos.lopez@example.com, abcd1234xyz987",
        "Ana, ana.martinez@example.com, 9876securepwd",
        "Luis, luis.fernandez@example.com, Qwerty98765432",
        "Sofia, sofia.ramirez@example.com, abcdef123456xyz",
        "Jorge, jorge.morales@example.com, xys987sdf098wer",
        "Laura, laura.torres@example.com, asdf098wer123",
        "Miguel, miguel.rodriguez@example.com, passwordXYZ999",
        "Elena, elena.garcia@example.com, qweasd098wer567"
    })
    public void createUser(String name, String email, String password){
        String userPayload = ModelUser.userPayload(name, email, password);
        Response reponse = CreateUserRequest.postCreateUser(requestSpecification, userPayload);
        CreateUserQuestions.validateStatusCode(reponse);
    }
}
