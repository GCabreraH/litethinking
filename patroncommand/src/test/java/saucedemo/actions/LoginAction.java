package saucedemo.actions;

import org.openqa.selenium.WebDriver;

import saucedemo.pages.LoginPage;

public class LoginAction {
    public static void login(WebDriver driver, String userName, String password){
        driver.findElement(LoginPage.txtUsername).sendKeys(userName);
        driver.findElement(LoginPage.txtPassword).sendKeys(password);
        driver.findElement(LoginPage.btnLogin).click();
    }
}
