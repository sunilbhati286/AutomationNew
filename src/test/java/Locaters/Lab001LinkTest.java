package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Lab001LinkTest {
    @Test
    public void login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");
        driver.manage().window().maximize();
       // WebElement linkTesLocater = driver.findElement(By.linkText("Start a FREE TRIAL")); // Link text should be exact match
       // linkTesLocater.click();
        driver.findElement(By.id("page-v1-step1-email")).sendKeys("Sunil");
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
        WebElement checkboxData = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkboxData.click();
        List<WebElement> buttonlist =  driver.findElements(By.tagName("button"));
        buttonlist.get(0).click();
        WebElement validReasonmessage = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(validReasonmessage.getText(), "The email address you entered is incorrect.");
        Thread.sleep(3000);
        driver.quit();


    }

}


