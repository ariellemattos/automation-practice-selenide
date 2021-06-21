package br.com.arielle.login;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    /*** Elementos da página ***/

    SelenideElement menuLogin=$(".login");

    SelenideElement inputEmail=$("#email");

    SelenideElement inputPassword=$("#passwd");

    SelenideElement btnLogin=$("#SubmitLogin");

    SelenideElement boxTextMyAccount=$(".page-heading");

    SelenideElement btnLogout=$(".logout");


    public void enterRegisteredUser(String email, String password){
        menuLogin.click();
        inputEmail.setValue(email);
        inputPassword.setValue(password);
        btnLogin.click();

    }

    public void seeMyAccount(){
        boxTextMyAccount.shouldHave(text("My account"));
    }

    public void logout(){
        btnLogout.click();
    }

}
