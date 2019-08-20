package com.selva.selenium.test_framework.ui_test_practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class KayakPages {

	WebDriver driver = null;

	public KayakPages(WebDriver driver){
		this.driver = driver;
	}
//	Header
	By flightLink = By.id("Rl20");
	By tripOption= By.id("AZkz-switch-display");
	
	public void selectTripOption(){
//		Select options = new Select(tripOption);
	}
}

