package saucedemo.features;

import java.time.Duration;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;//se debe usar junit.jupiter.api.xxx y no junit.jupiter.xxxxx
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import saucedemo.pages.LoginPage;

public class LoginTest {
    //declaracion de variables generales

    WebDriver driver;
    int milli = 3000;

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
        loginPage.isUserInPrivatePage();

}

@Test
public void loginProblemaUser(){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("problem_user", "secret_sauce");

}
@Test
public void loginLockedUser(){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("locked_out_user", "secret_sauce");
    loginPage.isShowMessageError();
}

@Test
public void loginWrongUser(){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("dsnt_exist_user", "secret_sauce");
    try {
        Thread.sleep(milli);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
    @AfterEach
    public void teardown(TestInfo testInfo) { // Inyecta TestInfo en el método
        driver.close();
        System.out.println("El nombre del método es: " + testInfo.getDisplayName()); // Imprime el nombre del método
    }
}
