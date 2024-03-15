package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");
        Thread.sleep(3000);
        //3- Enter incorrect username: “incorrect”
        WebElement userNameElement=driver.findElement(By.name("USER_LOGIN"));
        userNameElement.sendKeys("incorrect"+ Keys.ENTER);
        Thread.sleep(3000);

        //4- Enter incorrect password: “incorrect”
        WebElement passwordElement=driver.findElement(By.name("USER_PASSWORD"));
        passwordElement.sendKeys("incorrect"+ Keys.ENTER);
        Thread.sleep(3000);
        //5- Click to login button.
        WebElement btnLoginElement=driver.findElement(By.className("login-btn"));
        btnLoginElement.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password

        WebElement errMessageElement=driver.findElement(By.className("errortext"));
        String actualErrMsg=errMessageElement.getText();
        String expectedErrMsg="Incorrect login or password";
            if(actualErrMsg.equals(expectedErrMsg)){
                System.out.println("Text verification is PASS  " + expectedErrMsg);
            }else {
                System.out.println("Text verification is FAIL  " + expectedErrMsg);
            }
        driver.quit();


    }
}

/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password

PS: Inspect and decide which locator you should be using to locate web
elements.


 */
