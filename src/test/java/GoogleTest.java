import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GoogleTest {

    @BeforeAll
    static void setUp() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void googleSearchTest() {
        Selenide.open("https://www.google.com/");
        Selenide.$("[role=combobox]").setValue("Selenide").pressEnter();
        Selenide.$("[role=text]").shouldHave(Condition.partialText("selenide"));
    }

    @Test
    public void yandexSearchTest() {
        Selenide.open("https://www.yandex.com/");
        Selenide.$("[role=combobox]").setValue("Selenide").pressEnter();
        Selenide.$("[role=text]").shouldHave(Condition.partialText("selenide"));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "https://www.google.com/", "https://www.yandex.com/"
    })
    public void SearchTest(String url) {
        Selenide.open(url);
        Selenide.$("[role=combobox]").setValue("Selenide").pressEnter();
        Selenide.$("[role=text]").shouldHave(Condition.partialText("selenide"));
    }
}
