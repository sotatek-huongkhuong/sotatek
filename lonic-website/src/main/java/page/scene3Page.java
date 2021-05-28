package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene3Page extends basePage {
    @FindBy(id = "button-go-to-4")
    WebElement btnGoUP;
    @FindBy(id = "button-go-to-2")
    WebElement btnGoDown;
    @FindBy(xpath = "//img[@src='assets/20201102_151819.jpg']")
    WebElement pic3;

    public scene3Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public scene3Page scrollToBtnGoUp() {
        scrollToElement(btnGoUP);
        return this;
    }

    public scene3Page scrollToBtnGoDown() {
        scrollToElement(btnGoDown);
        return this;
    }

    public scene3Page isScene3Present() {
        IsElementPresent(pic3, driver);
        return this;
    }

    public scene3Page verifyBtnGoUpVisibleInViewPort() {
        if (isVisibleInViewport(btnGoUP)) {
            System.out.println(btnGoUP + " is Visible In Viewport");
        } else {
            System.out.println(btnGoUP + " isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(btnGoUP));
        }
        return this;
    }

    public scene3Page verifyBtnGoDownVisibleInViewPort() {
        if (isVisibleInViewport(btnGoDown)) {
            System.out.println(btnGoDown + " is Visible In Viewport");
        } else {
            System.out.println(btnGoDown + " isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(btnGoDown));
        }
        return this;
    }

    public scene2Page clickToGoDown() {
        click(btnGoDown);
        scene2Page scene2 = new scene2Page(driver);
        return scene2;
    }

    public scene4Page clickToGoUp() {
        click(btnGoUP);
        scene4Page scene4 = new scene4Page(driver);
        return scene4;
    }
}
