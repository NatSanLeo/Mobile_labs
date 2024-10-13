import Recursos.Navegador.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class Inicio {
    WebDriver driver;


    @BeforeEach
    public void AbrirPagina() {
        Browser BR = new Browser(driver);
        driver = BR.OpenBrowser();
    }

    @AfterEach
    public void CloseBrowser() {
        driver.close();
    }

    @Test
    public void IngresarPagina() {

    }
}
