package tests.emulator;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.StepsTest;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NewWikiMobileTest extends TestBase {
    @Test
    void wikiTest() {
        step("Verify First Page Getting Started", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("The Free Encyclopedia …in over 300 languages"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Verify Second Page Getting Started", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("New ways to explore"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Verify Third Page Getting Started", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("Reading lists with sync"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Verify Fourth Page Getting Started", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("Send anonymous data"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
        step("Verify Open Home screen", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/main_toolbar_wordmark"))
                        .shouldBe(Condition.visible));
    }

//    @Test
//    @DisplayName("Проверка стартовых экранов и поиска в приложении")
//    void searchNewWikiTest() {
//        new StepsTest()
//                .languageAccessibilityCheck()
//                .textСheckNewWaysToExplore()
//                .textСheckReadingListsWithSync()
//                .textСheckAndSlider();
//        }
    }