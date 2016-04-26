package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProjectFinder extends WebDriverPage{
	
	public ProjectFinder(WebDriverProvider driverProvider) {
		super(driverProvider);		
	}

	public void open() {
		get("http://subber.viki.com/project_finder");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void selectFilter(){        
		Select subtitle = new Select(findElement(By.cssSelector("#type")));
		subtitle.selectByVisibleText("subtitle");
		
		Select language = new Select(findElement(By.cssSelector("#language_code")));
		language.selectByVisibleText("Polish");
		
//		Select from = new Select(findElement(By.cssSelector("#js-filters > div > div:nth-child(3) > select")));
//		from.selectByVisibleText("I want to subtitle from");
//		
//		Select to = new Select(findElement(By.id("original_language_code")));
//		to.selectByVisibleText("English");
//		
//		findElement(By.linkText("Add Filter")).click();
//		
//		Select country = new Select(findElement(By.cssSelector("#js-filters > div > div:nth-child(4) > select")));
//		country.selectByVisibleText("Shows from");
//		
//		findElement(By.cssSelector("#s2id_country_of_origin > ul > li:nth-child(1) > a")).click();
		
		findElement(By.cssSelector("#js-filters > div > div.row > div:nth-child(2) > a")).click();
    }
	
	
	public String aviableDramaToTranslate(){
		return findElement(By.cssSelector("#grid-view > div:nth-child(1) > div:nth-child(1) > div > div > div:nth-child(3) > p:nth-child(1) > strong")).getText();
	}
	
	public void openDrama(){
		findElement(By.partialLinkText("heared it through"));
	}
	
	public String needToLogin(){
		return findElement(By.id("loginLink")).getText();
	}
	
	
}
