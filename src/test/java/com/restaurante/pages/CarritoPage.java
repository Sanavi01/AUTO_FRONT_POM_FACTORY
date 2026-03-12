package com.restaurante.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarritoPage extends BasePage {

    @FindBy(css = "h1")
    private WebElementFacade tituloPagina;

    // Botón "Confirmar pedido" al fondo del carrito
    @FindBy(xpath = "//button[text()='Confirmar pedido']")
    private WebElementFacade btnConfirmarPedido;

    // ── Acciones ──────────────────────────────────────────────────────────

    public void confirmarPedido() {
        clickElemento(btnConfirmarPedido);
    }

    // ── Verificaciones ────────────────────────────────────────────────────

    public boolean tituloPaginaEsCorrecto() {
        return obtenerTexto(tituloPagina)
                .equalsIgnoreCase("Carrito");
    }
}