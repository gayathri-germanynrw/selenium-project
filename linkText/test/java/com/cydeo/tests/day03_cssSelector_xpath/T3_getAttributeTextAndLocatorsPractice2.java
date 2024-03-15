package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttributeTextAndLocatorsPractice2 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
       // 3- Verify “Log in” button text is as expected:
       // Expected: Log In ( unpaired tag so we can not use getText())
        //WebElement loginBtnWebElement=driver.findElement(By.className("login-btn"));
        //String actualLoginBtnText=loginBtnWebElement.getText();

        // Syntax ::: tagName[attribute='value']   ::: here input[type='submit']
            /* first Way with input[type='submit']*/
        //WebElement loginBtnWebElement=driver.findElement(By.cssSelector("input[type='submit']"));
            /* Second way  class attribute's value with input[class='login-btn']*/
        //WebElement loginBtnWebElement=driver.findElement(By.cssSelector("input[class='login-btn']"));
          /* Third way with value attribute's value*/
       // WebElement loginBtnWebElement=driver.findElement(By.cssSelector("input[value='Log In']"));
            //                                                         tagName.classValue
        WebElement loginBtnWebElement=driver.findElement(By.cssSelector("input.login-btn"));

        String actualLoginBtnText=loginBtnWebElement.getAttribute("value");



        String expectedLoginBtnText="Log In";
        if(actualLoginBtnText.equals(expectedLoginBtnText)){
            System.out.println("Text verification is PASS  " + actualLoginBtnText);
        }else {
            System.out.println("Text verification is FAIL  " + actualLoginBtnText);
        }


    }
}

/*

TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */


// XPATH - AbsolutePath element ( Copy full XPath)
///html/body/table/tbody/tr[2]/td/div/div/form/div[2]/input