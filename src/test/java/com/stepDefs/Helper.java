package com.stepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Helper {

    public static WebDriver driver;


    //    @Test(priority = 1)
    @BeforeMethod
    public static void OB() {
        System.setProperty("webdriver.chrome.driver", "chromedriver_L.exe");
        driver = new ChromeDriver();
        driver.get("https://cover4pm.itcinfotech.com/Cover4PM6/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    //    @Test(priority = 2)
    @AfterMethod
    public static void CB() {
        driver.close();
    }

    public static void Take_ScreenShot_Success() throws IOException {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File Src = TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File("C:/Users/Karthik Guptha/IdeaProjects/Cover45PM/target/Division_ScreenShots/Created_Division.png");
        FileHandler.copy(Src, TRG);
    }

    public static void Take_ScreenShot_Failure() throws IOException {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File Src = TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File("C:/Users/Karthik Guptha/IdeaProjects/Cover45PM/target/Division_ScreenShots/Not_Created_Division.png");
        FileHandler.copy(Src, TRG);
    }

    public static void Take_ScreenShot_Delete_Success() throws IOException {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File Src = TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File("C:/Users/Karthik Guptha/IdeaProjects/Cover45PM/target/Division_ScreenShots/Deleted_Division.png");
        FileHandler.copy(Src, TRG);
    }

    public static void Take_ScreenShot_Delete_Failure() throws IOException {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File Src = TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File("C:/Users/Karthik Guptha/IdeaProjects/Cover45PM/target/Division_ScreenShots/Not_Deleted_Division.png");
        FileHandler.copy(Src, TRG);
    }

    public static void Take_ScreenShot_Edit_Success() throws IOException {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File Src = TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File("C:/Users/Karthik Guptha/IdeaProjects/Cover45PM/target/Division_ScreenShots/Edited_Division.png");
        FileHandler.copy(Src, TRG);
    }

    public static void Take_ScreenShot_Edit_Failure() throws IOException {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File Src = TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File("C:/Users/Karthik Guptha/IdeaProjects/Cover45PM/target/Division_ScreenShots/Not_Edited_Division.png");
        FileHandler.copy(Src, TRG);
    }

    public static void SCRNSHT(String SCRNSHTNAME) throws IOException {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File Src = TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File("C:/Users/Karthik Guptha/IdeaProjects/Cover45PM/target/ScreenShots/"+SCRNSHTNAME+SCRNSHTDATEANDTIMESTAMP()+".png");
        FileHandler.copy(Src, TRG);
    }

    public static String SCRNSHTDATEANDTIMESTAMP()
    {
        return new SimpleDateFormat("_dd-MM-yyyy_HH_mm_ss").format(new Date());
    }


}
