package com.restaurante.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfirmacionPage extends BasePage {

    // "Pedido confirmado"
    @FindBy(css = "h1.text-4xl")
    private WebElementFacade MensajePedidoConfirmado;

    // ── Verificaciones ────────────────────────────────────────────────────

    public boolean pedidoFueConfirmado() {
        return obtenerTexto(MensajePedidoConfirmado)
                .equalsIgnoreCase("Pedido confirmado");
    }
}