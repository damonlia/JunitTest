package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SingUp extends WebDriverPage{
	
	public SingUp(WebDriverProvider driverProvider) {
		super(driverProvider);		
	}

	public void open() {
		get("https://www.viki.com/sign_up");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void fillIncorrectlyForm(){
		findElement(By.id("name")).sendKeys("natalia");
		findElement(By.id("email")).sendKeys("n");
		findElement(By.id("password")).sendKeys("xxxxxxxx");
		Select list = new Select(findElement(By.id("gender")));
		list.selectByVisibleText("Female");
	}
	
	public String getValidationMessage() {
		return findElement(By.id("email-error")).getText();
	}
	
	public boolean clickButton() {
	//	findElement(By.id("submit")).click();
		return findElement(By.id("submit")).isDisplayed();
	}
	

	
}
