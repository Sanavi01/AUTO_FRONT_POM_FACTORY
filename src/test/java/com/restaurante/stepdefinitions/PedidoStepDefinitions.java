package com.restaurante.stepdefinitions;

import com.restaurante.pages.CarritoPage;
import com.restaurante.pages.ConfirmacionPage;
import com.restaurante.pages.SeleccionMesaPage;
import com.restaurante.pages.SeleccionPedidoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.assertj.core.api.Assertions;

public class PedidoStepDefinitions {

    @Steps
    SeleccionMesaPage seleccionMesaPage;

    @Steps
    SeleccionPedidoPage seleccionPedidoPage;

    @Steps
    CarritoPage carritoPage;

    @Steps
    ConfirmacionPage confirmacionPage;

    @Given("el cliente está en la pantalla de selección de mesa")
    public void clienteEstaEnPantallaSeleccionMesa() {
        seleccionMesaPage.open();
    }

    @When("selecciona la mesa {string} desde el menú")
    public void seleccionaLaMesa(String mesa) {
        seleccionMesaPage.seleccionarMesa(mesa);
    }

    @And("agrega la opción {string} al pedido")
    public void agregaOpcionAlPedido(String opcionProducto) {
        seleccionPedidoPage.agregarProducto(Integer.parseInt(opcionProducto));
    }

    @And("aumenta {string} vez\\(ces) la cantidad de la opción {string}")
public void aumentaCantidad(String vecesAumentar, String opcionProducto) {
    seleccionPedidoPage.aumentarCantidad(Integer.parseInt(vecesAumentar));
}

@And("disminuye {string} vez\\(ces) la cantidad de la opción {string}")
public void disminuyeCantidad(String vecesDisminuir, String opcionProducto) {
    seleccionPedidoPage.disminuirCantidad(Integer.parseInt(vecesDisminuir));
}

    @And("hace click en Comprar")
    public void haceClickEnComprar() {
        seleccionPedidoPage.clickComprar();
    }

    @And("confirma el pedido desde el carrito")
    public void confirmaPedidoDesdeCarrito() {
        carritoPage.confirmarPedido();
    }

    @Then("recibe la confirmación de que la cocina ha recibido el pedido")
    public void recibeConfirmacion() {
        Assertions.assertThat(confirmacionPage.pedidoFueConfirmado())
                .as("La pantalla debería mostrar 'Pedido confirmado'")
                .isTrue();
    }
}