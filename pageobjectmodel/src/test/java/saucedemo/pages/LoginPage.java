package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
    WebDriver driver;

    //elementos de la pagina
    By txtuserName = By.name("user-name");
    By txtPassword = By.name("password");
    By btnLogin = By.name("login-button");
    

    //constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //acciones o conjunto de acciones (metodos)
    public void login(String userName, String password){
        driver.findElement(txtuserName).sendKeys(userName);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnLogin).click();
    }

    //puntos de control de la pagina



}
