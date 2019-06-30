package com.selva.selenium.test_framework.ui_test_practice.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

		WebElement start = driver.findElement(By.xpath("//button[text()='Start']"));
		start.click();
		validator(driver, 10);
	}
	public static void validator(WebDriver driver1,int timeout){
		
		new WebDriverWait(driver1,timeout).until(ExpectedConditions.visibilityOf(driver1.findElement(By.xpath("//div[@id='finish']/h4"))));
	}


}
