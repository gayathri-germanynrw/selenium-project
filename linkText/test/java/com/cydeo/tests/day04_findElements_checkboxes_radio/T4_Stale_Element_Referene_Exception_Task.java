package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T4_Stale_Element_Referene_Exception_Task {
    public static void main(String[] args) {
//        TC #4: StaleElementReferenceException Task
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
//        3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLinkElement = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        cydeoLinkElement.isDisplayed();


//        4- Refresh the page.
        driver.navigate().refresh();

//        5- Verify it is displayed, again. // Without below line of code we will get staleElementReferenceException
        // solve this exception with below statement
        cydeoLinkElement = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        System.out.println("cydeoLinkElement.isDisplayed() = expected as true===>" + cydeoLinkElement.isDisplayed());

//                This is a simple StaleElementReferenceException to understand what is
//        this exception and how to handle it.

    }
}
/*
TC #4: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.
This is a simple StaleElementReferenceException to understand what is
this exception and how to handle it.
 */