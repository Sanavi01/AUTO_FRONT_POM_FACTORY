package com.restaurante.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.restaurante.pages.MenuPage;

    public class PedidoMesaStepDefinitions {

        private MenuPage menuPage;

        @Given("el cliente está en la pantalla de seleccion de mesa")
        public void elClienteEstaEnLaPantallaDeSeleccionDeMesa() {
            // TODO: navegar a la pantalla de selección de mesa
        }

        @When("selecciona la mesa {string} desde el menú")
        public void seleccionaLaMesaDesdeElMenu(String mesa) {
            // TODO: usar MesasPage.seleccionarMesaPorNumero(mesa)
        }

        @When("agrega una {string} al pedido")
        public void agregaUnaOpcionProductoAlPedido(String opcionProducto) {
            // TODO: seleccionar el producto por índice (opcionProducto) en MenuPage
        }

        @And("aumenta {string} vez(ces) la cantidad de {string}")
        public void aumentaVecesLaCantidadDe(String vecesAumentar, String opcionProducto) {
            // TODO: aumentar la cantidad del producto 'opcionProducto' 'vecesAumentar' veces
        }

        @And("disminuye {string} vez(ces) la cantidad de {string}")
        public void disminuyeVecesLaCantidadDe(String vecesDisminuir, String opcionProducto) {
            // TODO: disminuir la cantidad del producto 'opcionProducto' 'vecesDisminuir' veces
        }

        @When("confirma el pedido")
        public void confirmaElPedido() {
            // TODO: confirmar/completar el pedido
        }

        @Then("recibe la confirmación de que la cocina ha recibido el pedido")
        public void recibeLaConfirmacionDeQueLaCocinaHaRecibidoElPedido() {
            // TODO: validar confirmación/alerta de que la cocina recibió el pedido
        }

    }