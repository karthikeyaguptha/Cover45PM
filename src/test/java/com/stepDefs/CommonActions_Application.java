package com.stepDefs;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonActions_Application extends Helper{

    public static void Login()
    {
        driver.findElement(By.xpath("//input[@id='LoginId']")).sendKeys("User 3");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("User3@123");
        driver.findElement(By.xpath("//button[@class='k-button k-primary']")).click();
    }

    public static void LOAD_DIVISIONS_URL()
    {
        driver.get("https://cover4pm.itcinfotech.com/Cover4PM6/Masters/CommonMaster/Division");
    }

    public static void Wait_Page_For_Load()
    {
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }

    public static void Click_Add_Button()
    {
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary k-button k-button-icontext k-grid-add']")).click();
    }

    public static void Create_New_Division() throws IOException {
        Actions Act = new Actions(driver);
        driver.findElement(By.xpath("//input[@id='DivisionName']")).sendKeys("DIV1");
        Act.sendKeys(Keys.TAB).perform();
        driver.findElement(By.xpath("//input[@id='DivisionCode']")).sendKeys("DC1");
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary cstmSaveCancel k-button k-button-icontext k-grid-save-changes']")).click();
        try
        {
            WebElement SaveMsg=driver.findElement(By.xpath("//*[@id='saveAlertMessage']/p"));
            Assert.assertTrue(SaveMsg.isDisplayed());
            System.out.println("Division Created Successfully");
            Helper.Take_ScreenShot_Success();
            Helper.CB();
        }
        catch (Throwable t){
            WebElement DelMsg = driver.findElement(By.xpath("//*[@class='deleteAlertErrorMessage']"));
            Assert.assertTrue(DelMsg.isDisplayed());
           System.out.println("DIV1 cannot be Inserted/Updated since it already exists.");
           Helper.Take_ScreenShot_Failure();
           Helper.CB();
        }


    }
}
