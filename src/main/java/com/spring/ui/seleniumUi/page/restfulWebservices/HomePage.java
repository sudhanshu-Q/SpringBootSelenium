package com.spring.ui.seleniumUi.page.restfulWebservices;

import com.spring.ui.seleniumUi.page.Base;
import com.spring.ui.seleniumUi.page.google.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class HomePage extends Base {

    @Autowired
    private HomePageComponent homePageComponent;

    public HomePageComponent getHomePageComponent() {
        return homePageComponent;
    }

    @Autowired
    private SearchResult searchResult;

//    public SearchResult getSearchResult() {
//        return searchResult;
//    }
//

    @Value("${application.url}")
    private String url;

    public void goTo(){
       // logger.info("URL :"+url);
        this.driver.get(url);
    }

    @Override
    public boolean isAt() {
        return this.homePageComponent.isAt();
    }

    public void close(){
        this.driver.quit();
    }

}
