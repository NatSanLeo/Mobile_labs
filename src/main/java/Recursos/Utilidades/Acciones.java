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
}
