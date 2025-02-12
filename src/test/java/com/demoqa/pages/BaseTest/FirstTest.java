package com.demoqa.pages.BaseTest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class FirstTest {
    @Test
    public  void OpenDemoQASite(){
        Configuration.browser = "chrome"; // Указываем браузер
        open("https://demoqa.com");      // Открываем сайт
        $(".banner-image").shouldBe(visible); // Проверяем, что элемент виден
    }
}
