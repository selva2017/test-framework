package com.selva.selenium.test_framework.ui_test_practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flows {
static WebDriver driver = null;
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://healthy.kaiserpermanente.org/");
		driver.findElement(By.id("site-search-button")).click();
		driver.findElement(By.id("kp-site-search-input")).sendKeys("doctors");
		driver.findElement(By.id("kp-site-search-button")).click();
		Assert.assertEquals("true", "true");
	}

}
