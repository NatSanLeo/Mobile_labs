import Recursos.Navegador.Browser;
import Recursos.Utilidades.Acciones;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static Recursos.Utilidades.Data.PASSWORD;
import static Recursos.Utilidades.Data.USER_ADMIN;


public class Inicio {
    WebDriver driver;
    Acciones localizadores;


    @BeforeEach
    public void AbrirPagina() {
        Browser BR = new Browser(driver);
        driver = BR.OpenBrowser();
        localizadores = new Acciones(driver);
        localizadores.Escribir(USER_ADMIN.toString(), "//*[@id='user-name']");
        localizadores.Escribir(PASSWORD.toString(), "//*[@id='password']");
        localizadores.click("//*[@id='login-button']");

        localizadores.Esperar();


    }

    @AfterEach
    public void CloseBrowser() {
        driver.close();
    }

    @Test
    public void SeleccionarProducto() {
        localizadores.click("//*[@id='item_2_title_link']");
        //localizadores.click("//*[@id='add-to-cart']");
        localizadores.Esperar();

    }

    @Test
    public void AgregarCarrito() {
        localizadores.click("//*[@id='add-to-cart-sauce-labs-onesie']");
        localizadores.Esperar();


    }


}
