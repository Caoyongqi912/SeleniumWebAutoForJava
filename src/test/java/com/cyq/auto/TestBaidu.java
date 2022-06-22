package com.cyq.auto;

import com.cyq.auto.action.BaiduAction;
import com.cyq.auto.utils.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author cyq
 * @desc test_baidu
 * @date 2022/6/22
 **/
public class TestBaidu {

    WebDriver driver;

    @BeforeClass
    public void before() {
        driver = SeleniumDriver.getWebDriver();
        driver.get("https://www.baidu.com");
    }
    @AfterClass
    public void after() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test_baidu_demo() {
        BaiduAction d = new BaiduAction(driver);
        d.search("java");
    }

}
