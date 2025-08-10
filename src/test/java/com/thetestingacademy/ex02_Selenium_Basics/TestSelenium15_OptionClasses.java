package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class TestSelenium15_OptionClasses {

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?
//        chromeOptions.addArguments("--window-size=800,600");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
//        chromeOptions.addArguments("--headless");




        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://sdet.live");

        System.out.println(driver.getTitle());

        driver.quit();



    }


}
