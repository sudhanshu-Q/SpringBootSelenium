package com.spring.ui.seleniumUi.restfulTest;

import com.spring.ui.seleniumUi.SpringBaseTest;
import com.spring.ui.seleniumUi.page.restfulWebservices.HomePage;
import com.spring.ui.seleniumUi.page.restfulWebservices.HomePageComponent;
import com.spring.ui.seleniumUi.util.ScreenShotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.annotations.Test;

@Component
public class HomePageTest extends SpringBaseTest {

    @Autowired
    private HomePage homePage;

    @Autowired
    private HomePageComponent homePageComponent;

    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void verifyHomepage_Test(){
        this.homePage.goTo();
        this.homePageComponent.verifyLogo();

    }
}
