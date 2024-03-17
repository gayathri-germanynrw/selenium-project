package com.cydeo.tests.day03_cssSelector_xpath.extratasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_ZeroBankHeader_Verification {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // Go to: https://login1.nextbasecrm.com/
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3- Verify “Log in” button text is as expected:
        // By Using Xpath ::: // tagNAme[@attribute='value']

        WebElement headerTextElement=driver.findElement(By.xpath("//h3"));

        // solution with cssSelector
        //WebElement headerTextElement=driver.findElement(By.cssSelector("h3"));

        String actualHeaderText=headerTextElement.getText();
        System.out.println("actualHeaderText = " + actualHeaderText);
        String expectedHeaderText="Log in to ZeroBank";
        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Text verification is PASS  " + expectedHeaderText);
        }else {
            System.out.println("Text verification is FAIL  " + expectedHeaderText);
        }


    }
}

/*
HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”


 */