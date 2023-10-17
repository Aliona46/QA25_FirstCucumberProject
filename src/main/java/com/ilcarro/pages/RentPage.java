package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RentPage extends BasePage {
    public RentPage(WebDriver driver) {
        super(driver);
    }

   @FindBy(id = "pickUpPlace")
    WebElement locationFieldInput;
    public RentPage enterLocation() {
        locationFieldInput.sendKeys("Tel Aviv");
        pause(1000);
        locationFieldInput.sendKeys(Keys.DOWN, Keys.ENTER);
        pause(1000);
        return this;
    }

    @FindBy(id = "make")
    WebElement manufactureField;

    @FindBy(id = "model")
    WebElement modelField;

    @FindBy(id = "year")
    WebElement yearField;

   // @FindBy(css = "div.input-container input[formcontrolname='model']")
   //WebElement modelFrame;
    public RentPage enterManufactureModelYear(String manufacture, String model, String year) {
        type(manufactureField,manufacture);
        pause(1000);
       // clickWithJSExecutor(modelFrame,0,500);
        type(modelField,model);
        type(yearField,year);
        return this;
    }

   @FindBy(id = "fuel")
   WebElement fuelField;
    public RentPage enterFuel(String diesel) {
        Select select = new Select(fuelField);
        select.selectByVisibleText(diesel);
        return this;
    }

    @FindBy(id = "seats")
    WebElement seatsField;

    @FindBy(id = "class")
    WebElement carClassField;

    @FindBy(id = "serialNumber")
    WebElement registrationNrField;

    @FindBy(id = "price")
    WebElement priceField;

    @FindBy(id = "about")
    WebElement aboutField;

    public RentPage enterSeatsCarClassRegistrationPriceAbout(
            String seats, String carClass, String registrationNr, String price, String about) {
        type(seatsField,seats);
        type(carClassField,carClass);
        type(registrationNrField,registrationNr);
        type(priceField,price);
        type(aboutField,about);
        return this;
    }

   // @FindBy(css = "input#photos[type='file'][multiple]")
    @FindBy(id = "photos")
    WebElement addPhoto;
    public RentPage addPhotos(String photoPath) {
        addPhoto.sendKeys(photoPath);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitBtn;
    public RentPage clickOnSubmitBtn() {
        click(submitBtn);
        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement successMessage;
    public RentPage isSuccessMessageDisplayed() {
        assert isElementDisplayed(successMessage);
        return this;
    }

  /* @FindBy(tagName = "h1")
   WebElement errorMessage;
    public RentPage isErrorMessageDisplayed() {
        assert isElementDisplayed(errorMessage);
        return this;
    }*/
}
