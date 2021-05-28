package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene1Page  extends basePage{
    @FindBy(id= "button-go-to-2")
    WebElement btnGoUP;
    @FindBy(id= "button-go-to-0")
    WebElement btnGoDown;
    @FindBy(xpath="//img[@src='assets/20201102_152507.jpg']")
    WebElement pic1;

    public scene1Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public scene1Page scrollToBtnGoUp()
    {
        scrollToElement(btnGoUP);
        return this;
    }
    public scene1Page scrollToBtnGoDown()
    {
        scrollToElement(btnGoDown);
        return this;
    }
    public scene1Page isScene1Present() {
        IsElementPresent(pic1,driver);
        return this;
    }
    public scene1Page verifyBtnGoUpVisibleInViewPort()
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
    public scene1Page verifyBtnGoDownVisibleInViewPort()
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
    public scene0Page clickToGoDown()
    {
        click(btnGoDown);
        scene0Page scene0=new scene0Page(driver);
        return scene0;
    }
    public scene2Page clickToGoUp()
    {
        click(btnGoUP);
        scene2Page scene2=new scene2Page(driver);
        return scene2;
    }
}
