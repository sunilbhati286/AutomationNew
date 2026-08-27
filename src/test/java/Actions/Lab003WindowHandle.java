package Actions;

import bhati.sunil.com.BoilerPlateClass;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab003WindowHandle extends BoilerPlateClass {

    @Description("To chech the Window Handle Funcionality")
    @Test

    public void WindowHandleProgrm(){
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windowHandlesnw = driver.getWindowHandles();
        System.out.println("Both Windows are :- " +windowHandlesnw);

        for (String windowhand : windowHandlesnw) {
            driver.switchTo().window(windowhand);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Pass");
            }
        }

    }
}
