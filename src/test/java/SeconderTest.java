import Components.RegistrationResultModal;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SeconderTest {
    PracticsFormPage practicsFormPage = new PracticsFormPage();
    RegistrationResultModal registrationResultModal = new RegistrationResultModal();
    @BeforeAll
    static void beforAll () {
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void formDemoQaTest() {
        String userName = "Alex";

        practicsFormPage.openPage()
                .setFormPage(userName)
                .setLastName("trubetskoy")
                .setEmailName("koych@mail.com")
                .setGender("Male")
                .setPhone("+7 999 678 64 98")
                .setBirthDate("03", "August", "1997");

        practicsFormPage.verifyResultModalAppears().
                verifyResult("Student Name", userName + "Alex trubetskoy")
                .verifyResult("Student Email",  "koych@mail.com")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "+7 999 678 64 98")
                .verifyResult("Date of Birth", "03 August 1997")
                .setSubjects("Physics");



    }
}
