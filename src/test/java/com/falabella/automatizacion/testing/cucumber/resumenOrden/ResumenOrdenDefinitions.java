package com.falabella.automatizacion.testing.cucumber.resumenOrden;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ResumenOrdenDefinitions {
	@Steps
	ResumenOrdenSteps resumenOrdenSteps;
	
	@Given("^el usuario filtra un articulo \"([^\"]*)\" en la barra de busqueda$")
	public void filtraArticuloBarraBusqueda(String producto) {
		resumenOrdenSteps.filtraArticuloBarraBusqueda(producto);
	}

	@When("^el usuario agrega a la bolsa el producto y selecciona un seguro para el producto$")
	public void agregaBolsaSeleccionaSeguro() {
		resumenOrdenSteps.agregaBolsaSeleccionaSeguro();
	}
	
	@Then("^el usuario deberia ver el resumen de la orden$")
	public void verResumenOrden()
	{
		resumenOrdenSteps.verResumenOrden();
	}

}
