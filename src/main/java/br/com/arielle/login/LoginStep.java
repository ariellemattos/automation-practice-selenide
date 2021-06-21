package br.com.arielle.login;

import br.com.arielle.globalDriver.GlobalDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    LoginPage loginPage = new LoginPage();
    GlobalDriver globalDriver = new GlobalDriver();

    @Given("Acesso a tela de login")
    public void acesso_a_tela_de_login() {
        globalDriver.OnAir();
    }

    @When("Entro com um usuario cadastrado")
    public void entro_com_um_usuario_cadastrado() {
        loginPage.enterRegisteredUser("datumqatest@soprock.com", "datum2021");
    }

    @Then("Devo ver a tela de minha conta")
    public void devo_ver_a_tela_de_minha_conta() {
        loginPage.seeMyAccount();
        loginPage.logout();
    }

}
