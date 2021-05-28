package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene6Page extends basePage {
    // this is house scene----------------------------
    // this is house scene----------------------------
    // this is house scene----------------------------
    // this is house scene----------------------------
    @FindBy(id = "button-go-to-5")
    WebElement btnGoBack;
    @FindBy(xpath="//img[@src='assets/20201102_150944.jpg']")
    WebElement pic6;

    public scene6Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public scene6Page scrollToBtnGoBack() {
        scrollToElement(btnGoBack);
        return this;

    }

    public scene6Page isScene6Present() {
        IsElementPresent(pic6, driver);
        return this;

    }

    public scene6Page verifyBtnGoBackVisibleInViewPort() {
        if (isVisibleInViewport(btnGoBack)) {
            System.out.println(btnGoBack + " is Visible In Viewport");
        } else {
            System.out.println(btnGoBack + " isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(btnGoBack));
        }
        return this;
    }

    public scene5Page clickToGoback() {
        click(btnGoBack);
        scene5Page scene5 = new scene5Page(driver);
        return scene5;
    }
}