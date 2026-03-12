package com.restaurante.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;

import java.util.List;

public abstract class BasePage extends PageObject {

    protected void clickElemento(WebElementFacade el) {
        el.waitUntilClickable().click();
    }

    protected void escribir(WebElementFacade el, String texto) {
        el.waitUntilVisible().clear();
        el.type(texto);
    }

    protected String obtenerTexto(WebElementFacade el) {
        return el.waitUntilVisible().getText();
    }

    protected boolean estaVisible(WebElementFacade el) {
        return el.isVisible();
    }

    protected List<WebElementFacade> buscarTodos(String cssOrXpath) {
        return findAll(cssOrXpath);
    }

    protected boolean existeEnLista(List<WebElementFacade> lista, String texto) {
        return lista.stream().anyMatch(e -> e.getText().trim().equalsIgnoreCase(texto));
    }

    protected String obtenerTituloPagina() {
        return getDriver().getTitle();
    }

    protected boolean urlContiene(String fragmento) {
        return getDriver().getCurrentUrl().contains(fragmento);
    }

    protected void esperarQueDesaparezca(By locator) {
        waitForRenderedElementsToDisappear(locator);
    }
}