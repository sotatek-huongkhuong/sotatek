package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene5Page extends basePage {

    @FindBy(id= "button-go-to-7")
    WebElement theRightBtn;
    @FindBy(id= "button-go-to-4")
    WebElement theLeftBtn;
    @FindBy(id= "button-go-to-6")
    WebElement theMiddleBtn;

    @FindBy(xpath="//img[@src='assets/20201102_151217.jpg']")
    WebElement pic5;

    public scene5Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public scene5Page scrollToTheLeftBtn()
    {
        scrollToElement(theLeftBtn);
        return this;
    }
    public scene5Page scrollToTheRightBtn()
    {
        scrollToElement(theRightBtn);
        return this;
    }
    public scene5Page scrollToTheMiddleBtn()
    {
        scrollToElement(theMiddleBtn);
        return this;
    }
    public scene5Page isScene5Present() {
        IsElementPresent(pic5,driver);
        return this;
    }


    public scene5Page verifyTheLeftBtnVisibleInViewPort()
    {
        if(isVisibleInViewport(theLeftBtn))
        {
            System.out.println(theLeftBtn+" is Visible In Viewport");
        }
        else
        {
            System.out.println(theLeftBtn+" isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(theLeftBtn));
        }
        return this;
    }

    public scene5Page verifyTheRightBtnVisibleInViewPort()
    {
        if(isVisibleInViewport(theRightBtn))
        {
            System.out.println(theRightBtn+" is Visible In Viewport");
        }
        else
        {
            System.out.println(theRightBtn+" isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(theRightBtn));
        }
        return this;
    }
    public scene5Page verifyTheMiddleBtnVisibleInViewPort()
    {
        if(isVisibleInViewport(theMiddleBtn))
        {
            System.out.println(theMiddleBtn+" is Visible In Viewport");
        }
        else
        {
            System.out.println(theMiddleBtn+" isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(theMiddleBtn));
        }
        return this;
    }
    public scene4Page clickToTheleftBtn()
    {
        click(theLeftBtn);
        scene4Page scene4=new scene4Page(driver);
        return scene4;
    }
    public scene7Page clickTheRightBtn()
    {
        click(theRightBtn);
        scene7Page scene7=new scene7Page(driver);
        return scene7;
    }
    public scene6Page clickTheMiddleBtn()
    {
        click(theMiddleBtn);
        scene6Page scene6=new scene6Page(driver);
        return scene6;
    }
}
