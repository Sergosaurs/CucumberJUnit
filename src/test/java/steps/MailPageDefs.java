package steps;

import config.UserConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.MailPage;

public class MailPageDefs {
    MailPage mailPage = new MailPage();


    @When("input account name")
    public void inputName() {
        mailPage.mailPageNameInput(UserConfig.USER_ACCOUNT_NAME);
    }

    @And("Should see on page {string}")
    public void shouldSeeOnPage(String arg0) {
        mailPage.contentInMailSiteIsVisible(arg0);
    }
}
