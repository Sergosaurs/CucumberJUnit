package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Setup {
    @Before
    public void openUrl(){
        open("https://account.mail.ru/login?page=https%3A%2F%2Fe.mail.ru%2Fmessages%2Finbox%2F&allow_external=1");
    }
}
