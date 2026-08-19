package bhati.sunil.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassOptions {

    @Test
    void optionsBrowser() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
       // chromeOptions.addArguments("--windows-size=1200,720");
        chromeOptions.addArguments("--incognito");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.id("login-password")).sendKeys("SunilBhati");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(3000);
        WebElement messageError = driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(messageError.getText(),"Your email, password, IP address or location did not match");
        driver.close();



    }
}
