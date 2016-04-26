package com.example.webguidemo;

import org.jbehave.web.selenium.WebDriverProvider;

import com.example.webguidemo.pages.Drama;
import com.example.webguidemo.pages.Home;
import com.example.webguidemo.pages.ProjectFinder;
import com.example.webguidemo.pages.SingUp;

public class Pages {

	private WebDriverProvider driverProvider;
	
	//Pages
	private Home home;
	private Drama drama;
	private SingUp singup;
	private ProjectFinder pf;
	// ...

	public Pages(WebDriverProvider driverProvider) {
		super();
		this.driverProvider = driverProvider;
	}

	public Home home() {
		if (home == null) {
			home = new Home(driverProvider);
		}
		return home;
	}
	
	public Drama drama() {
		if (drama == null) {
			drama = new Drama(driverProvider);
		}
		return drama;
	}
	
	public SingUp singup(){
		if (singup == null) {
			singup = new SingUp(driverProvider);
		}
		return singup;
	}
	public ProjectFinder pf(){
		if (pf == null) {
			pf = new ProjectFinder(driverProvider);
		}
		return pf;
	}
}
