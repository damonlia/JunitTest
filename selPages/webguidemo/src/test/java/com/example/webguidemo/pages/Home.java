package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Home extends WebDriverPage {

	public Home(WebDriverProvider driverProvider) {
		super(driverProvider);
	}
	
	public void open() {
		get("https://www.viki.com/");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void searchDesAndOpen(){
		//findElement(By.xpath(SPORT_LINK)).click();
		findElement(By.id("q")).sendKeys("des");
		findElement(By.linkText("Descendants of the Sun")).click();
	}
	
	 public void clickexploredramas(){        
		 findElement(By.cssSelector("body > div.page-wrapper > nav > div > div > ul.navbar-group-start > li:nth-child(4) > a")).click();
	    }
	 
	 public String textExploreDrama(){        
		return findElement(By.cssSelector("body > div.page-wrapper > div:nth-child(6) > div.center-align.explore-heading > h1")).getText();
	    }
	
	
	 
//	public void loginUser() throws InterruptedException{
//		findElement(By.cssSelector("#signup > a")).click();
//		findElement(By.cssSelector("#signup > div > div > div.login-container.social-login > button.btn.btn-facebook.btn-block")).click();
//		Thread.sleep(10000);
//	}
//	
//	public void openaccount(){
//		findElement(By.id("menu-profile")).click();
//		findElement(By.cssSelector("#user-dash > ul > li:nth-child(1) > a")).click();
//	}
//	
//	public String getAboutMe(){
//		return findElement(By.cssSelector("body > div.page-wrapper > div.page-container > div > div > div > section > div > div > p")).getText();
//	
//	}
//	public void openSelectedLink() {
//		findElement(By.linkText("Project Ffinder")).click();
//	}
	
}
