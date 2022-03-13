package utils;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;


public class runner {
  @BeforeTest
    public static void setup (){
        open ("https://ee.ge/");
    }
}
