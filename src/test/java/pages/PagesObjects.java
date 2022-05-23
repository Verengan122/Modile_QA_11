package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class PagesObjects {
    protected SelenideElement
    langContainer = $(AppiumBy.id("org.wikipedia.alpha:id/addLangContainer"))
            .$(AppiumBy.className("android.widget.TextView")),
    forwardButton = $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
    primaryTextViev = $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")),
   androidWidget =  $(AppiumBy.className("android.widget.Switch"));


}