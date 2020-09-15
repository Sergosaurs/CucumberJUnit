package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class SignUpPage {


    public void inputValue(String text, String value) {
        $(xpath("//input[@placeholder='"+ text +"']")).val(value);
    }

    public void checkForFilledFields(String text) {
        $(xpath("//input[@placeholder='"+ text +"']")).shouldNotBe(Condition.empty);
    }
}
