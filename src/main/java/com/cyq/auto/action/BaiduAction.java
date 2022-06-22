package com.cyq.auto.action;

import com.cyq.auto.base.BasePage;
import com.cyq.auto.locators.BaiduLocator;
import org.openqa.selenium.WebDriver;

/**
 * @author cyq
 * @desc BaiduAction
 * @date 2022/6/22
 **/
public class BaiduAction extends BasePage {

    public BaiduAction(WebDriver driver){
        super(driver);
    }

    public void search(String text) {
        send(BaiduLocator.SEARCH_INPUT, text);
        click(BaiduLocator.SUBMIT);

    }

}
