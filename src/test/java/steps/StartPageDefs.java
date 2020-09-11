package steps;

import io.cucumber.java.ru.*;
import pages.StarPage;

public class StartPageDefs {

    StarPage startPage = new StarPage();

    @И("жмем на кнопку {string}")
    public void clickButton(String arg0) {
        startPage.clickStarPageButton(arg0);

    }@И("жмем {string}")
    public void clickCreateResumeButton(String arg0) {
        startPage.clickCreateResumeButton(arg0);
    }

    @Когда("видем надпись {string}")
    public void checkContent(String arg0) {
        startPage.contentIsVisible(arg0);
    }

//    @And("Click {string} button")
//    public void clickSignInButton(String arg0) {
//        startPage.clickButtonSpan(arg0);
//    }

    @То("жмем на {string} кнопку")
    public void clickOnButton(String arg0) {
        startPage.clickButtonApplicant(arg0);
    }

    @Затем("жмем на {string}")
    public void clickLogInButton(String arg0) {
        startPage.clickButtonSpan(arg0);
    }

    @И("жмем на иконку профиля")
    public void clickProfileButton() {
        startPage.clickProfileButton();
    }

    @Тогда("проверяем имя введеное ранее")
    public void checkUserNameVisibility() {
        startPage.contentInProfileIsVisible();
    }

    @И("нажимаем {string}")
    public void click(String arg0) {
        startPage.anotherUniversalButton(arg0);
    }
}

