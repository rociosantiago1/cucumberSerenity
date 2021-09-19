
package com.falabella.automatizacion.testing.cucumber.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/ResumenOrden.feature"},tags = ""
		 +"@ResumenOrden"
		 ,glue = {"com.falabella.automatizacion"})
public class Runner {

}
