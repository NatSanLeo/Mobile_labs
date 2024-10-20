package Recursos.Utilidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Acciones {

    WebDriver driver;

    public Acciones(WebDriver _driver) {
        driver = _driver;
    }

    public void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();

    }

    public void Escribir(String text, String xpath) {
        driver.findElement(By.xpath(xpath)).sendKeys(text);

    }

    public void Esperar() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setDriver(WebDriver _driver) {
        this.driver = _driver;
    }
}
