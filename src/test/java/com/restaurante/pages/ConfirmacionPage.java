package com.restaurante.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfirmacionPage extends BasePage {

    // "Pedido confirmado"
    @FindBy(css = "h1.text-4xl")
    private WebElementFacade tituloPagina;

    // "Tu pedido #xxxx fue enviado a cocina."
    @FindBy(css = "p.text-muted-foreground")
    private WebElementFacade mensajeConfirmacion;

    // ID completo del pedido
    @FindBy(css = "p.break-all")
    private WebElementFacade idPedido;

    // ── Verificaciones ────────────────────────────────────────────────────

    public boolean pedidoFueConfirmado() {
        return obtenerTexto(tituloPagina)
                .equalsIgnoreCase("Pedido confirmado");
    }

    public boolean mensajeContieneTexto(String texto) {
        return obtenerTexto(mensajeConfirmacion)
                .toLowerCase()
                .contains(texto.toLowerCase());
    }

    public String obtenerId() {
        return obtenerTexto(idPedido);
    }
}