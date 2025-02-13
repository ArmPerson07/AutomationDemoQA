package com.demoqa.pages.BaseTest;

import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTest extends TextBoxPage {

    @Test
    void shouldSubmitFormWithValidData() {
        TextBoxPage textBoxPage = new TextBoxPage()
                .openPage()
                .enterFullName("John Doe")
                .enterEmail("john@example.com")
                .enterCurrentAddress("Red Square");
    }
}
