package com.selva.selenium.test_framework.ui_test_practice.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Wait {
	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Java_Selenium\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
		Assert.assertEquals("Hello World!", driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
//		driver.get("http://www.facebook.com");
//		driver.findElement(By.name("firstname")).sendKeys("Selva");;
//		driver.findElement(By.name("lastname")).sendKeys("Wait");
////		Thread.sleep(500);
//		driver.findElement(By.id("u_0_y")).click();
		
		driver.quit();
	}
}
