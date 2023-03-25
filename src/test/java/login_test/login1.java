package login_test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class login1 {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Before test ");

	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("I will execute before the class");
	}
	@BeforeMethod
	public void beforemethod1() {
		System.out.println("before method");
	}


@Test(priority = 1)
	public void VerifyTitle1() {

		String expectedTitle = "Swag Labs";

		String actualTitle = driver.getTitle();

		assertEquals(expectedTitle, actualTitle);

		assertTrue(true);
	}
@Test(priority = 2)
	public void login111() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));

		ele1.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void Aftermethod1() {
		System.out.println("After method");
	}
	@BeforeMethod
	public void beforemethod11() {
		System.out.println("before method");
	}



	public void VerifyTitle11() {

		String expectedTitle = "Swag Labs";

		String actualTitle = driver.getTitle();

		assertEquals(expectedTitle, actualTitle);

		assertTrue(true);
	}

	public void login11() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));

		ele1.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void Aftermethod11() {
		System.out.println("After method");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}



	public void VerifyTitle() {

		String expectedTitle = "Swag Labs";

		String actualTitle = driver.getTitle();

		assertEquals(expectedTitle, actualTitle);

		assertTrue(true);
	}

	public void login() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));

		ele1.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void Aftermethod() {
		System.out.println("After method");
	}


	@AfterClass
	public void afterclass() {
		System.out.println("I will execute after the class");
	}
	
	@AfterTest
	public void teardown() {
		System.out.println("after test");
		driver.close();
	}

}