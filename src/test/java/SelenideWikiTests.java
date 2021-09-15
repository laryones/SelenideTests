import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class SelenideWikiTests {

        @BeforeAll
        static void beforeAll() {
            Configuration.startMaximized = true;
        }

        @Test
        void checkWikiSelenide() {
            // Откройте страницу Selenide в Github
            open("https://github.com/selenide/selenide");

            // Перейдите в раздел Wiki проекта
            $("#wiki-tab").click();

            // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
            $("#wiki-pages-filter").setValue("SoftAssertions");
            $(byText("SoftAssertions")).click();

            // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
            $("#wiki-body").$(byText("com.codeborne.selenide.junit5.SoftAssertsExtension"));

        }
    }


