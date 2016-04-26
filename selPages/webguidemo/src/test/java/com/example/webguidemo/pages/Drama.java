package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Drama extends WebDriverPage{
	
	public Drama(WebDriverProvider driverProvider) {
		super(driverProvider);		
	}

	public void open() {
		get("https://www.viki.com/tv/23205c-descendants-of-the-sun?q=des");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	 
	 public void select(){   
			Select list = new Select(findElement(By.cssSelector("#type")));
			list.selectByVisibleText("Movies");
		 }
	 
	 public String getTitleOfDrama(){   
		 findElement(By.cssSelector("#pjaxify-container > div > div.card.explore-results > div.card-content.clearfix > div > div:nth-child(1) > div.thumbnail-description.dropdown-menu-wrapper > div:nth-child(2) > a")).click();
			return findElement(By.cssSelector("body > div.page-wrapper > div.main-container > div.container > div:nth-child(2) > div > div.card.billboard > div > div.col.s12.l4.m4.billboard-meta > h1")).getText();
					}

}
