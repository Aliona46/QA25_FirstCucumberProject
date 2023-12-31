package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    WebElement title;
    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(title);
        return this;
    }

    @FindBy(xpath = "//a[.=' Log in ']")
    WebElement loginLink;
    public LoginPage clickOnLoginLink() {
        click(loginLink);

        return new LoginPage(driver);
    }

    @FindBy(xpath = "//a[.=' Let the car work ']")
    WebElement letCarWorkLink;
    public RentPage clickOnLetTheCarWorkLink() {
        click(letCarWorkLink);
        return new RentPage(driver);
    }
}
