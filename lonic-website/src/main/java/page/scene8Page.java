package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene8Page extends basePage {

    //this is scene B
    // left to top
    // right to scene 7 (c)
    @FindBy(id= "button-go-to-9")
    WebElement theLeftBtn;
    @FindBy(id= "button-go-to-7")
    WebElement theRightBtn;
    @FindBy(xpath="//img[@src='assets/20201102_150217.jpg']")
    WebElement pic8;
    public scene8Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public scene8Page scrollToTheLeftBtn()
    {
        scrollToElement(theLeftBtn);
        return this;
    }
    public scene8Page scrollToTheRightBtn()
    {
        scrollToElement(theRightBtn);
        return this;
    }
    public scene8Page isScene8Present() {
        IsElementPresent(pic8,driver);
        return this;
    }
    public scene8Page verifyTheLeftBtnVisibleInViewPort()
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

    public scene8Page verifyTheRightBtnVisibleInViewPort()
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
    public scene9Page clickToTheleftBtn()
    {
        click(theLeftBtn);
        scene9Page scene9=new scene9Page(driver);
        return scene9;
    }
    public scene7Page clickTheRightBtn()
    {
        click(theRightBtn);
        scene7Page scene7=new scene7Page(driver);
        return scene7;
    }
}