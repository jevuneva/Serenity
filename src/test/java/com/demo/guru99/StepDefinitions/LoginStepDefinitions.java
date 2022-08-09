package com.demo.guru99.StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {
    @Managed (driver ="Chrome")
    private WebDriver navegador;
    private Actor juan = Actor.named("juan");

    @Before
    public void  configuracion(){
        juan.can(BrowseTheWeb.with(navegador)); //juan puede abrir el navegador
    }

    @Dado("que el usuario se encunetre en la pagina guru99")
    public void queElUsuarioSeEncunetreEnLaPaginaGuru99() {

    }

    @Cuando("el ingrese las credenciales")
    public void elIngreseLasCredenciales() {

    }

    @Entonces("el pobra visualizar la pagina de inicio")
    public void elPobraVisualizarLaPaginaDeInicio() {


    }
}
