package com.cydeo.tests.day03_cssSelector_xpath.extratasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_LocatorPractice_Cydeo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
            //WebElement homeElement=driver.findElement(By.xpath("//a[@class='nav-link']"));
        // Using text ::: //a[text()='Home']
        //WebElement homeElement=driver.findElement(By.xpath("//a[text()='Home']"));
        //Using text ::: //a[.='Home']
        // WebElement homeElement=driver.findElement(By.xpath("//a[.='Home']"));

        //Using cssSelector(( text we can't use in cssSelector)
       //WebElement homeElement=driver.findElement(By.cssSelector("a[class='nav-link']"));
            // Another way with cssSelector ::: By.cssSelector("a.nav-link")
        WebElement homeElement=driver.findElement(By.cssSelector("a.nav-link"));
        Thread.sleep(2000);
        homeElement.click();

        //4- Verify title is as expected:
        //Expected: Practice

        String actualTitle=driver.getTitle();
        String expectedTitle="Practice";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is PASS! " + expectedTitle);
        }else{
            System.out.println("Title verification is FAIL!  " + expectedTitle);
        }

        //driver.close();
 }
}

/*
HWP #4: Practice Cydeo – xpath locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “xpath” locator

 */
