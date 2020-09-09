package pages;

import com.codeborne.selenide.Condition;
import config.UserConfig;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class StarPage {

    public void clickStarPageButton(String text) {
        $(xpath("(//*[@data-qa=\"login\"])[2]")).click();
    }

    public void clickButtonSpan(String text) {
        $(xpath("//button[text() = '" + text + "']")).click();
    }

    public void clickProfileButton(){
        $(xpath("//button[@data-qa='mainmenu_applicantProfile ']")).click();
    }



    public void contentIsVisible(String text) {
        $(xpath("//*[text() = '" + text + "']")).shouldBe(Condition.visible);
    }

    public void contentInProfileIsVisible() {
        $(xpath("//*[text() = '" + UserConfig.USER_NAME +" "+ UserConfig.USER_LASTNAME + "']")).shouldBe(Condition.visible);

    }

    public void clickButtonApplicant(String text) {
        $(xpath("//a[text() = '" + text + "']")).click();
    }
}
