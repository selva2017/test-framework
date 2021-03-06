package com.selva.selenium.test_framework.ui_test_practice.tests;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kayak {

	static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver", "C:\\Java_Selenium\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////		driver = new FirefoxDriver();
//		driver.get("http://www.kayak.com");
//		driver.findElement(By.xpath("//ul[@class='keel-grid _5M _5L _8R _8Q _8T _8S']/li")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='jnUe-dateRangeInput-display-start']//div[@class='_s _v _xc _z']")).click();
////		driver.findElement(By.id("jnUe-depart-input")).sendKeys("8/12/2019");
////		driver.findElement(By.xpath("//div[@data-value='roundtrip']")).click();
////		driver.findElement(By.xpath("//div[@data-value='oneway']")).click();
////		driver.findElement(By.xpath("//input[@id='c-xg6-origin-airport']")).click();
////		driver.findElement(By.xpath("//div[@id='c-xg6-origin-airport-display-inner']")).sendKeys("Denver");
////		driver.findElement(By.xpath("//div[@role='listitem']/div/span[2]")).sendKeys("SFO");
//		
////		driver.findElement(By.id("AZkz-switch-option-2")).click();
////		driver.findElement(By.className("js-selection-text-container _bd _o _O _p _q _hcD _ht _k _n")).click();
//		Thread.sleep(1000);
//		driver.quit();

	    HashMap<String, Object> vars = new HashMap<String, Object>();
	    driver.get("https://www.kayak.com/");
	    driver.manage().window().setSize(new Dimension(550, 692));
//	    js.executeScript("window.scrollTo(0,0)");
	    vars.put("window_handles", driver.getWindowHandles());
	    driver.findElement(By.cssSelector("#lH4Y-submit .\\_ivP")).click();
//	    vars.put("win9435", waitForWindow(2000));
	    vars.put("root", driver.getWindowHandle());
	    driver.switchTo().window(vars.get("win9435").toString());
	    vars.put("window_handles", driver.getWindowHandles());
	    driver.findElement(By.id("oAqq-mb-bE-1185935941f")).click();
//	    vars.put("win4547", waitForWindow(2000));
	    driver.switchTo().window(vars.get("win4547").toString());
	    driver.switchTo().window(vars.get("root").toString());
	    driver.switchTo().frame(1);
//	    js.executeScript("window.scrollTo(0,0)");

	}

}
