package com.selva.selenium.test_framework.ui_test_practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {

	WebDriver driver = null;
//	radio button in mortgage
	public PageObjects(WebDriver driver){
		this.driver = driver;
	}
	By radioPercent = By.cssSelector("input[value=percent]");
	
	public void setRadio(){
		driver.findElement(radioPercent).click();
	}
}
