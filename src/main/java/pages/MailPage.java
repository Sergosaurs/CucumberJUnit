package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class MailPage {

    private SelenideElement nameInput = $(xpath("//input[@placeholder='Имя аккаунта']"));


    public void mailPageNameInput(String text) {
        this.nameInput.val(text);
    }

    public void contentInMailSiteIsVisible(String text) {
        $(xpath("//*[text()= '" + text + "']")).shouldBe(Condition.visible);
    }
}
