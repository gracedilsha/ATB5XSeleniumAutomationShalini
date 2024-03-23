package com.theTestingAcademyShalini.selenium.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Project1_InvalidLogin {

    @Test
    public void testVWOLoginNegative() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("123");
        driver.findElement(By.xpath("//button[@id='js-login-btn']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='js-notification-box-msg']")));

        WebElement error_msg = driver.findElement(By.xpath("//div[@id='js-notification-box-msg']"));
        String msg = error_msg.getText();
        System.out.println(msg);
        Assert.assertEquals(msg, "Your email, password, IP address or location did not match");
        driver.quit();
    }
}
