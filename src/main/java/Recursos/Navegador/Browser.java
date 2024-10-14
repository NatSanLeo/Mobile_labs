package Recursos.Navegador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Browser {
    WebDriver driver;


    public Browser(WebDriver _driver) {
        driver = _driver;
    }


    public WebDriver OpenBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "D:/Nata/chromedriver-win64/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get("https://www.saucedemo.com/");
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        } catch (Exception e) {
            System.out.println(e.getMessage() + "Revisa tu código");
        }
        return driver;

    }
}

