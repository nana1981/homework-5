package ee.ge;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.runner;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class elitelectronics extends runner {

    @Test
    public void test1(){
    $ (byText("რეგისტრაცია")).click();
    Assert.assertTrue($(byText("რეგისტრაცია")).isDisplayed());
    $ (byAttribute("id","firstName")).setValue("nana");
    Assert.assertEquals($(byAttribute("id","firstName")).getValue(),"nana");
    $ (byAttribute("id","lastName")).setValue("sachaneli");
    Assert.assertEquals($(byAttribute("id","lastName")).getValue(),"sachaneli");
    $ (byAttribute("id","email")).setValue("nana.sachaneli@gmail.com");
    Assert.assertEquals($(byAttribute("id","email")).getValue(),"nana.sachaneli@gmail.com");
    $ (byAttribute("id","password")).setValue("testelit");
    Assert.assertEquals($(byAttribute("id","password")).getValue(),"testelit");
    $ (byAttribute("id","confirmPassword")).setValue("testelit");
    Assert.assertEquals($(byAttribute("id","confirmPassword")).getValue(),"testelit");
    $ (byAttribute("id","singup"));
    Assert.assertTrue($(byAttribute("id","singup")).isEnabled());
}

    @Test
    public void test2 (){
        $ (byText("რეგისტრაცია")).click();
        Assert.assertTrue($(byText("რეგისტრაცია")).isDisplayed());
        $ ("#singup");
        Assert.assertTrue($ ("#singup").isDisplayed());
        $ ("#firstName").click();
        $ ("#lastName").click();
        $ (byText("სახელი სავალდებულოა"));
        Assert.assertTrue($(byText("სახელი სავალდებულოა")).isDisplayed());
        $ ("#email").click();
        $ (byText("გვარი სავალდებულოა"));
        Assert.assertTrue($(byText("გვარი სავალდებულოა")).isDisplayed());
        $ ("#password").click();
        $ (byText("ელ. ფოსტა სავალდებულოა"));
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $ ("#confirmPassword").click();
        $ (byText("პაროლი სავალდებულოა."));
        Assert.assertTrue($(byText("პაროლი სავალდებულოა.")).isDisplayed());
        $ ("#password").click();
        $ (byText("პაროლის გამეორება სავალდებულოა"));
        Assert.assertTrue($(byText("პაროლის გამეორება სავალდებულოა")).isDisplayed());
        $ ("#email").setValue("test");
        Assert.assertEquals($ ("#email").getValue(),"testgpi");
        $ (byText("ელ. ფოსტა სავალდებულოა"));
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $ ("#email").sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        $ ("#email").setValue("test@");
        $ (byText("ელ. ფოსტა სავალდებულოა"));
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $ ("#email").sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        $ ("#email").setValue("test@gmail");
        $ (byText("ელ. ფოსტა სავალდებულოა"));
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $ ("#email").sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        $ ("#password").setValue("Test1");
        $ (byText("პაროლი სავალდებულოა."));
        Assert.assertTrue($(byText("პაროლი სავალდებულოა.")).isDisplayed());
        $ ("#password").sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        $ ("#password").setValue("Test1234");
        $ ("#confirmPassword").setValue("Test1");
        $ (byText("პაროლის გამეორება სავალდებულოა"));
        Assert.assertTrue($(byText("პაროლის გამეორება სავალდებულოა")).isDisplayed());
    }


    @Test
    public void test3 (){
        $ (".cart").click();
        $ (byText("კალათა ცარიელია"));
        Assert.assertTrue($(byText("კალათა ცარიელია")).isDisplayed());
        $ (byAttribute("id","search_list")).setValue("ნოუთბუქი").pressEnter();
        $ (".add_to_cart", 0).click();
        $ (".cart").click();
        $ (byText("სრული ღირებულება"));
        Assert.assertTrue($(byText("სრული ღირებულება")).isDisplayed());
        $ (byText("წაშლა")).click();
        $ (byText("კალათა ცარიელია"));
        Assert.assertTrue($(byText("კალათა ცარიელია")).isDisplayed());

    }

    @Test
    public void  test4 (){
        $ (".cart").click();
        $ (byText("კალათა ცარიელია")).shouldBe(Condition.visible, Duration.ofMillis(3000));
        Assert.assertTrue($(byText("კალათა ცარიელია")).isDisplayed());
        sleep(3000);
        $ (byText("შენახული ნივთები")).click();
        $ (byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $ (byAttribute("id","search_list")).setValue("გაზ").pressEnter();
        $ (".add_to_cart", 0).click();
        $ (".cart").click();
        $ (byText("შენახვა")).click();
        $ (byText("შენახული ნივთები")).click();
        $ (".product-container").shouldHave(Condition.text("დაამატე კალათში"));
        $ (".cart").click();
        $ (byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $ (byText("შენახული ნივთები")).click();
        $ (".cross_icon").click();
        $ (".notItemFound").shouldHave(Condition.visible,Condition.text("ვერ მოიძებნა"));
  }


}
