package com.theTestingAcademyShalini.selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium09 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
