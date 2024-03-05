package ru.blinov;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQaFormTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void demoQaFormTest() {

    open("/automation-practice-form");
    $("#firstName").setValue("Виктор");
    $("#lastName").setValue("Романенко");
    $("#userEmail").setValue("simple@mail.com");
    $("#genterWrapper").$(byText("Female")).click();
    $("#userNumber").setValue("9123456789");
    $("#dateOfBirthInput").click();
    $(".react-datepicker__month-select").selectOption("May");
    $(".react-datepicker__year-select").selectOption("1905");
    $(".react-datepicker__day--001:not(.react-datepicker__day--outside-month)").click();
    $("#subjectsInput").setValue("Math").pressEnter();
    $("#hobbiesWrapper").$(byText("Sports")).click();
    $("#uploadPicture").uploadFromClasspath("img/1.png");
    $("#currentAddress").setValue("Moskva");
    $("#state").click();
    $("#stateCity-wrapper").$(byText("NCR")).click();
    $("#city").click();
    $("#stateCity-wrapper").$(byText("Noida")).click();
    $("#submit").click();


    $(".modal-dialog").should(appear);
    $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

    $(".table-responsive").shouldHave(text("Student Name"));





    }
}
