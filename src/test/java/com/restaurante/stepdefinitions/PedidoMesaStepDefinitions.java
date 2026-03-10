package test.java.com.restaurante.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PedidoMesaStepDefinitions {

	@Given("el cliente está en la pantalla de inicio del menú")
	public void el_cliente_esta_en_la_pantalla_de_inicio_del_menu() {
	}

	@When("selecciona la mesa {string} desde el menú")
	public void selecciona_la_mesa_desde_el_menu(String mesa) {
	}

	@And("modifica {int} unidad(es) de {string} al pedido")
	public void modifica_unidades_de_producto_al_pedido(int cantidad, String producto) {
	}

	@And("confirma la compra del pedido")
	public void confirma_la_compra_del_pedido() {
	}

	@Then("recibe la confirmación de que la cocina ha recibido el pedido")
	public void recibe_la_confirmacion_de_que_la_cocina_ha_recibido_el_pedido() {
	}

}
