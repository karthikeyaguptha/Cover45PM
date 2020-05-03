package com.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Location_StepDefns {

    @Given("Navigating to Location URL of C45PM")
    public void navigating_to_Location_URL_of_C45PM() throws IOException {
        CommonActions_Application.LOAD_LOCATIONS_URL();

    }

    @And("Entering required details in location and Click on Save Changes Button")
    public void enteringRequiredDetailsInLocationAndClickOnSaveChangesButton() {

    }
}
