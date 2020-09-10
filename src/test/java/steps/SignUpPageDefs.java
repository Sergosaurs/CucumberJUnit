package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import io.cucumber.java.ru.И;
import pages.SignUpPage;

public class SignUpPageDefs {

    SignUpPage regPage = new SignUpPage();

    @И("вводим имя")
    public void inputName() {
        regPage.nameInput(UserConfig.USER_NAME);
    }


    @И("вводим фамилию")
    public void inputLastname() {
        regPage.lastNameInput(UserConfig.USER_LASTNAME);
    }

    @И("вводим email")
    public void inputEmailOrPhoneNumber() {
        regPage.emailOrPhoneNumberInput(UserConfig.USER_EMAIL);
    }

    @Then("Check {string} visibility")
    public void checkVisibility(String arg0) {
        regPage.contentVisibility(arg0);
    }

    @И("вводим пароль")
    public void inputPassword() {
        regPage.passwordInput(UserConfig.USER_PASSWORD);
    }
}
