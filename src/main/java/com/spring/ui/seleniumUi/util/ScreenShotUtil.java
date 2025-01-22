package com.spring.ui.seleniumUi.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Component
public class ScreenShotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}/img.png")
    private Path path;

    public void takeScreenShot(){
        File sourceFile=this.driver.getScreenshotAs(OutputType.FILE);
        try {
            FileCopyUtils.copy(sourceFile,this.path.toFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
