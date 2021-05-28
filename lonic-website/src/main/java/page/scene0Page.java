package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class scene0Page extends basePage{
    @FindBy(id= "button-go-to-1")
    WebElement btnGoUP;

    @FindBy(xpath="//img[@src='assets/20201102_152648.jpg']")
    WebElement pic0;

    public scene0Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public scene0Page scrollToBtnGoUp()
    {
        scrollToElement(btnGoUP);
        return this;
    }
    public scene0Page isScene0Present() {
       IsElementPresent(pic0,driver);
       return this;
    }
    public scene0Page verifyBtnGoUpVisibleInViewPort()
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
    public scene1Page clickToGoUp()
    {
        click(btnGoUP);
        scene1Page scene1=new scene1Page(driver);
        return scene1;
    }
}
