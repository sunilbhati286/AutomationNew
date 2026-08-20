package bhati.sunil.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProgrameForAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        //WebElement javaAlert = driver.findElement(By.xpath("//button[@onClick = \"jsAlert()\"]"));
       // javaAlert.click();
//        WebElement confirmElement = driver.findElement(By.xpath("//button[@onClick = \"jsConfirm()\"]"));
//        confirmElement.click();
        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onClick = \"jsPrompt()\"]"));
        jsPrompt.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert art = driver.switchTo().alert();
        Thread.sleep(3000);
        art.sendKeys("Hello this is Sunil Bhati");
        art.accept();

       // driver.findElement(By.xpath("//button[@onClick = \"jsPrompt()\"]")).click();
        String confirmationMsg = driver.findElement(By.id("result")).getText();
       // Assert.assertEquals(confirmationMsg, "You successfully clicked  alert");
        Assert.assertEquals(confirmationMsg, "You Click Ok");
        Thread.sleep(3000);
        driver.close();



    }
}
