package com.theTestingAcademyShalini.selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium03 {

    @Test
    public void testMethod(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=800,600");
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());


    }
}
