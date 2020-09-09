package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class SignUpPage {

    private SelenideElement nameInput = $(xpath("//input[@placeholder='Имя']"));
    private SelenideElement lastNameInput = $(xpath("//input[@placeholder='Фамилия']"));
    private SelenideElement emailOrPhoneNumberInput = $(xpath("//input[@placeholder='Email или телефон']"));
    private SelenideElement passwordInput = $(xpath("//input[@placeholder='Пароль']"));




    public void nameInput(String text) {
        this.nameInput.val(text);
    }

    public void lastNameInput(String text) {
        this.lastNameInput.val(text);
    }

    public void emailOrPhoneNumberInput(String text) {
        this.emailOrPhoneNumberInput.val(text);
    }
    public void passwordInput(String text) {
        this.passwordInput.val(text);
    }


    public void contentVisibility(String text) {
        $(xpath("(//*[text() = '" + text + "'])[2]")).shouldBe(Condition.visible);
    }


}
