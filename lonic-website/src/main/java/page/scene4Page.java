package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene4Page extends basePage {
    @FindBy(id = "button-go-to-5")
    WebElement btnGoUP;
    @FindBy(id = "button-go-to-3")
    WebElement btnGoDown;
    @FindBy(xpath = "//img[@src='assets/20201102_151448.jpg']")
    WebElement pic4;

    public scene4Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public scene4Page scrollToBtnGoUp() {
        scrollToElement(btnGoUP);
        return this;
    }

    public scene4Page scrollToBtnGoDown() {
        scrollToElement(btnGoDown);
        return this;
    }

    public scene4Page isScene4Present() {
        IsElementPresent(pic4, driver);
        return this;
    }

    public scene4Page verifyBtnGoUpVisibleInViewPort() {
        if (isVisibleInViewport(btnGoUP)) {
            System.out.println(btnGoUP + " is Visible In Viewport");
        } else {
            System.out.println(btnGoUP + " isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(btnGoUP));
        }
        return this;
    }

    public scene4Page verifyBtnGoDownVisibleInViewPort() {
        if (isVisibleInViewport(btnGoDown)) {
            System.out.println(btnGoDown + " is Visible In Viewport");
        } else {
            System.out.println(btnGoDown + " isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(btnGoDown));
        }
        return this;
    }

    public scene3Page clickToGoDown() {
        click(btnGoDown);
        scene3Page scene3 = new scene3Page(driver);
        return scene3;
    }

    public scene5Page clickToGoUp() {
        click(btnGoUP);
        scene5Page scene5 = new scene5Page(driver);
        return scene5;
    }
}
