package saucedemo.store;

import java.time.Duration;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StorePriceTest {
    WebDriver driver;
    int seconds = 5;

    @BeforeEach
    public void configWebDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));

        driver.get("https://saucedemo.com");

    }
    @Test
    public void validatePrice(){

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
