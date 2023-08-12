import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CallbacTest {
    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

    @Test
    @DisplayName("Should successful plan and replan meeting")
    void shouldSuccessfulPlanAndReplanMeeting() {
        var validUser = GeneratorForTest.Registation.generateUser("ru");
        var daysToAddForFirstMeeting = 4;
        var firstMeetingDate = GeneratorForTest.generrateDate(daysToAddForFirstMeeting);
        var daysToAddForSecondMeeting = 7;
        var secondMeetingDate = GeneratorForTest.generrateDate(daysToAddForSecondMeeting);
    }

    $("[data-test-id='city'] input").setValue(valid User.getSity());

    $("[data-test-id=date] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME),Keys.DELETE);

    $("[data-test-id=date] input").setValue(flastMeetihgDate);

    $("[data-test-id='name'] input").setValue(valIdUser.getName);

    $("[data-test-id='phone'] input").setValue(valioUser.getphone);

    $("[data-test-id='agreement']").click();

    $("button.button").click();

    $(".notification__content").shouldBe(Condition.visible, Duration.ofSeconds(15)).
    shouldHave(Condition.exactText("Встреча успешно забронирована на "+FirstMeetengDate));

    $("[data-test-id=date] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME),Keys.DELETE);

    $("[data-test-id=date] input").setValue(SecondMeetihgDate);

    $(byText("Запланировать")).click();

    $("[data-test-id='replan-notification'] notification__content").

    sholdMave(text ("У вас уже запланирована встреча на другую дату. Перепланировать?")).shouldBe(visible);

    $("[data-test-id='replan-notification'] button").click();

    $("[data-test-id='success-notification'] notification__content").

    sholdMave(text ("Встреча успешно заплпанирована на ")).

    shouldBe(visible);

}


