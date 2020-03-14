package com.stepDefs;

import io.cucumber.java.en.*;

import javax.swing.*;

public class Division_StepDefns extends CommonActions_Application {

    @Given("Navigating to C45PM URL")
    public void navigating_to_C45PM_URL() {

        CommonActions_Application.OB();

    }

    @Then("Entering the Username , Password and Click on Login Button")
    public void entering_the_Username_Password_and_Click_on_Login_Button() {
        CommonActions_Application.Login();

    }

    @Then("Navigating to Divisions URL of C45PM")
    public void navigating_to_Divisions_URL_of_C45PM() {
       CommonActions_Application.LOAD_DIVISIONS_URL();
       CommonActions_Application.Wait_Page_For_Load();

    }

    @Then("Entering required details and Click on Save Changes Button")
    public void entering_required_details_and_Click_on_Save_Changes_Button() {
        CommonActions_Application.Click_Add_Button();
        CommonActions_Application.Create_New_Division();
//        CommonActions_Application.Wait_Page_For_Load();

    }



}