package steps;

import config.UserConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SignUpPage;

public class SignUpPageDefs {

    SignUpPage regPage = new SignUpPage();

    @Then("Input name")
    public void inputName() {
        regPage.nameInput(UserConfig.USER_NAME);
    }

    @And("Input lastname")
    public void inputLastname() {
        regPage.lastNameInput(UserConfig.USER_LASTNAME);
    }

    @And("Input email or phone number")
    public void inputEmailOrPhoneNumber() {
        regPage.emailOrPhoneNumberInput(UserConfig.USER_EMAIL);
    }

    @Then("Check {string} visibility")
    public void checkVisibility(String arg0) {
        regPage.contentVisibility(arg0);
    }
}
