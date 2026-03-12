package com.restaurante.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SeleccionPedidoPage extends BasePage {

    @FindBy(css = "h1")
    private WebElementFacade tituloPagina;

    @FindBy(css = "button[class*='bg-primary'][aria-label*='Agregar']")
    private List<WebElementFacade> botonesAgregar;

    @FindBy(css = "button[aria-label*='Agregar una unidad']")
    private List<WebElementFacade> botonesAumentar;

    @FindBy(css = "button[aria-label*='Quitar una unidad']")
    private List<WebElementFacade> botonesDisminuir;

    @FindBy(xpath = "//button[.//span[text()='Comprar']]")
    private WebElementFacade btnComprar;

    // ── Acciones ──────────────────────────────────────────────────────────

    public void agregarProducto(int opcionProducto) {
        botonesAgregar.get(opcionProducto - 1).click();
    }

    public void aumentarCantidad(int opcionProducto, int veces) {
        for (int i = 0; i < veces; i++) {
            botonesAumentar.get(opcionProducto - 1).click();
        }
    }

    public void disminuirCantidad(int opcionProducto, int veces) {
        for (int i = 0; i < veces; i++) {
            botonesDisminuir.get(opcionProducto - 1).click();
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
