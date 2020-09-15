package steps;

import io.cucumber.java.ru.*;
import pages.StarPage;

public class StartPageDefs {

    StarPage startPage = new StarPage();

    @Когда("жмем на кнопку Войти на стартовой странице")
    public void signInButtonOnStart() {
        startPage.clickStarPageButton();
    }

    @Затем("видим на странице {string}")
    public void findContentOnPage(String arg0) {
        startPage.contentIsVisible(arg0);
    }

    @И("жмем на {string} кнопку")
    public void clickButtons(String arg0) {
        startPage.clickByTextButton(arg0);
    }

    @Затем("жмем на {string}")
    public void clickSetPassButton(String arg0) {
        startPage.clickButtonSpan(arg0);
    }

    @И("жмем на иконку профиля")
    public void profileButtonOnStart() {
        startPage.clickProfileButton();
    }
}

