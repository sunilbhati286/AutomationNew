Selenium + TestNG Automation Framework

A basic Java test automation framework using Selenium WebDriver for
browser automation and TestNG for test execution and reporting.

Technologies Used

Java 19+

Selenium WebDriver

TestNG

Maven

IntelliJ IDEA

Chrome / ChromeDriver

Git / GitHub

Project Structure

Automation/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
│           └── bhati/
│               └── sunil/
│                   └── com/
│                       └── GoogleTest.java
└── target/

Maven Dependencies

Add Selenium and TestNG to pom.xml:

<dependencies>

    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.46.0</version>
    </dependency>

    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.12.0</version>
        <scope>test</scope>
    </dependency>

</dependencies>

Selenium and TestNG versions can be updated as required for the
browser and Java version being used.

Sample Selenium + TestNG Test

package bhati.sunil.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void login() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        driver.findElement(By.id("APjFqb"))
                .sendKeys("Hello", Keys.ENTER);

        driver.quit();
    }
}

How to Run

From IntelliJ IDEA

Open the Maven project in IntelliJ IDEA.

Make sure the TestNG dependency is loaded.

Place test classes under src/test/java.

Make sure the test method has the TestNG annotation:

@Test
public void login() {
// test steps
}

Click the green Run icon beside the test method or class.

From Maven

Run all tests:

mvn test

Run a specific TestNG test class:

mvn -Dtest=GoogleTest test

Common TestNG Annotations

Annotation        Purpose

@Test           Defines a test method
@BeforeMethod   Runs before each test method
@AfterMethod    Runs after each test method
@BeforeClass    Runs once before the first test method in a class
@AfterClass     Runs once after all test methods in a class
@BeforeSuite    Runs before the test suite
@AfterSuite     Runs after the test suite
@BeforeTest     Runs before the <test> section in TestNG XML
@AfterTest      Runs after the <test> section

Example:

@BeforeMethod
public void setUp() {
System.out.println("Open browser");
}

@Test
public void loginTest() {
System.out.println("Execute login test");
}

@AfterMethod
public void tearDown() {
System.out.println("Close browser");
}

Selenium Locators

Common Selenium locators:

By.id("username");
By.name("username");
By.className("login");
By.tagName("input");
By.linkText("Login");
By.partialLinkText("Log");
By.cssSelector("#username");
By.xpath("//input[@id='username']");

Recommended Locator Priority

Prefer stable and unique locators:

id

name

CSS Selector

XPath

Avoid overly complex XPath expressions when a simple stable locator is
available.

Selenium Waits

Implicit Wait

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Explicit Wait

Recommended when waiting for a specific condition:

WebDriverWait wait =
new WebDriverWait(driver, Duration.ofSeconds(10));

WebElement element = wait.until(
ExpectedConditions.visibilityOfElementLocated(
By.id("username")
)
);

Required imports:

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

Avoid Hard Waits

Avoid using:

Thread.sleep(5000);

A fixed sleep always waits for the specified duration. Explicit waits
are generally more reliable because they wait for a required condition.

Browser Management

Start Chrome:

WebDriver driver = new ChromeDriver();

Open a URL:

driver.get("https://www.google.com");

Maximize:

driver.manage().window().maximize();

Get title:

String title = driver.getTitle();

Close the current window:

driver.close();

Close all browser windows and end the WebDriver session:

driver.quit();

Basic Test Execution Flow

TestNG starts test
↓
@BeforeMethod
↓
Create WebDriver
↓
Open application
↓
Perform test steps
↓
Assertions / validation
↓
@AfterMethod
↓
Quit browser

Recommended Framework Improvements

As the project grows, the following components can be added:

src/test/java
├── base/
│   └── BaseTest.java
├── pages/
│   ├── LoginPage.java
│   └── HomePage.java
├── tests/
│   └── LoginTest.java
├── utils/
│   ├── WaitUtils.java
│   └── ScreenshotUtils.java
└── listeners/
└── TestListener.java

Recommended practices:

Use Page Object Model (POM).

Keep test data separate from test logic.

Use explicit waits instead of unnecessary Thread.sleep().

Add assertions to validate expected results.

Capture screenshots when tests fail.

Use TestNG listeners for reporting and failure handling.

Keep browser setup and teardown in a base class.

Run tests through Maven and CI/CD.

Store the project in Git/GitHub.

Troubleshooting

No tests found

Check:

import org.testng.annotations.Test;

Make sure the class is under:

src/test/java

and the method contains:

@Test
public void testName() {
}

Also verify that the TestNG dependency is present in pom.xml and
reload the Maven project.

NoSuchElementException

If Selenium cannot find an element:

Verify the locator.

Check whether the page has finished loading.

Use an explicit wait.

Check whether the element is inside an iframe.

Check whether the locator has changed.

Example:

WebDriverWait wait =
new WebDriverWait(driver, Duration.ofSeconds(10));

WebElement searchBox = wait.until(
ExpectedConditions.visibilityOfElementLocated(
By.id("APjFqb")
)
);

Git Commands

Initialize Git:

git init

Check status:

git status

Add files:

git add .

Commit:

git commit -m "Initial Selenium TestNG framework"

Add GitHub remote:

git remote add origin <YOUR_GITHUB_REPOSITORY_URL>

Push:

git branch -M main
git push -u origin main

Author

Sunil Bhati

Software QA Engineer / QA Lead

Skills: Manual Testing, Selenium WebDriver, TestNG, API Testing, Rest
Assured, Playwright, Mobile Testing, Agile, and Automation Testing.