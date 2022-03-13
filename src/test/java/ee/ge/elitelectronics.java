package ee.ge;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import utils.runner;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class elitelectronics extends runner {

    @Test
    public void test (){

    Configuration.browser = "chrome";

    $ (byText("რეგისტრაცია")).click();
    $ (byAttribute("id","firstName")).setValue("nana").shouldBe(Condition.visible);
    $ (byAttribute("id","lastName")).setValue("sachaneli").shouldBe(Condition.visible);
    $ (byAttribute("id","email")).setValue("nana.sachaneli@gmail.com").shouldBe(Condition.visible);
    $ (byAttribute("id","password")).setValue("testelit");
    $ (byAttribute("id","confirmPassword")).setValue("testelit");
    $ (byAttribute("id","singup")).shouldBe(Condition.enabled, Duration.ofMillis(7000));

}


}
