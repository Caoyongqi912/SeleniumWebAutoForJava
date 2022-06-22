package com.cyq.auto.utils;

import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author cyq
 * @desc ChromeOpt
 * @date 2022/6/22
 **/


public class ChromeOpt {

    public ChromeOptions getOpt() {
        ChromeOptions options = new ChromeOptions();
        String SysName = System.getProperty("os.name");
        if (!SysName.contains("Windows")) {
            options.addArguments("--headless"); // 服务运行 无头
        }
        options.addArguments("--lang=zh-CN");//中文简体
        options.addArguments("--start-maximized"); //页面最大化
//        options.addArguments("--disable-gpu"); //关闭GPU
//        options.setBinary("Application\\chrome.exe"); 指定浏览器

        return options;
    }
}
