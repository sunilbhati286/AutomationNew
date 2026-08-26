package bhati.sunil.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static bhati.sunil.com.ProgrameWaitHelper.waitJVM;

public class BoilerPlateClass {

    public ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }


    @AfterTest
    public void closeBrowser(){
        waitJVM(3000);
        driver.close();

    }
}

