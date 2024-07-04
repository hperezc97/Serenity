package com.co.izy.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }



    @Given("^el usuario abre la pagina web$")
    public void elUsuarioAbreLaPaginaWeb() {
       OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://developer.chrome.com/docs/chromedriver/#latest_chromedriver_binaries"));

    }


    @When("^el usuario ingresa las credenciales$")
    public void elUsuarioIngresaLasCredenciales() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^el usario pordra ver su nombre$")
    public void elUsarioPordraVerSuNombre() {
        // Write code here that turns the phrase above into concrete actions

    }


}
