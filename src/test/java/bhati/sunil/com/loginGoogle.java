package bhati.sunil.com;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


import java.security.Key;


public class loginGoogle {

    //@Description("this is for login onlly")
    @Test
    public void login() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
       // Assert.assertEquals(title, "Google");
        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isEqualTo("Hello");

        driver.findElement(By.id("APjFqb")).sendKeys("Hello", Keys.ENTER);
        // Thread.sleep(3000);
        // driver.findElement(By.name("btnK")).click();
        driver.quit();
    }

}

