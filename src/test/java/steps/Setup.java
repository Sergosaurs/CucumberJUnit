package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Setup {
    @Before
    public void openUrl(){
        open("https://hh.ru/");
    }

}
