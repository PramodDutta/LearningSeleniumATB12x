package com.thetestingacademy.ex15_Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import static com.thetestingacademy.ex07_WaitHelper.WaitHelpers.waitJVM;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Lab44_RL_P3 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        searchBox.sendKeys("india" + Keys.ENTER);

        waitJVM(5000);

        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));

        for (WebElement element : locations){


            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(element)).getText();

            System.out.println("| +" + rank + " | " + element.getText() + " | " + aqi + " | ");






        }






    }
}
