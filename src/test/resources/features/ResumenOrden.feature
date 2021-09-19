#Author: Rocio Santiago
#
@ResumenOrden 
Feature: Resumen Orden
	Yo como usuario de la aplicacion WEB Falabella
	Quiero agregar un articulo con seguro a la bolsa
	Para ver el resumen de la orden
	
Scenario Outline: Resumen Orden
	Given el usuario filtra un articulo <nomProducto> en la barra de busqueda
	When el usuario agrega a la bolsa el producto y selecciona un seguro para el producto
	Then el usuario deberia ver el resumen de la orden
	
Examples:
  |nomProducto|
  |"celular"|