package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

    public class T3_Checkboxes {
    public static void main(String[] args) {
//        TC#3: Checkboxes
//        1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//        2. Confirm checkbox #1 is NOT selected by default
        WebElement chkBox_1_Element = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement chkBox_2_Element = driver.findElement(By.xpath("//input[@name='checkbox2']"));

//        3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("Check box 1 is selected==="+chkBox_1_Element.isSelected());
        System.out.println("Check box 2 is selected==="+chkBox_2_Element.isSelected());



//        4. Click checkbox #1 to select it.
        chkBox_1_Element.click();
//        5. Click checkbox #2 to deselect it.
        chkBox_2_Element.click();
//        6. Confirm checkbox #1 is SELECTED.
        System.out.println("Check box 1 is selected== Expecting TRUE -->"+chkBox_1_Element.isSelected());


//        7. Confirm checkbox #2 is NOT selected.
        System.out.println("Check box 2 is selected== Expecting fFALSE -->\""+chkBox_2_Element.isSelected());

    }
}
/*
TC#3: Checkboxes
1. Go to https://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.


 */
