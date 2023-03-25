package login_test;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

	driver	 = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

	//	Thread.sleep(2000);
	}
		@Test(priority = 1)
		public void VerifyUrl() throws InterruptedException  {
			Thread.sleep(2000);

			String ExpectedUrl = "https://www.saucedemo.com/";

			String actualUrl = driver.getCurrentUrl();

			assertEquals(ExpectedUrl, actualUrl);
			assertTrue(true);
			Thread.sleep(2000);
		}
		
		@AfterTest
		public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		}

	}