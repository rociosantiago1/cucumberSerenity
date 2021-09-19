package com.falabella.automatizacion.testing.cucumber.resumenOrden;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;



import net.thucydides.core.annotations.Step;

public class ResumenOrdenSteps {
	private ResumenOrdenPageObject resumenOrdenPageObject;
	
	@Step("el usuario filtra un articulo en la barra de busqueda")
	public void filtraArticuloBarraBusqueda(String producto) {
		resumenOrdenPageObject.filtraArticuloBarraBusqueda(producto);
		resumenOrdenPageObject.seleccionarPagina();
	}

	@Step("el usuario agrega a la bolsa y selecciona un seguro para el producto")
	public void agregaBolsaSeleccionaSeguro() {
		resumenOrdenPageObject.agregarBolsa();
		resumenOrdenPageObject.seleccionarSeguro();
	}

	@Step("el usuario deberia ver el resumen de la orden")
	public void verResumenOrden() {
		 assertEquals("Resumen de tu orden", this.resumenOrdenPageObject.verEtiquetaResumenOrden());
		 assertThat(this.resumenOrdenPageObject.verEtiqueSubTotalProductos(), notNullValue());
		 assertThat(this.resumenOrdenPageObject.verBotonIrAComprar(), notNullValue());
	}

}
