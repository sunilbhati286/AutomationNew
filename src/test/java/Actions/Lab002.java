package Actions;

import bhati.sunil.com.BoilerPlateClass;
import bhati.sunil.com.ProgrameWaitHelper;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab002 extends BoilerPlateClass {
    @Description("Check for the Make My Trip Programe with Actions")
    @Test

    public void checkActions() throws InterruptedException {
        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
       // Thread.sleep(5000);
        ProgrameWaitHelper.checkVisibility1(driver, By.xpath("//span[@data-cy=\"closeModal\"]"));
        WebElement closeButton = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeButton.click();
        WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
        Actions action = new Actions(driver);
        action.moveToElement(fromCity).click().sendKeys("blr").build().perform();
    }
}
