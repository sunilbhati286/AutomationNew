package ApachePoiExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Lab002WithSite {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("/Users/ineel07/Desktop/testData.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            XSSFRow row = sheet.getRow(i);
            // Get username from column 0
            XSSFCell usernameCell = row.getCell(0);
            // Get password from column 1
            XSSFCell passwordCell = row.getCell(1);
            String username = usernameCell.getStringCellValue();
            String password = passwordCell.getStringCellValue();
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            // Open VWO
            driver.get("https://app.vwo.com/#/login");
            // Enter username
            driver.findElement(By.id("login-username")).sendKeys(username);
            // Enter password
            driver.findElement(By.id("login-password")).sendKeys(password);
            // Click Login
            driver.findElement(By.id("js-login-btn")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Current URL: " + driver.getCurrentUrl());
            driver.quit();

        }
    }
}