package com.spring.ui.seleniumUi.page.restfulWebservices;

import com.spring.ui.seleniumUi.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HomePageComponent extends Base {

    //private static final Logger logger = LoggerFactory.getLogger(SearchComponent.class);

    @FindBy(className = "logo")
    private WebElement LOGO_ICON;

    @FindBy(id = "submit")
    private List<WebElement> SUBMIT_BTN;

//    public void search(final String keyword){
//        this.searchBox.sendKeys(keyword);
//        this.searchBox.sendKeys(Keys.TAB);
//        this.searchBtns.stream().filter(e -> e.isDisplayed() && e.isEnabled())
//                .findFirst()
//                .ifPresent(e -> e.click());
//    }

    public void verifyLogo(){
        boolean isDisplayed_Logo = this.LOGO_ICON.isDisplayed();
        if(isDisplayed_Logo){
            this.LOGO_ICON.click();
        }
        else {
            System.out.println("LOGO NOT DISPLAYED");
        }
    }

    @Override
    public boolean isAt() {
        return false;
       // return this.wait.until((d) -> this.searchBox.isDisplayed());
    }
}

