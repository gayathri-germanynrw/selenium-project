package com.cydeo.tests.day02_locators_getText_getAttribute.extra_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_CydeoClassLocatorPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/inputs
        driver.get(" https://practice.cydeo.com/inputs");
        Thread.sleep(3000);

        //Click to “Home” link
        WebElement homeElement=driver.findElement(By.className("nav-link"));
        //locator - linkText
       // WebElement homeElement=driver.findElement(By.linkText("Home"));
        homeElement.click();
        //4- Verify title is as expected:
        //Expected: Practice
       String actualTitle= driver.getTitle();
       String expectedTitle="Practice";
       if(actualTitle.contains(expectedTitle)){
           System.out.println("Title verification is PASS! " + expectedTitle);
       }else{
           System.out.println("Title verification is FAIL!  " + expectedTitle);
       }

       driver.close();
     }
}

/*
TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator


 */
