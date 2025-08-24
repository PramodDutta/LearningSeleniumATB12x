package com.thetestingacademy.ex11_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Lab37_FileUpload {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        String user_dir = System.getProperty("user.dir");
        // /Users/promode/IdeaProjects/LearningSeleniumATB12x
        System.out.println(user_dir);
        String path = user_dir+"/src/test/java/com/thetestingacademy/ex10_Actions_Class/TestData.txt";

        uploadFileInput.sendKeys(path);
        driver.findElement(By.name("submit")).click();



    }
}
