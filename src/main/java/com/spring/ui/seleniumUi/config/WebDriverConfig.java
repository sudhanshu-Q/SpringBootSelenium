package com.spring.ui.seleniumUi.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Configuration
public class WebDriverConfig {

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    //@Primary //this will set the browser as primary when two beans are there chrome and firefox
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

//    @ThreadScopeBean
//    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
//    public WebDriver firefoxDriver(){
//        WebDriverManager.firefoxdriver().setup();
//        return new FirefoxDriver();
//    }

//    @ThreadScopeBean
//    @ConditionalOnMissingBean
//    public WebDriver chromeDriver(){
//        WebDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }

}

//}
