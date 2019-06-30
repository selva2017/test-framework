package com.selva.selenium.test_framework.ui_test_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNgSample {
	private static WebDriver driver = null;

	@BeforeTest
	public void setup(){
//		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Java_Selenium\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
//		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("http://uitestpractice.com/Students/Switchto");
	}

	@Test
	public void clickModal() throws Exception{
		
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
		Assert.assertEquals("Hello World!", driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
		
//		driver.findElement(By.id("alert")).click();
//		driver.switchTo().alert().accept();
//		//		driver.findElement(By.cssSelector("button[data-toggle='modal']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Launch modal')]")).click();
//		Thread.sleep(2000);
//		String modalTitle = driver.findElement(By.className("modal-title")).getText();
//		Assert.assertEquals(modalTitle, "Modal window demo","Title not matched");
//		driver.findElement(By.xpath("//button[text()='Ok']")).click();
	}

	@AfterTest
	public void closeBrowser() throws Exception{
		Thread.sleep(2000);
//		driver.quit();
	}

}
