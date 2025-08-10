package com.thetestingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonToAll {

    public FirefoxDriver driver;

    public  void openBrowser(WebDriver driver, String url){
        driver.get(url);
    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }

}
