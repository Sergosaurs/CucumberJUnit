package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class StarPage {

    public void clickStarPageButton(String text) {
        $(xpath("(//*[@data-qa=\"login\"])[2]")).click();
    }

    public void clickButtonSpan(String text) {
        $(xpath("//span[text() = '" + text + "']/..")).click();
    }



    public void contentIsVisible(String text) {
        $(xpath("//*[text() = '" + text + "']")).shouldBe(Condition.visible);
    }

    public void clickButtonApplicant(String text) {
        $(xpath("//a[text() = '" + text + "']")).click();
    }
}
