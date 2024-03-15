package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserName) {
        WebDriver webDriver = null;
        if(browserName.equals("chrome")){
            webDriver= new ChromeDriver();
            webDriver.manage().window().maximize();
        }
        else if(browserName.equals("firefox")){
            webDriver = new FirefoxDriver();
            webDriver.manage().window().maximize();
        }
        else{
            System.out.println("Browser not supported");
        }

        return webDriver;
    }

}
