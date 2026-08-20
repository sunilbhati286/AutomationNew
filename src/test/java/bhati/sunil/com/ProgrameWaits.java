package bhati.sunil.com;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProgrameWaits {
    @Description("This is for the Waits for specific condition")
    @Test
    void optionsBrowser() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.id("login-password")).sendKeys("SunilBhati");
        driver.findElement(By.id("js-login-btn")).click();
        //Thread.sleep(3000);
        WebElement messageError = driver.findElement(By.id("js-notification-box-msg"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); // Expiclit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));
        Assert.assertEquals(messageError.getText(),"Your email, password, IP address or location did not match");
        driver.close();



    }
}
