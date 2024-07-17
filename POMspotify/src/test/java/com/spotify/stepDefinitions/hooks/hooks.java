package com.spotify.stepDefinitions.hooks;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {
    @Managed
    WebDriver driver;
    @BeforeAll
    public void setUpClass(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }
    @BeforeEach
    public void setUpTest(){
        driver= new ChromeDriver();
    }
    @AfterAll
    public void driverQuit(){
        driver.quit();
    }

}
