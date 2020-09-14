package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class StarPage {

    public void clickStarPageButton() {
        $(xpath("(//*[@data-qa=\"login\"])[2]")).click();
    }

    public void clickButtonSpan(String text) {
        $(xpath("//span[text() = '" + text + "']/..")).click();
    }

    public void clickProfileButton() {
        $(xpath("//button[@data-qa='mainmenu_applicantProfile ']")).click();
    }

    public void universalButton(String text) {
        $(xpath("(//*[contains(text(), '" + text + "')])[1]")).click();
    }

    public void contentIsVisible(String text) {
        $(xpath("//*[contains(text(), '" + text + "') and ancestor::div]")).shouldBe(Condition.visible);
    }

}
