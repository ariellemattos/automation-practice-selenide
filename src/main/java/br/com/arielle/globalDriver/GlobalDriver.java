package br.com.arielle.globalDriver;

import org.testng.Assert;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.WebDriverRunner.isChrome;


public class GlobalDriver {

    public void OnAir(){
        isChrome();
        open("http://automationpractice.com/index.php");
        Assert.assertEquals(title(), "My Store");
    }
}
