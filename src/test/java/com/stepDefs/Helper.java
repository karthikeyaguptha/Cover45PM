package com.stepDefs;

import jdk.dynalink.beans.StaticClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.linksandpaths.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

public class Helper {

   public static WebDriver driver;


    //    @Test(priority = 1)
    public static void OB()
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cover4pm.itcinfotech.com/Cover4PM6/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

//    @Test(priority = 2)
    public static void CB()
    {
        driver.close();
    }

    public static void Take_ScreenShot_Success() throws IOException {
        TakesScreenshot TS=(TakesScreenshot)driver;
        File Src=TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File("C:/Users/Karthik Guptha/IdeaProjects/Cover45PM/target/Division_ScreenShots/Created_Division.png");
        FileHandler.copy(Src,TRG);
    }

    public static void Take_ScreenShot_Failure() throws IOException {
        TakesScreenshot TS=(TakesScreenshot)driver;
        File Src=TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File("C:/Users/Karthik Guptha/IdeaProjects/Cover45PM/target/Division_ScreenShots/Not_Created_Division.png");
        FileHandler.copy(Src,TRG);
    }


}
