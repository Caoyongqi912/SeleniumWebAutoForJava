package com.cyq.auto.utils;

import com.cyq.auto.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * @author cyq
 * @desc SeleniumUtil
 * @date 2022/6/22
 **/


public class SeleniumDriver {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BasePage.class);

    public static WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        ChromeOpt chromeOpt = new ChromeOpt();
        WebDriver driver = new ChromeDriver(chromeOpt.getOpt());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = SeleniumDriver.getWebDriver() ;
        driver.get("http://www.baidu.com");
        String tit = driver.getTitle();
        System.out.println("===" + tit);
        driver.quit();
    }
}
