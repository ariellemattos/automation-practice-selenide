package br.com.arielle.acquisition;
import br.com.arielle.globalDriver.GlobalDriver;
import br.com.arielle.login.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AcquisitionStep {
    String Dress = "Printed Chiffon Dress";
    String Blouse = "Blouse";

    LoginPage loginPage = new LoginPage();
    GlobalDriver globalDriver = new GlobalDriver();
    AcquisitionPage acquisitionPage = new AcquisitionPage();

    @Given("Realizo login com um usuario cadastrado")
    public void realizo_login_com_um_usuario_cadastrado() {
        globalDriver.OnAir();
        loginPage.enterRegisteredUser("datumqatest@soprock.com", "datum2021");
    }

    @When("Adiciono duas roupas no carrinho")
    public void adiciono_duas_roupas_no_carrinho() throws InterruptedException {

        // Add Dress
        acquisitionPage.lookForClothes(Dress);
        acquisitionPage.clickClothes(Dress);
        acquisitionPage.selectInfo("1", "Yellow");
        acquisitionPage.clickAddCart();
        acquisitionPage.clickContinueShopping();

        // Add Blouse
        acquisitionPage.lookForClothes(Blouse);
        acquisitionPage.clickClothes(Blouse);
        acquisitionPage.selectInfo("1", "Black");
        acquisitionPage.clickAddCart();

    }

    @Then("Finalizo a compra")
        public void finalizo_a_compra() throws InterruptedException {
        acquisitionPage.clickCheckout();
        acquisitionPage.validationInfoCart();
        acquisitionPage.orderConfirmation();

    }


}
