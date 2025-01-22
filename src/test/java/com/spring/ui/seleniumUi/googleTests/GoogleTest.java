package com.spring.ui.seleniumUi.googleTests;

import com.spring.ui.seleniumUi.SpringBaseTest;
import com.spring.ui.seleniumUi.page.google.GooglePage;
import com.spring.ui.seleniumUi.util.ScreenShotUtil;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Component
public class GoogleTest extends SpringBaseTest {

    @Autowired
    private GooglePage googlePage;

    @Autowired
    private ScreenShotUtil screenShotUtil;

    @BeforeTest
    public void getDriver(){
       System.out.println("vfvv");
    }

    @Test
    public void googleTest() throws InterruptedException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.screenShotUtil.takeScreenShot();
        Thread.sleep(5000);
        this.googlePage.getSearchComponent().search("spring bbot");
        this.screenShotUtil.takeScreenShot();
        Assert.assertTrue(this.googlePage.isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount()>=2);
        this.screenShotUtil.takeScreenShot();
        this.googlePage.close();
    }

//    @Test
//    public void googleTestGrid() throws InterruptedException {
//        this.googlePage.goTo();
//        Assert.assertTrue(this.googlePage.isAt());
//        this.screenShotUtil.takeScreenShot();
//        Thread.sleep(5000);
//        this.googlePage.getSearchComponent().search("spring bbot");
//        this.screenShotUtil.takeScreenShot();
//        Assert.assertTrue(this.googlePage.isAt());
//        Assert.assertTrue(this.googlePage.getSearchResult().getCount()>=2);
//        this.screenShotUtil.takeScreenShot();
//        //this.googlePage.close();
//    }
}
