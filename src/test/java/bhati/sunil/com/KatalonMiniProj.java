package bhati.sunil.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KatalonMiniProj {

        @Test
        void getTitle() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            driver.manage().window().maximize();
            if (driver.getPageSource().contains("CURA Healthcare Servicfdde")){
                System.out.println("CURA Healthcare Service is visible");
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }

            driver.quit();
        }

    }


