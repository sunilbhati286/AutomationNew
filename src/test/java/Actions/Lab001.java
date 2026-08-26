package Actions;

import bhati.sunil.com.BoilerPlateClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Lab001 extends BoilerPlateClass {

    @Test
    public void progforAlartShirtKey() {
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        WebElement firstname =  driver.findElement(By.name("firstname"));
        Actions action = new Actions(driver);
        action.moveToElement(firstname).keyDown(Keys.SHIFT).sendKeys(firstname,"Sunil Bhati").keyUp(Keys.SHIFT).build().perform();


    }


}
