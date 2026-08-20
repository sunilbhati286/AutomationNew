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

public class PrgBoilerforCommon {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void flipkartSVGProg(){
        String url = "https://www.flipkart.com/search";
        driver.get(url);
        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgElement = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElement.get(0).click();
        waitJVM(5000);
        List<WebElement> itemTitle = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
        for(WebElement title : itemTitle)
        {
            System.out.println(title.getText());
        }

    }

    @AfterTest
    public void closeBrowser(){
        waitJVM(3000);
        driver.close();

    }
}
