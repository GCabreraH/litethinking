package saucedemo.hooks;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {
        //constructor
    WebDriver driver;
    @BeforeEach
    public void configWebDriver(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("http://www.saucedemo.com");
    }
    @Test
    public void validatePrice(){

    }
    
    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
