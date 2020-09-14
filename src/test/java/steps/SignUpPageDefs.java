package steps;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Ктомуже;
import pages.SignUpPage;

public class SignUpPageDefs {

    SignUpPage signUpPage = new SignUpPage();

    @И("вводим в поле {string} значение {string}")
    public void inputValues(String text, String value) {
        signUpPage.inputValue(text, value);
    }

    @Ктомуже("проверяем, что в поле {string} есть значение")
    public void checkFilledFields(String text) {
        signUpPage.checkForFilledFields(text);
    }
}

