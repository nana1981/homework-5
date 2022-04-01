package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.*;


public class runner {
  @BeforeTest
    public static void setup (){
      Configuration.browser = "chrome";
      open ("https://ee.ge/");
    }
  @AfterTest
  public static void teardown (){
    Selenide.clearBrowserCookies();
    Selenide.clearBrowserLocalStorage();
  }
}
