package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_PartialLinkTextTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        // 3. write "apple" in search box
        // a.Locate the search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);
        // b. Press ENTER to search
        //googleSearchBox.sendKeys(Keys.ENTER);
        // c. Verify title
        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title verification is PASS  " + expectedTitle);
        } else {
            System.out.println("Title verification is FAIL  " + expectedTitle);
        }

    }
}
/*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press ENTER to search
5- Verify title:
Expected: Title should start with “apple” word
 */
