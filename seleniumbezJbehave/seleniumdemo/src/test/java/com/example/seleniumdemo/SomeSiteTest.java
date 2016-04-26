package com.example.seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SomeSiteTest {

	private static WebDriver driver;
	WebElement element;

	@BeforeClass
	public static void driverSetup() {
		// ChromeDrirver, FireforxDriver, ...
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natalia\\Downloads\\webDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	@Test
//	public void homePage(){
//		driver.get("https://www.facebook.com/");
//		
//		element = driver.findElement(By.linkText("Polsat"));
//		assertNotNull(element);
//	}
	
	@Test
	public void facebookPage(){
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Testy" );
		driver.findElement(By.name("lastname")).sendKeys("Testowanie" );
		driver.findElement(By.name("reg_email__")).sendKeys("555222666" );
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("555222666" );
		driver.findElement(By.name("reg_passwd__")).sendKeys("xyz33W" );
		
		Select list = new Select(driver.findElement(By.id("day")));
		list.selectByIndex(2);
		
		Select list2 = new Select(driver.findElement(By.id("month")));
		list2.selectByVisibleText("kwi");
		
		Select list3 = new Select(driver.findElement(By.id("year")));
		list3.selectByVisibleText("1994");
		
		driver.findElement(By.id("u_0_e")).click();
		
		
//		element = driver.findElement(By.linkText("Polsat"));
//		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    assertNotNull(screenshot);

//		try {
//			FileUtils.copyFile(screenshot, new File("C:\\Users\\Natalia\\Downloads\\polsat.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//			assertTrue(false);
//		}
		
	}

//	@AfterClass
//	public static void cleanp() {
//		driver.quit();
//	}
}
