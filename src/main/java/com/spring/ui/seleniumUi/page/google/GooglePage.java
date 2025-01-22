package com.spring.ui.seleniumUi.page.google;

import com.spring.ui.seleniumUi.page.Base;
import org.openqa.selenium.WebElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class GooglePage extends Base {

//    private static final Logger logger= (Logger) LoggerFactory.getLogger(GooglePage.class);

    @Autowired
    private SearchComponent searchComponent;

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    @Autowired
    private SearchResult searchResult;

    public SearchResult getSearchResult() {
        return searchResult;
    }


    @Value("${application.url}")
    private String url;

    public void goTo(){
        //logger.info("URL :"+url);
        this.driver.get(url);
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }

    public void close(){
        this.driver.quit();
    }

}
