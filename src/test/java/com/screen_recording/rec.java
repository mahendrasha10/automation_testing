package com.screen_recording;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class rec {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		ScreenRecorderUtil.startRecord("main");
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		String ExpectedUrl = "https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl();

		if (ExpectedUrl.equals(actualUrl))
		{

			System.out.println("Correct Url");
		}

		else
		{
			
			System.out.println("Incorrect Url");
		}
		
		Thread.sleep(2000);
		
		ScreenRecorderUtil.stopRecord();

		driver.close();

	}

}
