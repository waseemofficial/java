package com.itlearn.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.Chrome.ChromDrivir ;
public class BrowserFactory {
	public static WebDriver startApplication(WebDriver,String browserName,String appUrl) {
		if(browserName.equals("Chrome")
				{
			System.setProperty("WebDriver.Chrome.driver","./Drivers/Chromedriver.exe")
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-Origins=*")
			Driver = new ChromeDriver(op);
				}else if (browserName.equals("Firefox")){
					System.setProperty("WebDriver.Chrome.driver","./Drivers/geckodriver.exe");
					driver = new FirefoxDriver();
				}else if(BrowserName.equals("IE"){
					
				}else {
					System.out.println("we do not support this browsr")
				}
	}
}
