package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tesla.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.navigate().back();
        //Stop execution for 3 seconds
        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        //Navigate to google.com using navigate().to method.
        driver.navigate().to("https://www.google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //Closes currently focused browser
        driver.close();

        //Closing all-of-the opened browsers
       // driver.quit();
    }
}
