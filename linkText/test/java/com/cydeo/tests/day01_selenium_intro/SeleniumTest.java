package com.cydeo.tests.day01_selenium_intro;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1-Setting up the web driver manger
       // WebDriverManager.chromedriver().setup();

        // 2-Creating the instance of Chrome Browser driver
        WebDriver driver=new ChromeDriver();

        // 3 - Test if driver and browser are working as expected
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        WebElement alleAkzept_Element=driver.findElement(By.xpath("//div[text()='Alle akzeptieren']"));
        alleAkzept_Element.click();


    }

}
