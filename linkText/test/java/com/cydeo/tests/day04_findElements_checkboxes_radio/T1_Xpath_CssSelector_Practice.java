package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Xpath_CssSelector_Practice {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/forgot_password
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");

       // 3. Locate all the WebElements on the page using XPATH and/or CSS
       // locator only (total of 6)
       // a. “Home” link
        WebElement homeElement=driver.findElement(By.cssSelector("a[class='nav-link']"));
        //homeElement.click();
        //b. “Forgot password” header
        //WebElement frgetPassElement=driver.findElement(By.cssSelector("h2"));

        // parent > child (div[class='example']>h2)
        WebElement frgetPassElement=driver.findElement(By.cssSelector("div[class='example']>h2"));
        //parent > child (div.example>h2)
        //WebElement frgetPassElement=driver.findElement(By.cssSelector("div.example>h2"));
        String textPassword=frgetPassElement.getText();
        System.out.println("Email textPassword = " + textPassword);
        //c. “E-mail” text
        WebElement emailElement=driver.findElement(By.cssSelector("label[for='email']"));
        String txtEmail=emailElement.getText();
        System.out.println("txtEmail = " + txtEmail);

        //d. E-mail input box

        // locate the 'email' input box using xpath contains method
        //tagName[contains(@attribute, 'value')]
        WebElement emailInput_ex2 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));
        System.out.println("emailInput_ex2.isDisplayed() = " +emailInput_ex2.isDisplayed());

       // emailIPElement.sendKeys("hhh@gmail.com"+ Keys.ENTER);
        //Thread.sleep(5000);

        //e. “Retrieve password” button

       //WebElement retrivePwdBtn=driver.findElement(By.cssSelector("button#form_submit>i"));
        //WebElement retrivePwdBtn=driver.findElement(By.cssSelector("i.icon-2x"));


       // WebElement retrivePwdBtn=driver.findElement(By.xpath("//button[@id='form_submit']"));

        //e. “Retrieve password” button
        // locate it using xpath
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        //Thread.sleep(3000);
       // retrivePwdBtn.click();
       // System.out.println("retrivePwdBtn = " + retrivePwdBtn.getText());


        //f. “Powered by Cydeo text
        WebElement text_powerbycydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println("text_powerbycydeo.isDisplayed()= " + text_powerbycydeo.isDisplayed());





        driver.quit();


    }
}

/*

XPATH and CSS Selector PRACTICES

DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
 */

