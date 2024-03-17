package com.cydeo.tests.day03_cssSelector_xpath.extratasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver= WebDriverFactory.getDriver("chrome");
       // 2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//div[.='Accept']"));


        // 3. Search for “wooden spoon” with //input[@type='text']
        //WebElement searchElement=driver.findElement(By.xpath("//input[@type='text']"));

      //  WebElement searchElement=driver.findElement(By.xpath("//input[@data-id='search-query']"));

        // cssSelector locator
        //Syntax #1: tagName[attribute='value']
        //Syntax #2: for id : --> tag#idValue, for class : --> tag.classValue
       // WebElement searchElement=driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));
        WebElement searchElement=driver.findElement(By.cssSelector("input#global-enhancements-search-query"));




        searchElement.sendKeys("wooden spoon");
        searchElement.sendKeys(Keys.ENTER);

        // 4. Verify title:
        //Expected: “Wooden spoon - Etsy”
        String actualTitle=driver.getTitle();
        String expectedTitle="Wooden spoon - Etsy.de";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is PASS! " + expectedTitle);
        }else{
            System.out.println("Title verification is FAIL!  " + expectedTitle);
        }



        driver.quit();

    }
}

/*
HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon - Etsy”
 */
