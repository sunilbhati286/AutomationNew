package bhati.sunil.com;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class ProgramWaits2 {

    @Description("Check for the Model to Wait for time")
    @Test
    public void modelPopupClose() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(507654321));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        WebElement closePopup = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closePopup.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
