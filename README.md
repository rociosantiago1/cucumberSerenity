# cucumberSerenity
Framework de prueba con selenium cucumber y serenity


EJERCICIO 2:

Para el ejercicio de UI te vas a crear un escenario el cual ingrese a la pagina 
https://www.falabella.com.co/falabella-co en la barra de búsqueda filtres por el articulo 
de tu preferencia y seleccione un elemento que se encuentre en una pagina superior a 
la segunda, le des clic en agregar a la bolsa y selecciones un seguro para el producto, 
ingrese el producto a la bolsa de compras y realices todas las verificaciones con el 
resumen de la orden.

Herramientas:
• Java 8 
• Maven
• Serenity BDD Screenplay o POM. Según tu preferencia y comodidad.
• Cucumber 4 o mayor con Serenity BDD

Ejecutar Con:
mvn verify -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=chromedriver.exe

Los resultados de las pruebas están en el archivo:

target\site\serenity archivo index.html
