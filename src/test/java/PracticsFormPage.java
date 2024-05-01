import Components.CalendarComponent;
import Components.RegistrationResultModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticsFormPage {
    private final String TITLE_TEXT = "Student Registration Form";
    private CalendarComponent CalendarComponent = new CalendarComponent();
    private RegistrationResultModal registrationResultModal = new RegistrationResultModal();


    public PracticsFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));

        return this;
    }

    public PracticsFormPage setFormPage(String value) {
        $("#firstName").setValue("value");

        return this;
    }

    public PracticsFormPage setLastName(String value) {
        $("#lastName").setValue(value);

        return this;
    }

    public PracticsFormPage setEmailName(String value) {
        $("#userEmail").setValue(value);

        return this;
    }

    public PracticsFormPage setGender(String value) {
        $("#genterWrapper").$(byText("Male")).click();

        return this;
    }

    public PracticsFormPage setPhone(String value) {
        $("#userNumber").setValue(value);

        return this;
    }

    public PracticsFormPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        CalendarComponent.setDate(day, month, year);
        return this;
    }

    public PracticsFormPage setSubjects(String value) {
        $("subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public PracticsFormPage setHobbies(String value) {
        $("#hobbiesWrapper").$(byText("Sport")).click();

        return this;
    }


    public PracticsFormPage verifyResultModalAppears() {
        registrationResultModal.verifyModalAppears();

        return this;

    }

    public PracticsFormPage verifyResult(String key, String value) {
        registrationResultModal.verifyResult(key, value);

        return this;

    }
}
