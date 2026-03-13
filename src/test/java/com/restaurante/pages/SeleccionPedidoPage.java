package com.restaurante.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SeleccionPedidoPage extends BasePage {

    @FindBy(css = "h1")
    private WebElementFacade tituloPagina;

    @FindBy(xpath = "//button[normalize-space()='Agregar' or (contains(.,'Agregar') and not(contains(.,'unidad')))]")
    private List<WebElementFacade> botonesAgregar;

    @FindBy(xpath = "//div[contains(@class,'bg-accent/10')]//button[contains(@aria-label,'Agregar una unidad')]")
    private List<WebElementFacade> botonesAumentar;

    @FindBy(xpath = "//div[contains(@class,'bg-accent/10')]//button[contains(@aria-label,'Quitar una unidad')]")
    private List<WebElementFacade> botonesDisminuir;

    @FindBy(xpath = "//button[.//span[text()='Comprar']]")
    private WebElementFacade btnComprar;

    // ── Acciones ──────────────────────────────────────────────────────────

    public void agregarProducto(int opcionProducto) {
        botonesAgregar.get(opcionProducto - 1).click();
    }

    public void aumentarCantidad(int veces) {
        for (int i = 0; i < veces; i++) {
            botonesAumentar.get(0).click();
        }
    }

    public void disminuirCantidad(int veces) {
        for (int i = 0; i < veces; i++) {
            botonesDisminuir.get(0).click();
        }
    }

    public void clickComprar() {
        clickElemento(btnComprar);
    }

    // ── Verificaciones ────────────────────────────────────────────────────

    public boolean tituloPaginaEsCorrecto(String mesa) {
        return obtenerTexto(tituloPagina)
                .toLowerCase()
                .contains("mesa " + mesa);
    }

}
