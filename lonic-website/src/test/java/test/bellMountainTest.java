package test;

import org.testng.annotations.Test;
import page.*;
public class bellMountainTest extends baseTest{
    @Test
    public void bellTest()
    {
        driver.get("https://sotatek-duyta.github.io/Chris-test/home");
        scene0Page scene0= new scene0Page(driver);
        scene0.isScene0Present().verifyBtnGoUpVisibleInViewPort()
                .clickToGoUp().isScene1Present().verifyBtnGoUpVisibleInViewPort()
                .clickToGoUp().isScene2Present().verifyBtnGoUpVisibleInViewPort()
                .clickToGoUp().isScene3Present().verifyBtnGoUpVisibleInViewPort()
                .clickToGoUp().isScene4Present().verifyBtnGoUpVisibleInViewPort()
                .clickToGoUp().isScene5Present().verifyTheRightBtnVisibleInViewPort().scrollToTheMiddleBtn()
                .clickTheMiddleBtn().isScene6Present().scrollToBtnGoBack().verifyBtnGoBackVisibleInViewPort()
                .clickToGoback().isScene5Present().verifyTheLeftBtnVisibleInViewPort().scrollToTheRightBtn().verifyTheRightBtnVisibleInViewPort()
                .clickTheRightBtn().isScene7Present()
                .clickTheMiddleBtn().isScene8Present()
                .clickToTheleftBtn().isScene9Present()

        //go down
        .scrollToTheLeftBtn().clickToTheleftBtn().isScene7Present().verifyTheLeftBtnVisibleInViewPort()
        .clickToTheleftBtn().isScene5Present().verifyTheLeftBtnVisibleInViewPort()
        .clickToTheleftBtn().isScene4Present().verifyBtnGoDownVisibleInViewPort()
        .clickToGoDown().isScene3Present().verifyBtnGoDownVisibleInViewPort()
        .clickToGoDown().isScene2Present().verifyBtnGoDownVisibleInViewPort()
        .clickToGoDown().isScene1Present().verifyBtnGoDownVisibleInViewPort()
        .clickToGoDown().isScene0Present()
        ;


    }
}