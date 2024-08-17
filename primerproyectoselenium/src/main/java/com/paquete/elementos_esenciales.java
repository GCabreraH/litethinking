//package com.litethinking; paquete original
package com.paquete;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class elementos_esenciales {
    public static void main(String[] args) {
        
        //Configurar el driver del navegador
            WebDriver driver = new ChromeDriver();
            WebDriver fireDriver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
            driver.manage().window().maximize();

        //Abrir la pagina de la aplicación
            driver.get("http://google.cl");
            fireDriver.get("http://google.cl");

        //Interactuar con los elementos de la pagina
        WebElement textAreaSearch = driver.findElement(By.id("APjFqb"));
        WebElement textAreaSearchFire = fireDriver.findElement(By.id("APjFqb"));
        //Accionar elemento
        textAreaSearch.sendKeys("Selenium webdriveeeeeeeer");
        textAreaSearch.submit();

        textAreaSearchFire.sendKeys("Selenium webdriveeeeeeeer");
        textAreaSearchFire.submit();
        //Punto de control para la prueba
        //Comparar el resultado obtenido con el resultado esperado
            if(driver.getCurrentUrl().contains("Selenium+webdriveeeeeeeer")){System.out.println("Paso OK");}else{System.out.println("NOOK");}
            System.out.println(fireDriver.getCurrentUrl().contains("Selenium+webdriveeeeeeeer")? "Paso OK fayerfock!!!!!":"Falla firefock!!!");
        //Cerrar el navegador
        driver.close();
        fireDriver.close();
    }
}