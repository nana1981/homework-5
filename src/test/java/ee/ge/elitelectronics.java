package ee.ge;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class elitelectronics {
    @Test
    public void test (){
    Configuration.browser = "chrome";
    open ("https://ee.ge/");
    $ (byText("რეგისტრაცია")).click();
    $ (byAttribute("id","firstName")).setValue("nana");
    $ (byAttribute("id","lastName")).setValue("sachaneli");
    $ (byAttribute("id","email")).setValue("nana.sachaneli@gmail.com");
    $ (byAttribute("id","password")).setValue("testelit");
   // $ (byText("შექმენი ახალი ანგარიში")).shouldBe(Condition.visible, Duration.ofMillis(3000));
    //$ (byAttribute("data-id","signUpFormFirstOfThree_firstname")).setValue("nana");
    //$ (byAttribute("data-id","signUpFormFirstOfThree_lastname")).setValue("sachaneli");
    //$ (byText("მდედრობითი")).click();
    //$ (byAttribute("data-id","signUpFormFirstOfThree_country")).click();
    //$ (byText("ანგილია")).click();
    //  $ (byAttribute("data-id","signUpFormFirstOfThree_documentType")).click()?
    //  $ (byText("პირადობის მოწმობა")).click();?

    // $ (byAttribute("data-id","signUpFormFirstOfThree_personalId")).setValue("01017017640");
    // $ (byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")).setValue("555390937");
    // $ (byAttribute("data-id","signUpFormFirstOfThree_username")).setValue("nana1981");
    // $ (byAttribute("data-id","signUpFormFirstOfThree_password")).setValue("nana1981");
    // $  (byText("გაგრძელება")).click();



    sleep(3000);


}

}
