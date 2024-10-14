import Recursos.Navegador.Browser;
import Recursos.Utilidades.Localizadores;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class Inicio {
    WebDriver driver;
    Localizadores localizadores;


    @BeforeEach
    public void AbrirPagina() {
        Browser BR = new Browser(driver);
        driver = BR.OpenBrowser();
        localizadores = new Localizadores(driver);

    }

    @AfterEach
    public void CloseBrowser() {
        driver.close();
    }

    @Test
    public void IngresarPagina() {
        localizadores.Escribir("standard_user", "//*[@id='user-name']");
        localizadores.Escribir("secret_sauce", "//*[@id='password']");
        localizadores.click("//*[@id='login-button']");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
