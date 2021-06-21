package br.com.arielle.acquisition;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AcquisitionPage {

    /*** Elementos da página ***/

    SelenideElement boxSearch=$("#search_query_top");

    SelenideElement bntSearch=$(".button-search");

    SelenideElement productContainer=$(".product-container");

    SelenideElement inputQuantity=$("#quantity_wanted");

    SelenideElement colorBlack=$("#color_11");

    SelenideElement colorGreen=$("#color_15");

    SelenideElement colorYellow=$("#color_16");

    SelenideElement addToCart=$("#add_to_cart button");

    SelenideElement btnContinue=$(".continue");

    SelenideElement btnCheckout=$("a[title='Proceed to checkout']");

    SelenideElement btnCheckout1=$("a[href='http://automationpractice.com/index.php?controller=order&step=1']");

    SelenideElement btnCheckoutDefault=$("[name='processAddress']");

    SelenideElement btnCheckoutProceed=$("[name='processCarrier']");

    SelenideElement addressFirstname=$(".address_firstname");

    SelenideElement address=$(".address_address1");

    SelenideElement addressCity=$(".address_city");

    SelenideElement agreeTerms=$("#cgv");

    SelenideElement bankwire=$(".bankwire");

    SelenideElement btnConfirmOrder=$("#cart_navigation button");

    SelenideElement textConfirmation=$(".cheque-indent strong");

    public void lookForClothes(String clothes){
        boxSearch.sendKeys(Keys.BACK_SPACE);
        boxSearch.setValue(clothes);
        bntSearch.click();
    }

    public void clickClothes(String clothes){
        productContainer.exists();
        productContainer.shouldHave(text(clothes)).click();
    }

    public void selectInfo(String quantity, String color){
        inputQuantity.setValue(quantity);

        if(color == "Green"){
            colorGreen.click();
        }else if (color == "Yellow") {
            colorYellow.click();
        }else if(color == "Black"){
            colorBlack.click();
        }
    }

    public void clickAddCart() throws InterruptedException {
        addToCart.click();
        Thread.sleep(5000);
    }

    public void clickContinueShopping() {
        btnContinue.click();
    }

    public void clickCheckout() throws InterruptedException {
        Thread.sleep(5000);
        btnCheckout.click();
    }

    public void validationInfoCart() throws InterruptedException {
        btnCheckout1.click();

        addressFirstname.shouldHave(text("Datum QA Test"));
        address.shouldHave(text("Rua da Qualidade"));
        addressCity.shouldHave(text("Datum City, California 00000"));

        btnCheckoutDefault.click();

        Thread.sleep(5000);
        agreeTerms.click();
        btnCheckoutProceed.click();

        bankwire.click();
        btnConfirmOrder.click();
    }

    public void orderConfirmation(){
        textConfirmation.shouldHave(text("Your order on My Store is complete."));
    }
}
