package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getAttributeTextAndLocatorsPractice {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        System.out.println("driver = " + driver);
        // Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMe_Element=driver.findElement(By.className("login-item-checkbox-label"));
       String actualLabeltext= rememberMe_Element.getText();
       String expectedLabeltext="Remember me on this computer";
       if(actualLabeltext.equalsIgnoreCase(expectedLabeltext)){
           System.out.println("Text verification is PASSed!  " + expectedLabeltext);
       }else {
           System.out.println("Text verification is FAIL  " + expectedLabeltext);
       }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgetPass_Element=driver.findElement(By.className("login-link-forgot-pass"));
        String actualPassText=forgetPass_Element.getText();
        String expectedPassText="Forgot your password?";
        if(actualPassText.equals(expectedPassText)){
            System.out.println("Text verification is PASSed!  " + actualPassText);
        }else{
            System.out.println("Text verification is FAIL  " + actualPassText);
        }
        //5- Verify “forgot password” href attribute’s value contains expected:


        String attributeForgetPass=forgetPass_Element.getAttribute("href");
        String expectedAttributeForgetPass="forgot_password=yes";
        if(attributeForgetPass.contains(expectedAttributeForgetPass)){
            System.out.println("Attribute verification is PASSed!  " + expectedAttributeForgetPass);
        }else{
            System.out.println("Attribute verification is FAIL  " + expectedAttributeForgetPass);
        }

        driver.quit();


    }
}


/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
PS: Inspect and decide which locator you should be using to locate web
element
 */