package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("https://practice.cydeo.com");

        //3.Locate the element

        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();
        String actualTitle_AB_Testing=driver.getTitle();
        String expectedTitle_AB_Testing="No A/B Test";
        if(actualTitle_AB_Testing.equals(expectedTitle_AB_Testing)){
            System.out.println("A/B Testing Title verification is PASS  " + expectedTitle_AB_Testing);
        }else{
            System.out.println("A/B Testing Title verification is FAIL  " + expectedTitle_AB_Testing);
        }


        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        //Verify Title
        //Expected Title: "Practice"
        String actualTitle=driver.getTitle();
        String expectedTitle="Practice";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is PASS! " + expectedTitle);
        }else{
            System.out.println("Title verification is FAIL!  " + expectedTitle);
        }
        Thread.sleep(3000);

        //Close the browser
       // driver.close();
   }

    /*
    TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practice
     */
}
