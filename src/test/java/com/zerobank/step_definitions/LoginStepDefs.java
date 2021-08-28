package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.peer.LabelPeer;

public class LoginStepDefs {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

      Driver.get().findElement(By.id("body")).click();
      //Driver.get().findElement(By.id("proceed-link")).click();
      BrowserUtils.waitFor(2);
    }

    @When("user credentials are correct")
    public void user_credentials_are_correct() {

        BrowserUtils.waitFor(2);
        LoginPage loginPage= new LoginPage();

        //WebElement login= Driver.get().findElement(By.id(""))
        String username= ConfigurationReader.get("username");
        String password= ConfigurationReader.get("password");
        loginPage.login(username, password);


    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        Assert.assertEquals("Zero - Account Summary", Driver.get().getTitle());
    }
}
