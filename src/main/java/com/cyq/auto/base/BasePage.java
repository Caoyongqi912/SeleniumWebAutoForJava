package com.cyq.auto.base;

import com.cyq.auto.utils.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;

/**
 * @author cyq
 * @desc BaseObject
 * @date 2022/6/22
 **/

public class BasePage extends SeleniumDriver {
    // 这是一个全局的driver，其他页面对象会继承该类的所有属性和方法
    protected WebDriver driver;
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * 查找元素
     *
     * @param locator By
     * @return WebElement
     */
    public WebElement findElement(By locator) {
        WebElement webElement = null;
        try {
            webElement = driver.findElement(locator);
        } catch (NoSuchElementException e) {
            log.error(e.getMessage());
        }
        return webElement;
    }

    /**
     * send
     *
     * @param locator By
     * @param text    String
     */
    public void send(By locator, String text) {
        try {
            WebElement element = findElement(locator);
            element.sendKeys(text);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    /**
     * click
     *
     * @param locator By
     */
    public void click(By locator) {
        try {
            WebElement element = findElement(locator);
            element.click();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

}
