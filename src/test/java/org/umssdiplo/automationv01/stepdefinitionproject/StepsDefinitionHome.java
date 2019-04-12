package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Formulario.Formulario;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionHome {
    private Home home;
    private Formulario formulario;

    @Given("^'Home' page is loaded$")
    public void HomePageIsLoaded() throws Throwable {
        home = LoadPage.homePage();
    }

    @Then("^press new 'Formulario' button$")
    public void FormularioPageIsLoaded() throws Throwable {
        formulario = home.pressButton();
    }
}
