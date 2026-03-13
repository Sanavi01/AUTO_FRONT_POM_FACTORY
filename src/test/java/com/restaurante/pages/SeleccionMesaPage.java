package com.restaurante.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SeleccionMesaPage extends BasePage {

    @FindBy(css = "h1")
    private WebElementFacade tituloPagina;

    @FindBy(css = "div.grid button")
    private List<WebElementFacade> todasLasMesas;

    // ── Acciones ──────────────────────────────────────────────────────────

    public void seleccionarMesa(String numeroMesa) {
        buscarEnLista(todasLasMesas, numeroMesa).click();
    }

    // ── Verificaciones ────────────────────────────────────────────────────

    public boolean tituloPaginaEsCorrecto() {
        return obtenerTexto(tituloPagina)
                .equalsIgnoreCase("Selecciona tu mesa");
    }
}