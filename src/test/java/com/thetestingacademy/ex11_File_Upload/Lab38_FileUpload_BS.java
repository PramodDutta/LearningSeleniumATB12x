package com.thetestingacademy.ex11_File_Upload;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab38_FileUpload_BS {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.manage().window().maximize();


        WebElement username = driver.findElement(By.id("user_email_login"));
        username.sendKeys("lnn76@1secmail.website");

        new WaitHelpers().waitJVM(2000);

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("lnn76@1secmail.website");

        new WaitHelpers().waitJVM(2000);

        WebElement user_submit = driver.findElement(By.id("user_submit"));
        user_submit.click();

        new WaitHelpers().waitJVM(5000);

        driver.get("https://app-automate.browserstack.com/utilities/app_management");

        new WaitHelpers().waitJVM(2000);




        WebElement uploadFileInput = driver.findElement(By.id("file-upload"));
        String user_dir = System.getProperty("user.dir");
        // /Users/promode/IdeaProjects/LearningSeleniumATB12x
        System.out.println(user_dir);
        String path = user_dir+"/src/test/java/com/thetestingacademy/ex11_File_Upload/testdroid-sample-app.apk";

        uploadFileInput.sendKeys(path);




    }
}
