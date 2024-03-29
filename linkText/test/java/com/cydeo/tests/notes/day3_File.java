package com.cydeo.tests.notes;

public class day3_File {
    /*

Today's schedule:
    #1- Review
    #2- Task1
    #3- Create utility class
    #4- Task2
    #5- .isDisplayed()
    #6- cssSelector
    #7- xpath

----------------------------------------------------------------------------------------

- What is maven?
- Maven is a build automation tool.

- What is build?
- Repeating steps when & after we are creating a project

    when creating:
        - create the project folder
        - create main, test, pom.xml, add dependencies

    after creating :
        - from validate to deploy

- Is maven for testers? Was it created for testers?
- No. It is a tool created for Java developers.

- Is maven the only "build automation tool" out there?
- Gradle, ant, Azure

----------------------------------------------------------------------------------------
--> .findElement(By.locator("STRING"))

- What does it do?
- Finds and returns a single web element.

- What does it accept as argument?
- It accepts a locator parameter String as argument.

- What is the return type?
- "WebElement" type

- What kind of exception does it throw?
- NoSuchElementException

- What happens when exception is thrown in Selenium code execution? Is it going to execute the rest of the lines?
- Rest of the class will not be executed.

- When do we have NoSuchElementException?
#1- Wrong locator provided
#2- Synchronization: If our Selenium browser driver is not on the same page with the browser we are using, it will throw NoSuchElementException.

----------------------------------------------------------------------------------------
--> .click();
- What does it do?
- It will click to the given web element.

- Does it accept argument?
- No.

- Does it work just by itself --> driver.click();

syntax1: driver.findElement(By.locator("something")).click();

syntax2: WebElement button = driver.findElement(By.locator("something"));
         button.click();

----------------------------------------------------------------------------------------
--> .sendKeys("STRING");
- What does it do?
- It sends the provided String argument into the provided web element.

- Does it accept argument?
- Accepts String argument.

----------------------------------------------------------------------------------------
- Keys.ENTER; --> it will simulate the action of user pressing enter from the keyboard with Selenium WebDriver.

----------------------------------------------------------------------------------------
LOCATORS:

- How many total locators we have?
- Selenium has total of 8 locators.

- id
- name
- className
- linkText
- partialLinkText
- tagName

- cssSelector
- xpath


<a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

----------------------------------------------------------------------------------------
1- id:
    - this locator will try to locate a web element using "id" attribute's value.
    - id attribute's value has to be unique for every web element.

    id="bb22345234"
    id="bb12524353"
    id="bb12367892"
    id="bb44444444"

ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

syntax: driver.findElement(by.id("bb22")) --> a

----------------------------------------------------------------------------------------
2- name:
    - this locator will try to locate a web element using "name" attribute's value.
    - name does NOT have to be unique.

ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

syntax: driver.findElement(by.name("uh68")); --> a

----------------------------------------------------------------------------------------
3- className:
    - this locator will try to locate a web element using "class" attribute's value.
    - name does NOT have to be unique.

ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

syntax: driver.findElement(by.class("ff58")); --> a

----------------------------------------------------------------------------------------
4- linkText:
    - This locator will locate a link by its text
    - It will ONLY ONLY ONLY work for LINK ( <a> ) web elements.
    - It is looking for an exact match of a given text.
    - This behaves similar to ".equals()" method from java

ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

syntax: driver.findElement(By.linkText("TESLA CYBERTRUCK"));

----------------------------------------------------------------------------------------
5- partialLinkText
    - This locator will locate a link by its text.
    - It will ONLY ONLY ONLY work for LINK ( <a> ) web elements.
    - It is looking for a partial match of a given text.
    - This behaves similar to ".contains()" method from java

ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

syntax1: driver.findElement(By.partialLinkText("TESLA"));
syntax2: driver.findElement(By.partialLinkText("CYBERTRUCK"));
syntax3: driver.findElement(By.partialLinkText("ESLA"));
syntax4: driver.findElement(By.partialLinkText("TRUCK"));

----------------------------------------------------------------------------------------
6- tagName:
    - This locator will locate the web element by its tag type.
    - We literally pass the type of the tag and it will return us the first matching result when we use it with findElement() method.


ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

syntax: driver.findElement(By.tagname("a"));

- What happens if we provide name, class attribute value and there is more than 1 result?
- It will return the first matching result.

----------------------------------------------------------------------------------------
--> .getText();

- What does it do?
- It will get the text of the given web element.

- What is the return type?
- STRING

- Does it accept any argument?
- No. It doesn't accept argument.

syntax: We cannot say driver.getText();

- driver.findElement(locator).getText(); --> it will return the text of given web element

ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

syntax: driver.findElement(By.name("uh68")).getText()--> TESLA CYBERTRUCK

----------------------------------------------------------------------------------------
--> .getAttribute();

- What does it do?
- It will accept an attribute and return its value.
- It accepts a String argument
- Return type is String

ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

syntax: driver.findElement(By.name("uh68")).getAttribute("href")     --> https://tesla.com
syntax: driver.findElement(By.name("uh68")).getAttribute("name")     --> uh68
syntax: driver.findElement(By.name("uh68")).getAttribute("class")    --> ff58
syntax: driver.findElement(By.name("uh68")).getAttribute("id")       --> bb22

----------------------------------------------------------------------------------------

- .isDisplayed();

- What does it do?
- This method checks if given web element is displayed on the page or not.

- Return type: Boolean

- If given web element is displayed on the page, it will return TRUE.
- If given web element is NOT displayed on the page, it will return FALSE.

- This method does not accept any argument.

syntax: driver.findElement(By.locator).isDisplayed(); --> either return true or false

----------------------------------------------------------------------------------------

7- cssSelector:
    - It is just one of the 8 locators of Selenium.
    - It allows us to create custom locators.
    - We can use any existing attribute and its value to create a new locator.
    - We are not limited to id, name, or class attributes.

syntax #1: tagName[attribute='value']
syntax #1: tagName[attribute="value"]

EXAMPLE: <label class="login-item-checkbox-label" for="USER_REMEMBER">Remember me on this computer</label>

ex#1: Use "class" attribute and cssSelector to locate above <label> web element.

    tagName[attribute='value']

    label[class='login-item-checkbox-label']


ex#2: Use "for" attribute and cssSelector to locate above <label> web element.

    tagName[attribute='value']

    label[for='USER_REMEMBER']

<a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

ex#3: Use "name" attribute and cssSelector to locate above <a> web element.

    tagName[attribute='value']

    a[name='uh68']


ex#4: Use "class" attribute and cssSelector to locate above <a> web element.

    a[class='ff58']


ex#5: Use "id" attribute and cssSelector to locate above <a> web element.

    a[id='bb22']


ex#6: Use "href" attribute and cssSelector to locate above <a> web element.

    a[href='https://tesla.com']


<a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>


syntax #2: we can only use this syntax with class and id attributes

    class attribute     : tagName.classValue
    id attribute        : tagName#idValue

ex#7: Use "class" attribute and cssSelector syntax #2 to locate above <a> web element.

    tagName.classValue
    a.ff58


ex#8: Use "id" attribute and cssSelector syntax #2 to locate above <a> web element.

    tagName.classValue
    a#bb22


--------------------------------------------------------------------------------------------------------

#8- XPATH LOCATOR

    - It is just one of the 8 locators of Selenium.
    - It has its own syntax just like cssSelector.
    - We can create custom locators using any attribute value.

IQ - Interview question: What is the difference between absolute xpath and relative xpath?

    - Xpath has two different types.

    #1- Absolute xpath:
    - Absolute xpath starts with single slash "/"
    - Single slash means, it will start from the root/parent element, which is <html> tag
    - It starts from the "html" tag and it goes down 1 by 1 until we get to the desired web element
    - It is not good practice to use this locator.
    - It will break very easily with any minimal change on the page.

    /html/body/table/tbody/tr[2]/td/div/div/form/div[2]/input

    #2- Relative xpath:
    - Relative xpath starts with double slash "//"
    - Double slash means start from anywhere you want.
    - Since we are allowed to start from anywhere on the page, this locator is much more reliable.
    - We will only use Relative xpath, not absolute xpath.
    - The only time the relative xpath breaks (stops working) is if the developer is directly making change to the web element we are locating.

    MAIN SYNTAX : //tagName[@attribute='value']


<a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

    //tagName[@attribute='value']

- locate above <a> tag using XPATH with different attribute:

    - name with Xpath       :  //a[@name='uh68']
    - class with Xpath      :  //a[@class='ff58']
    - id with Xpath         :  //a[@id='bb22']
    - hreft with Xpath      :  //a[@href='https://tesla.com']

- all of the above locators are locating the same web element, just by using different attribute values.

COMMONLY USED XPATH LOCATORS:

#1: //tagName[@attribute='value']
#2: //tagName[contains(@attribute, 'value')]
#3: //tagName[text()='text']
#4: //*[@attribute='value']

EXPLANATIONS:

#1: //tagName[@attribute='value']

    - We are saying, get me the given tag with provided attribute value.

#2: //tagName[contains(@attribute, 'value')]

    - We are saying, get me the given tag with attribute that contains given value.

#3: //tagName[text()='text']

    - This locator will return us the web element with given text.

#4: //*[@attribute='value']

    - We are saying, we dont care about the tag name, just return me the web element with matching attribute and value.

















Displaying 1673628762888-Day03_notes.txt.
     */
}
