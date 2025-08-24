package com.thetestingacademy.ex12_Windows;


import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class TestProjectInterview {

    @Test
    public void test_interview_vwo_project() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");
        driver.manage().window().maximize();

        new WaitHelpers().waitJVM(5000);

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent -> " + parentWindowHandle);

        WebElement url_input = driver.findElement(By.name("primaryUrl"));
        url_input.clear();
        url_input.sendKeys("https://thetestingacademy.com");

        WebElement view_heatmap = driver.findElement(By.xpath("//button[text()=\" View Heatmap \"]"));
        view_heatmap.click();

        new WaitHelpers().waitJVM(10000);


        Set<String> allHandles = driver.getWindowHandles();
        System.out.println(allHandles);


        for (String handle : allHandles) {
            if (!handle.equals(parentWindowHandle)) {
                driver.switchTo().window(handle);
                driver.switchTo().frame("heatmap-iframe");

                new WaitHelpers().waitJVM(2000);

                System.out.println(driver.getPageSource());

                Actions actions = new Actions(driver);
                WebElement navigate_button = driver.findElement(By.xpath("//span[text()=\"Compare\"]"));
                actions.moveToElement(navigate_button).click().build().perform();
            }

        }


    }
}
