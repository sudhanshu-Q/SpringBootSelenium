package com.spring.ui.seleniumUi.page.google;

import com.spring.ui.seleniumUi.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@Configuration
public class SearchComponent extends Base {

    //private static final Logger logger = LoggerFactory.getLogger(SearchComponent.class);

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnk")
    private List<WebElement> searchBtns;

    public void search(final String keyword){
        this.searchBox.sendKeys(keyword);
        this.searchBox.sendKeys(Keys.TAB);
        this.searchBtns.stream().filter(e -> e.isDisplayed() && e.isEnabled())
                .findFirst()
                .ifPresent(e -> e.click());
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.searchBox.isDisplayed());
    }
}
