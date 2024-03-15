package com.cydeo.tests.day02_locators_getText_getAttribute.extra_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankHeaderVerfication {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
          //Locate header
        WebElement headerElement=driver.findElement(By.tagName("h3"));
        String actualHeaderText= headerElement.getText();
        String expectedHeaderText="Log in to ZeroBank";
         //Expected: “Log in to ZeroBank”
        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Text verification is PASS  " + expectedHeaderText);
        }else{
            System.out.println("Text verification is FAIL  " + expectedHeaderText);
        }

        driver.close();
    }
}

/*

HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */
