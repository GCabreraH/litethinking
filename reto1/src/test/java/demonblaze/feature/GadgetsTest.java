package demonblaze.feature;

import demonblaze.pages.GadgetPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class GadgetsTest {
        //declaracion de variables generales

    WebDriver driver;
    int seconds = 3;

    @BeforeEach
    public void configDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));

        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void s6Exist (){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.existS6();
    }

    @Test
    public void s6ComparePrice(){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.s6GetPrice();
    }

    @Test
    public void lumiaExist(){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.lumiaExist();
    }

    @Test
    public void lumiaGetPrice(){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.lumiaGetPrice();

    }
    @Test
    public void vaioExist(){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.vaioExist();
    }

    @Test
    public void vaioGetPrice(){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.vaioGetPrice();

    }
    @Test
    public void macBookExist(){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.macBookExist();
    }

    @Test
    public void macBookGetPrice(){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.macBookGetPrice();

    }
    @Test
    public void asusFullHDExist(){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.asusFullHDExist();
    }

    @Test
    public void asusFullHDGetPrice(){
        GadgetPage homePage = new GadgetPage(driver);
        homePage.asusFullHDGetPrice();

    }

    @AfterEach
    public void teardown(TestInfo testInfo) { // Inyecta TestInfo en el método
        driver.close();
        System.out.println("El nombre del método es: " + testInfo.getDisplayName()); // Imprime el nombre del método
    }
}
