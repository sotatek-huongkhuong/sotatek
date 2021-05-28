package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene2Page extends basePage{
    @FindBy(id= "button-go-to-3")
    WebElement btnGoUP;
    @FindBy(id= "button-go-to-1")
    WebElement btnGoDown;
    @FindBy(xpath="//img[@src='assets/20201102_152112.jpg']")
    WebElement pic2;

    public scene2Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public scene2Page scrollToBtnGoUp()
    {
        scrollToElement(btnGoUP);
        return this;
    }
    public scene2Page scrollToBtnGoDown()
    {
        scrollToElement(btnGoDown);
        return this;
    }
    public scene2Page isScene2Present() {
        IsElementPresent(pic2,driver);
        return this;
    }
    public scene2Page verifyBtnGoUpVisibleInViewPort()
    {
        if(isVisibleInViewport(btnGoUP))
        {
            System.out.println(btnGoUP+" is Visible In Viewport");
        }
        else
        {
            System.out.println(btnGoUP+" isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(btnGoUP));
        }
        return this;
    }
    public scene2Page verifyBtnGoDownVisibleInViewPort()
    {
        if(isVisibleInViewport(btnGoDown))
        {
            System.out.println(btnGoDown+" is Visible In Viewport");
        }
        else
        {
            System.out.println(btnGoDown+" isn't  Visible In Viewport");
            Assert.assertTrue(isVisibleInViewport(btnGoDown));
        }
        return this;
    }
    public scene1Page clickToGoDown()
    {
        click(btnGoDown);
        scene1Page scene1=new scene1Page(driver);
        return scene1;
    }
    public scene3Page clickToGoUp()
    {
        click(btnGoUP);
        scene3Page scene3=new scene3Page(driver);
        return scene3;
    }
}
