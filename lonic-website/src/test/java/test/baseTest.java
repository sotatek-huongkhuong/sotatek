package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseTest {
    WebDriver driver;
    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
    }
    @BeforeMethod
    public void setupTest() {
        try {
            driver = new ChromeDriver();
        } catch (Exception e) {
            System.out.println("Cannot setup Chrome driver due to error: " + e.getMessage());
            try {
                driver = new FirefoxDriver();
            } catch (Exception e1) {
                System.out.println("Cannot setup Firefox driver due to error: " + e1.getMessage());
                try {
                    driver = new EdgeDriver();
                } catch (Exception e2) {
                    System.out.println("Cannot setup Edge driver due to error: " + e2.getMessage());
                }
            }
        }
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void after() {
        driver.close();
        driver.quit();
    }
}
