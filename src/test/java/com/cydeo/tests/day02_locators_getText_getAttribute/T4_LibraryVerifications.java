package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerifications {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        //2. Go to http://library2.cybertekschool.com/login.html
        driver.navigate().to("http://library2.cybertekschool.com/login.html");
        Thread.sleep(2000);

        //3.Locate the element
        //3. Enter username: “incorrect@email.com”
        WebElement usernameElement=driver.findElement(By.className("form-control"));
        usernameElement.sendKeys("incorrect@email.com");
        //4.Locate the element
        //4. Enter password: “incorrect password”
        WebElement passwordWebElement=driver.findElement(By.id("inputPassword"));
        passwordWebElement.sendKeys("incorrect password");
        Thread.sleep(2000);
        //5. Verify: visually “Sorry, Wrong Email or Password”

        WebElement signInWebElement=driver.findElement(By.tagName("button"));
        signInWebElement.click();
        Thread.sleep(2000);
    }
}


/*
TC #4: Library verifications
1. Open Chrome browser
2. Go to http://library2.cybertekschool.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Verify: visually “Sorry, Wrong Email or Password”
displayed
PS: Locate username input box using “className” locator
Locate password input box using “id” locator
Locate Sign in button using “tagName” locator
 */
