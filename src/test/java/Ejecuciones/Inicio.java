package Ejecuciones;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class Inicio {

    WebDriver driver;

    @Test

    public void AbrirPagina() {
        try {
            System.setProperty("webdriver.chrome.driver", "D:/Nata/chromedriver-win64/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get("https://www.saucedemo.com/");
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);

        } catch (Exception e) {
            System.out.println(e.getMessage() + "Revisa tu código");
        }

    }
}
