package com.cydeo.tests.day02_locators_getText_getAttribute.extra_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        // Click to alle akzeptieren
        WebElement accptButtonElement = driver.findElement(By.id("L2AGLb"));
        accptButtonElement.click();
        //3- Click to Gmail from top right.
        WebElement gmailElement = driver.findElement(By.linkText("Gmail"));
        gmailElement.click();

        //4- Verify title contains:
        //Expected: Gmail

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification is PASS  " + actualTitle);
        } else {
            System.out.println("Title verification is FAIL  " + actualTitle);
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();
        Thread.sleep(3000);

        //6- Verify title equals:
        //Expected: Google
        String actualTitleGoogle = driver.getTitle();
        String expectedTitleGoogle = "Google";
        if (actualTitleGoogle.equals(expectedTitleGoogle)) {
            System.out.println("Title verification is PASS  " + actualTitleGoogle);
        } else {
            System.out.println("Title verification is FAIL  " + actualTitleGoogle);
        }
       driver.quit();
    }
}

/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */