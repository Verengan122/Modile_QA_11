package steps;

import io.qameta.allure.Step;
import pages.PagesObjects;

import static com.codeborne.selenide.Condition.text;

public class StepsTest extends PagesObjects {

    @Step("Проверяем доступность выбора языка и переходим к следующему пункту")
    public StepsTest languageAccessibilityCheck() {

        langContainer
                .shouldHave(text("ADD OR EDIT LANGUAGES"));
        forwardButton
                .click();

        return this;
    }

    @Step("Проверяем текст 'New ways to explore' и переходим к следующему пункту")
    public StepsTest textСheckNewWaysToExplore() {

        primaryTextViev
                .shouldHave(text("New ways to explore"));
        forwardButton
                .click();

        return this;
    }
    @Step("Проверяем текст 'New ways to explore' и переходим к следующему пункту")
    public StepsTest textСheckReadingListsWithSync() {

        primaryTextViev
                .shouldHave(text("Reading lists with sync"));
        forwardButton
                .click();

        return this;
    }

    @Step("Проверяем текст 'Send anonymous data' и слайдер")
    public StepsTest textСheckAndSlider() {

        primaryTextViev
                .shouldHave(text("Send anonymous data"));
        androidWidget
                .shouldHave(text("Send usage data"));
        androidWidget
                .click();
        androidWidget
                .attr("checked").equals(false);

        return this;
    }

}
