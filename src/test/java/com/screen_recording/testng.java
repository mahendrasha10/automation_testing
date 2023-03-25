package com.screen_recording;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {

	

		WebDriver driver;

		@BeforeTest
		public void setup() throws Exception {
			ScreenRecorderUtil.startRecord("main");
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");

		}

		@Test(priority = 1)
		public void VerifyUrl() throws InterruptedException {
			Thread.sleep(2000);
			String ExpectedUrl = "https://www.saucedemo.com/";

			String actualUrl = driver.getCurrentUrl();

			if (ExpectedUrl.equals(actualUrl)) {

				System.out.println("Correct Url");
			}

			else {
				System.out.println("Incorrect Url");
			}
			Thread.sleep(2000);
		}

		@Test(priority = 2)
		public void VerifyTitle() throws InterruptedException {
			Thread.sleep(2000);
			String expectedTitle = "Swag Labs";

			String actualTitle = driver.getTitle();

			if (expectedTitle.equals(actualTitle)) {
				System.out.println("Title is correct");
			} else {
				System.out.println("Title is incorrect");
			}
		}
		@Test(priority = 3)
		public void user_pass() throws InterruptedException {
			Thread.sleep(2000);
			WebElement ele_user= driver.findElement(By.id("user-name"));
			ele_user.sendKeys("standard_user");
			Thread.sleep(2000);
			WebElement ele_pass = driver.findElement(By.id("password"));
			ele_pass.sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			String exp_url = "https://www.saucedemo.com/inventory.html";
			if(url.equals(exp_url))
			{
				System.out.println("login Succesfull");
			}
			else
			{
				System.out.println("login fail");
			}
		
		}
		@Test(priority = 4)
		
		public void chk_out() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("checkout")).click();
			Thread.sleep(2000);
			
		}
		
		@Test(priority = 5)
		 public void chk_one_step() throws InterruptedException
		 {
			Thread.sleep(2000);
			WebElement fst_name = driver.findElement(By.id("first-name")); 
			fst_name.sendKeys("Mahendra");
			Thread.sleep(2000);
			WebElement fst_lst = driver.findElement(By.id("last-name"));
			fst_lst.sendKeys("sharma");
			Thread.sleep(2000);
			WebElement pin = driver.findElement(By.id("postal-code"));
			pin.sendKeys("201001");
			Thread.sleep(2000);
			driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
		 }
		 @Test(priority = 6)
		 public void chk_finish() throws InterruptedException, IOException
		 {
			 Thread.sleep(2000);
			 driver.findElement(By.id("finish")).click();
			 Thread.sleep(2000);
			 
			 
			 
			 	TakesScreenshot sc = ((TakesScreenshot) driver);
				File src = sc.getScreenshotAs(OutputType.FILE);
				File f2 = new File("C:\\Users\\mahen\\Desktop\\screenshot\\purchase.png");
				FileUtils.copyFile(src, f2);
				
		 }

		@AfterTest
		public void teardown() throws Exception {
			
			Thread.sleep(2000);
			ScreenRecorderUtil.stopRecord();
			driver.close();
		}

	} 


