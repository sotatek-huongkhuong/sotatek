package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene9Page extends basePage {

    //this is TOP
    // left go to C (Scene 7)
    // right go to B( scene 8)
    @FindBy(id= "button-go-to-7")
    WebElement theLeftBtn;
    @FindBy(id= "button-go-to-8")
    WebElement theRightBtn;
    @FindBy(xpath="//img[@src='assets/20201102_145719.jpg']")
    WebElement pic9;
    public scene9Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public scene9Page scrollToTheLeftBtn()
    {
        scrollToElement(theLeftBtn);
        return this;
    }
    public scene9Page scrollToTheRightBtn()
    {
        scrollToElement(theRightBtn);
        return this;
    }
    public scene9Page isScene9Present() {
        IsElementPresent(pic9,driver);
        return this;
    }
    public scene9Page verifyTheLeftBtnVisibleInViewPort()
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

    public scene9Page verifyTheRightBtnVisibleInViewPort()
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
    public scene7Page clickToTheleftBtn()
    {
        click(theLeftBtn);
        scene7Page scene7=new scene7Page(driver);
        return scene7;
    }
    public scene8Page clickTheRightBtn()
    {
        click(theRightBtn);
        scene8Page scene8=new scene8Page(driver);
        return scene8;
    }
}