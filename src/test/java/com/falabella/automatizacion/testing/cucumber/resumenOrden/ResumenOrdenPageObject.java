package com.falabella.automatizacion.testing.cucumber.resumenOrden;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class ResumenOrdenPageObject extends PageObject {
	private WebDriver driver;

	@FindBy(how = How.ID, using = "acc-alert-close")
	private WebElement btnAlert;
	@FindBy(how = How.CLASS_NAME, using = "dy-lb-close")
	private WebElement btnAlertPuntosCRM;
	@FindBy(how = How.ID, using = "testId-SearchBar-Input")
	private WebElement txtSearchBar;
	@FindBy(how = How.CLASS_NAME, using = "SearchBar-module_searchBtnIcon__6KVum")
	private WebElement btnSearchBar;
	@FindBy(how = How.ID, using = "testId-pagination-bottom-arrow-right")
	private WebElement btnPaginacionDerecha;
	@FindBy(how = How.ID, using = "testId-pagination-top-button3")
	private WebElement btnPagina3;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Agregar a la Bolsa')][1]")
	private WebElement btnAgregarBolsa;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Asegura tu Pantalla')]")
	private WebElement btnAsegura;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Agregar a la Bolsa')]")
	private WebElement btnAgregarBolsaUno;
	@FindBy(how = How.ID, using = "linkButton")
	private WebElement btnVerBolsaCompra;
	@FindBy(how = How.XPATH, using = "//*[@id='linkButton']")
	private WebElement linkVerBolsa;
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Resumen de tu orden')]")
	private WebElement lblResumenOrden;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sub-total productos')]")
	private WebElement lblSubTotalProductos;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ir a comprar')]")
	private WebElement btnIrAComprar;

	WebDriverWait wait = new WebDriverWait(getDriver(), 30);

	public ResumenOrdenPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		driver.manage().window().maximize();
		driver.get("https://www.falabella.com.co/falabella-co");
	}

	public void filtraArticuloBarraBusqueda(String producto) {
		wait.until(ExpectedConditions.visibilityOf(btnAlert));
		if (btnAlert.isDisplayed()) {
			btnAlert.click();
		}
		txtSearchBar.sendKeys(producto);
		btnSearchBar.click();
		cerrarAlertaCRM();
	
	}
	
	public void seleccionarPagina() {
		btnPaginacionDerecha.click();
		btnPagina3.click();
	}

	public void agregarBolsa() {
		btnAgregarBolsa.click();
		cerrarAlertaCRM();
	}

	public void seleccionarSeguro() {
		btnAsegura.click();
		btnAgregarBolsaUno.click();
		linkVerBolsa.click();
	}

	public void cerrarAlertaCRM() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (btnAlertPuntosCRM.isDisplayed()) {
			btnAlertPuntosCRM.click();
		}
	}

	public String verEtiquetaResumenOrden() {
		return this.lblResumenOrden.isDisplayed() ? this.lblResumenOrden.getText() : null;
	}

	public String verEtiqueSubTotalProductos() {
		return this.lblSubTotalProductos.isDisplayed() ? this.lblSubTotalProductos.getText() : null;
	}

	public String verBotonIrAComprar() {
		return this.btnIrAComprar.isDisplayed() ? this.btnIrAComprar.getText() : null;
	}

}
