package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("https://practice.cydeo.com");
        Thread.sleep(3000);

        //Verify URL
        //Expected : "cydeo"
        String currentURL=driver.getCurrentUrl();
        String expectedURL="cydeo";


        //Verify Title
        // Expected : "Practice";
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();

        if (currentURL.contains(expectedURL)) {
            System.out.println("URL verification PASSED! " + driver.getCurrentUrl());

        } else {
            System.out.println("URL verification FAILED! ");
        }

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification also PASSED!  ");

        } else {
            System.out.println("Title Verification FAILED! ");
        }
        //Close the browser
        driver.close();


    }
}

/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practice
 */