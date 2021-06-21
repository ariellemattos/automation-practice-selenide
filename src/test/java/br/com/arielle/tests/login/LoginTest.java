package br.com.arielle.tests.login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "src/main/java/br/com/arielle/login/",
        glue = {"br.com.arielle.login"}
)
public class LoginTest {

}


