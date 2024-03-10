package com.theTestingAcademyShalini.selenium;

import org.openqa.selenium.edge.EdgeDriver;



public class Selenium08 {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com");
        driver.navigate().to("https://app.vwo.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();


    }
}
