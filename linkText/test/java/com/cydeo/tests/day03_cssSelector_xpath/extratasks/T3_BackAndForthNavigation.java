package com.cydeo.tests.day03_cssSelector_xpath.extratasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        driver.findElement(By.xpath("//div[.='Alle akzeptieren']")).click();
        //3- Click to Gmail from top right. ex: (By.xpath("//input[@data-id='search-query']"));
        // using xpath ::: "//tagName[@attribute='value']"
        WebElement gmailElement = driver.findElement(By.xpath("//a[@class='gb_H']"));
        Thread.sleep(2000);
        String actualTitle = gmailElement.getText();
        gmailElement.click();
        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitle = "Gmail";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is PASS! " + expectedTitle);
        } else {
            System.out.println("Title verification is FAIL!  " + expectedTitle);
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Google
        // Example ::: driver.findElement(By.xpath("//h3"));
        //WebElement titleGoogleElement=driver.findElement(By.xpath("//title"));

        Thread.sleep(3000);
        String actualGoogleTitle = driver.getTitle();
        System.out.println("actualGoogleTitle = " + actualGoogleTitle);
        String expectedGoogleTitle = "Google";
        if (actualGoogleTitle.equals(expectedGoogleTitle)) {
            System.out.println("Title verification is PASS  " + expectedGoogleTitle);
        } else {
            System.out.println("Title verification is FAIL  " + expectedGoogleTitle);
        }
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
