package beeceptor.users;

public class ModelUser {
    public static String userPayload(String name, String email, String password){
        String json = "{"
        + "\"name\":\"" + name + "\","
        + "\"email\":\"" + email + "\","
        + "\"password\":\"" + password + "\""
        + "}";

        return json;
    }
}
