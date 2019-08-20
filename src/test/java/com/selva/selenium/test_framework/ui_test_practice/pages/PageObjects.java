package com.selva.selenium.test_framework.ui_test_practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	WebDriver driver = null;
	//	radio button in mortgage
	public PageObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	By radioPercent = By.cssSelector("input[value=percent]");
	@FindBy(id="loanterm")
	private WebElement loanTerm;
	public void loanAmount(){
		loanTerm.sendKeys("9");
	}
	public void setRadio(){
		driver.findElement(radioPercent).click();
	}
}
