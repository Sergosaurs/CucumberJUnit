package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StarPage;

public class StartPageDefs {

    StarPage startPage = new StarPage();

    @When("click the button {string}")
    public void clickButton(String arg0) {
        startPage.clickStarPageButton(arg0);
    }

    @Then("Check content {string} visibility")
    public void checkContent(String arg0) {
        startPage.contentIsVisible(arg0);
    }

    @And("Click {string} button")
    public void clickSignInButton(String arg0) {
        startPage.clickButtonSpan(arg0);
    }

    @Then("Click on {string} button")
    public void clickOnButton(String arg0) {
        startPage.clickButtonApplicant(arg0);
    }

    @And("click {string} button")
    public void clickLogInButton(String arg0) {
        startPage.clickButtonSpan(arg0);
    }

    @Then("click profile button")
    public void clickProfileButton() {
        startPage.clickProfileButton();
    }

    @And("Check user name visibility")
    public void checkUserNameVisibility() {
        startPage.contentInProfileIsVisible();
    }
}

