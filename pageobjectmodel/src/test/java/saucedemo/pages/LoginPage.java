package saucedemo.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
    WebDriver driver;

    //elementos de la pagina
    By txtuserName = By.name("user-name");
    By txtPassword = By.name("password");
    By btnLogin = By.name("login-button");
    By containerSecundary = By.cssSelector("span[data-test='title']");
    By errorMessage = By.cssSelector("h3[data-test='error']");

    

    //C onstructor
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
    public void isUserInPrivatePage(){
        assertTrue("No se encuentra visible el contenedor de 'Products'", driver.findElement(containerSecundary).isDisplayed());
        //assertFalse("Se encuentra el contenedor de 'Products'", driver.findElement(containerSecundary).isDisplayed());
    }
    public void isShowMessageError(){
        assertEquals("El mensaje de error no es correcto o no fue encontrado (msj error seteado como prueba NOOK)", driver.findElement(errorMessage).getText(),"Epic sadface: Sorry, this user has been locked out.");
    }



}
