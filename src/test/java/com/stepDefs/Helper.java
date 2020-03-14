package com.stepDefs;

import jdk.dynalink.beans.StaticClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.linksandpaths.*;
import org.testng.annotations.Test;

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


}
