package com.cydeo.tests.day03_cssSelector_xpath.extratasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_BackAndForthNavi_Instructor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        driver.findElement(By.xpath("//div[.='Alle akzeptieren']")).click();

       // 3- Click to Gmail from top right.

       // WebElement gmailElement=driver.findElement(By.xpath("//a[@aria-label='Gmail (Öffnet einen neuen Tab.)']"));

        // Using the text of the web element with XPATH locator
        //tagName[text()='textValue'] --> tagName[.='textValue']
        // WebElement gmailElement=driver.findElement(By.xpath("//a[text()='Gmail']"));
       // WebElement gmailElement=driver.findElement(By.xpath("//a[.='Gmail']"));

        // Locating the Gmail link using cssSelector
        //-->tagName[attribute='value']
        WebElement gmailElement=driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']"));
        gmailElement.click();



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
