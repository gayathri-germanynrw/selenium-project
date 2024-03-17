package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T_xpath {
    public static void main(String[] args) {
       //<@1151602558280929280> driver.findElement(By.xpath("//div[.='Accept all']")).click();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // XPATH Syntax ::: //tagName[@attribute='value']   ::: here //input[@type='submit']

        /* first Way with //input[@type='submit'] with type attribute's value*/
       // WebElement loginBtnWebElement=driver.findElement(By.xpath("//input[@type='submit']"));

        /* second Way with "//input[@value='Log In']" with type value's value*/
        //WebElement loginBtnWebElement=driver.findElement(By.xpath("//input[@value='Log In']"));

        /* Third Way with "//input[@class='login-btn']" with type class's value*/
        WebElement loginBtnWebElement= driver.findElement(By.xpath("//input[@class='login-btn']"));

        String actualLoginBtnText=loginBtnWebElement.getAttribute("value");
         String expectedLoginBtnText="Log In";
        if(actualLoginBtnText.equals(expectedLoginBtnText)){
            System.out.println("Text verification is PASS  " + actualLoginBtnText);
        }else {
            System.out.println("Text verification is FAIL  " + actualLoginBtnText);
        }
    }
}
