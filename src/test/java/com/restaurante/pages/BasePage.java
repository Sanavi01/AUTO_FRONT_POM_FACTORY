package com.restaurante.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public abstract class BasePage extends PageObject {

    protected void clickElemento(WebElementFacade elemento) {
        elemento.waitUntilClickable().click();
    }

    protected String obtenerTexto(WebElementFacade elemento) {
        return elemento.waitUntilVisible().getText();
    }

    // Busca en lista por texto visible
    protected WebElementFacade buscarEnLista(
            List<WebElementFacade> lista, String texto) {
        return lista.stream()
                .filter(el -> el.getText().trim().contains(texto))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(
                        "Elemento no encontrado con texto: " + texto));
    }

    // Busca en lista por atributo (ej: aria-label)
    protected WebElementFacade buscarEnListaPorAtributo(
            List<WebElementFacade> lista, String atributo, String valor) {
        return lista.stream()
                .filter(el -> el.getAttribute(atributo) != null &&
                        el.getAttribute(atributo).contains(valor))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(
                        "Elemento no encontrado con " + atributo + ": " + valor));
    }
}