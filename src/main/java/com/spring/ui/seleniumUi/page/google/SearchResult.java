package com.spring.ui.seleniumUi.page.google;

import com.spring.ui.seleniumUi.page.Base;
import org.apache.commons.io.input.UnixLineEndingInputStream;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;


@Configuration
public class SearchResult extends Base {

@FindBy(css="div.cc")
private List<WebElement> results;

public int getCount(){
    return this.results.size();
}

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.results.isEmpty());
    }
}
