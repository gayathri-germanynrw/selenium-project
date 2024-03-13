package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetTextAndAttributeMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.navigate().to("https://practice.cydeo.com/registration_form");
        Thread.sleep(3000);

        //  3- Verify header text is as expected:
       // Expected: Registration form
       WebElement regFormElement= driver.findElement(By.tagName("h2"));
       String actualText= regFormElement.getText();
       String expectedText="Registration form";
       if(actualText.equals(expectedText)){
           System.out.println("Text verification is PASS  " + expectedText);
       }else {
           System.out.println("Text verification is FAIL  " + expectedText);
       }

       // 4- Locate “First name” input box
        WebElement firstNameWebElement=driver.findElement(By.className("form-control"));
        String actualValue=firstNameWebElement.getAttribute("placeholder");
        String expectedValue="first name";
        if(actualValue.equals(expectedValue)){
            System.out.println("Attribute verification is PASS  " + expectedValue);
        }else {
            System.out.println("Attribute verification is FAIL  " + expectedValue);
        }


    }
}

/*TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name


 */