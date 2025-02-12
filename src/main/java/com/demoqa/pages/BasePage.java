package com.demoqa.pages;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

public class BasePage {
    @BeforeEach
    void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 10000;
        Configuration.screenshots = true;
        Configuration.headless = false;
    }
}
