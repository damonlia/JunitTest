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
	 
	

}
