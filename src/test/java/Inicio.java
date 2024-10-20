import Recursos.Navegador.Browser;
import Recursos.Utilidades.Acciones;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static Recursos.Utilidades.Data.PASSWORD;
import static Recursos.Utilidades.Data.USER_ADMIN;


public class Inicio extends Acciones{
    WebDriver driver;

    public Inicio(WebDriver _driver) {
        super(_driver);
    }


    @BeforeEach
    public void abrirPagina() {
        Browser BR = new Browser(driver);
        driver = BR.OpenBrowser();
        Escribir(USER_ADMIN.toString(), "//*[@id='user-name']");
        Escribir(PASSWORD.toString(), "//*[@id='password']");
        click("//*[@id='login-button']");
        Esperar();

    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void seleccionarProducto() {
        click("//*[@id='item_2_title_link']");
        Esperar();

    }

    @Test
    public void agregarCarrito() {
        click("//*[@id='add-to-cart-sauce-labs-onesie']");
        Esperar();


    }


}
