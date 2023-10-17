package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.RentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

import static com.ilcarro.pages.BasePage.driver;

public class RentSteps {


    @And("User clicks on Let the car work link")
    public void click_on_Let_the_car_work_link() {
        new HomePage(driver).clickOnLetTheCarWorkLink();
    }

    @And("User enters Location")
    public void enter_valid_Location() {
        new RentPage(driver).enterLocation();
    }

    @And("User enters Manufacture, Model, Year")
    public void enter_Manufacture_Model_Year() {
        new RentPage(driver).enterManufactureModelYear("Opel","Insignia","2020");
    }

    @And("User enters Fuel")
    public void enter_Fuel() {
        new RentPage(driver).enterFuel("Diesel");
    }

    @And("User enters Seats, Car class, Registration number,Price, About")
    public void enter_Seats_CarClass_RegistrationNumber_Price_About() {
        new RentPage(driver).enterSeatsCarClassRegistrationPriceAbout(
                "5","b","300-555-18","200","very good car");
    }

    @And("User adds Photo")
    public void add_Photo() {
        new RentPage(driver).addPhotos("C:/Users/AIT TR Student/Desktop/john.jpg");
    }

    @And("User clicks on Submit button")
    public void click_on_submitBtn() {
        new RentPage(driver).clickOnSubmitBtn();
    }

    @Then("User verifies success message is displayed")
    public void verify_success_message() {
        new RentPage(driver).isSuccessMessageDisplayed();
    }

}
