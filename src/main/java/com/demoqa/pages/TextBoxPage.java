package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage extends BasePage{
    // Локаторы
    private final SelenideElement fullNameInput = $("#userName");
    private final SelenideElement emailInput = $("#userEmail");
    private final SelenideElement submitButton = $("#submit");
    private final SelenideElement currentAddress = $("#currentAddress");

    // Методы
    public TextBoxPage openPage() {
        open("/text-box");
        return this;
    }

    public TextBoxPage enterFullName(String name) {
        fullNameInput.setValue(name);
        return this;
    }

    public TextBoxPage enterEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public TextBoxPage enterCurrentAddress(String Address) {
        currentAddress.setValue(Address);
        return this;
    }

    public TextBoxPage submitForm() {
        submitButton.click();
        return null;
    }

    // Проверки
    public SelenideElement getNameResult() {
        return $("#name");
    }
}
