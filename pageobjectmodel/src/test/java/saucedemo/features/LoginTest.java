package saucedemo.features;

import java.time.Duration;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;//se debe usar junit.jupiter.api.xxx y no junit.jupiter.xxxxx
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import saucedemo.pages.LoginPage;

public class LoginTest {
    //declaracion de variables generales

    WebDriver driver;

    @BeforeEach
    public void configDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        driver.get("https://www.saucedemo.com/");

}
    @Test
    public void loginSuccesfull(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

}
    @AfterEach
    public void teardown(){
        driver.close();

    }


}
