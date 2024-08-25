package google;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchTest {

    WebDriver driver;

    @BeforeEach
    public void configDriver(){
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));

        driver.get("https://www.google.com");
    }
        @Test
        public void searchSeleniumWebdriver(){
        //interacciones
        WebElement textAreaSearcher = driver.findElement(By.name("q"));
        textAreaSearcher.sendKeys("Selenium WebDriver");
        textAreaSearcher.submit();

        //puntos de control (assertions)
        WebElement logo = driver.findElement(By.className("jfN4p"));
        assertTrue(logo.isDisplayed(),"No está el logo");

        //primer punto de control
        //logo de google

        //segundo punto control

        
    }
    @AfterEach
    public void tearDown(){
        //cerrar el navegador
        driver.close();
    }
}
