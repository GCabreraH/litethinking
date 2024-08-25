package login;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

public class Login {

    @BeforeAll
public static void preConfiguracion(){
    System.out.println("Se ejecuta esto una sola vez antes de todo lo demas, se realiza usa por ejemplo para conexion a API");
}
    @BeforeEach
public void configuracion(){
    System.out.println("Se ejecuta esto cada vez que se ejecuta un Test, por ejemplo se abre el navegador y se ingresa en la pagina del login a realizar");
}
    @Test
    public void ingresoWebLogin(){
        System.out.println("Se ingresa en www.login.com ");
    }
    @Test 
    public void loginUsuarioValido(){
        System.out.println("Se ingresa usuario valido y contraseña valida y se presiona ENTER");    
    }
    @Test
    public void validarLoginExitoso() {
        System.out.println("Mediante assertion se valida el login exitoso con las palabras claves 'Bienvenido Guillermo'");
    }
    @AfterEach
    public void cerrarNavegador(){
        System.out.println("Se realiza el cierre del navegador para cada test");
    }

    @AfterAll
    public static void postLimpieza() {
        System.out.println("Se ejecuta esto una sola vez después de todo lo demás, se usa por ejemplo para cerrar la conexión a API");
    }
    
}
