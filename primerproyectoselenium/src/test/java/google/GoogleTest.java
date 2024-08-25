package google;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GoogleTest {

    @BeforeAll
public static void preConfiguracion(){
    System.out.println("Se ejecuta esto una sola vez antes de todo lo demas, se usa por ejemplo para conexion a BBDD");
}
    @BeforeEach
public void configuracion(){
    System.out.println("Se ejecuta esto cada vez que se ejecuta un Test");
}

    @Test
    public void busquedaGoogle(){
        System.out.println("Este es el escenario de pruebas para realizar una busqueda de google");
    }
    @Test 
    public void busquedagoogleSeleniumWebDriver(){
        System.out.println("Este es el escenario de pruebas para realizar una busqueda en google de Selenium WebDriver");    
    }
    @AfterEach
    public void limpieza() {
        System.out.println("Se ejecuta esto cada vez que termina un Test, se usa para limpiar recursos o resetear estados");
    }

    @AfterAll
    public static void postLimpieza() {
        System.out.println("Se ejecuta esto una sola vez después de todo lo demás, se usa por ejemplo para cerrar la conexión a BBDD");
    }
    
}
