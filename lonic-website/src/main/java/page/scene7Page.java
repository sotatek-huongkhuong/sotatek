package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene7Page extends basePage {
    //this is scene C
    // the left goes back down
    //the middle goes to B( scene 8)
    //the Right goes to Top( scene 9)
    @FindBy(id = "button-go-to-5")
    WebElement theLeftBtn;
    @FindBy(id = "button-go-to-9")
    WebElement theRightBtn;
    @FindBy(id = "button-go-to-8")
    WebElement theMiddleBtn;
    @FindBy(xpath = "//img[@src='assets/20201102_150435.jpg']")
    WebElement pic7;

    public scene7Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public scene7Page scrollToTheLeftBtn() {
        scrollToElement(theLeftBtn);
        return this;
    }

    public scene7Page scrollToTheRightBtn() {
        scrollToElement(theRightBtn);
        return this;
    }

    public scene7Page scrollToTheMiddleBtn() {
        scrollToElement(theMiddleBtn);
        return this;
    }

    public scene7Page isScene7Present() {
        IsElementPresent(pic7, driver);
        return this;
    }

    public scene7Page verifyTheLeftBtnVisibleInViewPort() {
        if (isVisibleInViewport(theLeftBtn)) {
            System.out.println(theLeftBtn + " is Visible In Viewport");
        } else {
            System.out.println(theLeftBtn + " isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(theLeftBtn));
        }
        return this;
    }

    public scene7Page verifyTheRightBtnVisibleInViewPort() {
        if (isVisibleInViewport(theRightBtn)) {
            System.out.println(theRightBtn + " is Visible In Viewport");
        } else {
            System.out.println(theRightBtn + " isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(theRightBtn));
        }
        return this;
    }

    public scene7Page verifyTheMiddleBtnVisibleInViewPort() {
        if (isVisibleInViewport(theMiddleBtn)) {
            System.out.println(theMiddleBtn + " is Visible In Viewport");
        } else {
            System.out.println(theMiddleBtn + " isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(theMiddleBtn));
        }
        return this;
    }

    public scene5Page clickToTheleftBtn() {
        click(theLeftBtn);
        scene5Page scene5 = new scene5Page(driver);
        return scene5;
    }

    public scene9Page clickTheRightBtn() {
        click(theRightBtn);
        scene9Page scene9 = new scene9Page(driver);
        return scene9;
    }

    public scene8Page clickTheMiddleBtn() {
        click(theMiddleBtn);
        scene8Page scene8 = new scene8Page(driver);
        return scene8;
    }
}