package tests.emulator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.StepsTest;

public class NewWikiMobileTest extends TestBase {

    @Test
    @DisplayName("Проверка стартовых экранов и поиска в приложении")
    void searchNewWikiTest() {
        new StepsTest()
                .languageAccessibilityCheck()
                .textСheckNewWaysToExplore()
                .textСheckReadingListsWithSync()
                .textСheckAndSlider();
        }
    }