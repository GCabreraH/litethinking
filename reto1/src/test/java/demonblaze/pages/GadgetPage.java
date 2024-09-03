package demonblaze.pages;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GadgetPage {
        WebDriver driver;

    //elementos de la pagina
    By txtMenuPhones = By.linkText("Phones");
    By txtMenuLaptops = By.linkText("Laptops");
    By txtMenuMonitors = By.linkText("Monitors");
    By txtS6 = By.linkText("Samsung galaxy s6");
    By txtS6Price = By.cssSelector("h3.price-container");
    By txtLumia = By.linkText("Nokia lumia 1520");
    By txtLumiaPrice = By.cssSelector("h3.price-container");
    By txtVaio = By.linkText("Sony vaio i5");
    By txtVaioPrice = By.cssSelector("h3.price-container");
    By txtMacbookAir = By.linkText("MacBook air");
    By txtMacbookAirPrice = By.cssSelector("h3.price-container");
    By txtAsusFullHD = By.linkText("ASUS Full HD");
    By txtAsusFullHDPrice = By.cssSelector("h3.price-container");


    //Constructor
    public GadgetPage(WebDriver driver){
        this.driver = driver;
    }

    //acciones o conjunto de acciones (metodos)
    public void existS6(){
        driver.findElement(txtMenuPhones).click(); 
        assertTrue(driver.findElement(txtS6).isDisplayed());
    }

    public void s6GetPrice(){
        driver.findElement(txtMenuPhones).click(); 
        driver.findElement(txtS6).click();
        String s6Price = driver.findElement(txtS6Price).getText();
        assert s6Price.contains("$360") : "El precio no es el esperado. Precio encontrado: " + s6Price;
        System.out.println(s6Price);        
    }

    public void lumiaExist(){
        driver.findElement(txtMenuPhones).click(); 
        assertTrue(driver.findElement(txtLumia).isDisplayed());
    };

    public void lumiaGetPrice(){
        driver.findElement(txtMenuPhones).click(); 
        driver.findElement(txtLumia).click();
        String lumiaPrice = driver.findElement(txtLumiaPrice).getText();
        assert lumiaPrice.contains("820"): "El precio no es el esperado. Precio encontrado" + lumiaPrice;
    }
    public void vaioExist(){
        driver.findElement(txtMenuLaptops).click();
        assertTrue(driver.findElement(txtVaio).isDisplayed());
    }

    public void vaioGetPrice(){
        driver.findElement(txtMenuLaptops).click();
        driver.findElement(txtVaio).click();
        String vaioPrice = driver.findElement(txtVaioPrice).getText();
        assert vaioPrice.contains("790"): "El precio no es el esperado. Precio encontrado" + vaioPrice;
    }
    public void macBookExist(){
        driver.findElement(txtMenuLaptops).click();
        assertTrue(driver.findElement(txtMacbookAir).isDisplayed());
    }

    public void macBookGetPrice(){
        driver.findElement(txtMenuLaptops).click();
        driver.findElement(txtMacbookAir).click();
        String macBookPrice = driver.findElement(txtMacbookAirPrice).getText();
        assert macBookPrice.contains("700"): "El precio no es el esperado. Precio encontrado" + macBookPrice;
    }
    public void asusFullHDExist(){
        driver.findElement(txtMenuMonitors).click();
        assertTrue(driver.findElement(txtAsusFullHD).isDisplayed());
    }

    public void asusFullHDGetPrice(){
        driver.findElement(txtMenuMonitors).click();
        driver.findElement(txtAsusFullHD).click();
        String asusFullHDPrice = driver.findElement(txtAsusFullHDPrice).getText();
        assert asusFullHDPrice.contains("230"): "El precio no es el esperado. Precio encontrado" + asusFullHDPrice;
    }
    /*public void isShowMessage(){
        assertEquals("El mensaje de error no es correcto o no fue encontrado (msj error seteado como prueba NOOK)", driver.findElement(errorMessage).getText(),"Epic sadface: Sorry, this user has been locked out.");
    }*/
}
