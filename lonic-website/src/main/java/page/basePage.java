package page;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class basePage {
      WebDriver driver;

    public void pause(long timeInMillis) {
        try {
            Thread.sleep(timeInMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void click(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
    public void IsElementPresent(WebElement e,WebDriver driver1)
    {
        pause(5000);
        WebDriverWait wait = new WebDriverWait(driver1, 15);
        try {
            wait.until(ExpectedConditions.visibilityOf(e));
            Assert.assertTrue(e.isDisplayed());
            System.out.println(e+" is display");
        }catch(Exception E) {
            System.out.println(e+" isn't display");
            Assert.assertTrue(e.isDisplayed());
            System.out.println(E.getMessage());
        }
    }
    public void scrollToElement(WebElement e)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
    }
    public void waitForPageLoaded(WebDriver driver) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        try {
            Thread.sleep(2000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            error.getCause().toString();
        }
    }

    public Boolean isVisibleInViewport(WebElement element) {


        return (Boolean)((JavascriptExecutor)driver).executeScript(
                "var elem = arguments[0],                 " +
                        "  box = elem.getBoundingClientRect(),    " +
                        "  cx = box.left + box.width / 2,         " +
                        "  cy = box.top + box.height / 2,         " +
                        "  e = document.elementFromPoint(cx, cy); " +
                        "for (; e; e = e.parentElement) {         " +
                        "  if (e === elem)                        " +
                        "    return true;                         " +
                        "}                                        " +
                        "return false;                            "
                , element);
    }
}
