package com.cydeo.tests.day02_locators_getText_getAttribute.extra_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_EstyTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");


        //3. Search for “wooden spoon” with name locator
      /* WebElement searchWebElement= driver.findElement(By.name("search_query"));
       searchWebElement.sendKeys("wooden spoon"+ Keys.ENTER);
       Thread.sleep(3000);*/
        //3. Search for “wooden spoon” with id locator
        WebElement searchWebElement= driver.findElement(By.id("global-enhancements-search-query"));
        searchWebElement.sendKeys("wooden spoon"+ Keys.ENTER);





       // 4. Verify title:
        // Expected: “Wooden spoon - Etsy”

        String titleWebElement=driver.getTitle();
        String expectedTitle="Wooden spoon - Etsy.de";
        if(titleWebElement.equals(expectedTitle)){
            System.out.println("Title verification is PASS  " + titleWebElement);
        }else{
            System.out.println("Title verification is FAIL  " + titleWebElement);
        }
        driver.close();
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