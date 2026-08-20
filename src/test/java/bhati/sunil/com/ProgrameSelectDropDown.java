package bhati.sunil.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProgrameSelectDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
       WebElement optionsSElection=  driver.findElement(By.id("dropdown"));
        Select select = new Select(optionsSElection);
       // select.selectByIndex(2);
        select.selectByValue("1");
    }

}
