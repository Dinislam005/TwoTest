package Components;

import static com.codeborne.selenide.Selenide.$;


public class CalendarComponent {
    public void setDate(String day, String month, String year) {

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day.react-datepicker__day--003.react-datepicker__day--weekend").click();

    }

}
