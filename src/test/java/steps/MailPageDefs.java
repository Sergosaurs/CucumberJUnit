package steps;

import config.UserConfig;
import io.cucumber.java.ru.И;
import pages.MailPage;

public class MailPageDefs {
    MailPage mailPage = new MailPage();


    @И("вводим имя аккаунта")
    public void inputName() {
        mailPage.mailPageNameInput(UserConfig.USER_ACCOUNT_NAME);
    }

    @И("видим письмо с заголовком {string}")
    public void shouldSeeOnPage(String arg0) {
        mailPage.contentInMailSiteIsVisible(arg0);
    }
}
