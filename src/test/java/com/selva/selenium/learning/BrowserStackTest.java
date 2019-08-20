package com.selva.selenium.learning;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import junit.framework.Assert;

public class BrowserStackTest {
	public static String USERNAME ="a";
	public static String ACCESSKEY ="";
	public static String URL ="https://"+USERNAME+":"+ACCESSKEY+"@hub.browserstack.com/wd/hub";

	public static void main(String[] args) throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("firefox");
		capabilities.setVersion("57");
		URL browserStackUrl = new URL(URL);
		WebDriver driver = new RemoteWebDriver(browserStackUrl, capabilities);
		driver.get("https://healthy.kaiserpermanente.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//		Select options = new Select(driver.findElement(By.id("region-global-select-dropdown")));
		//		options.selectByVisibleText("California - Northern ");
		//		Assert.assertEquals("//healthy.kaiserpermanente.org/northern-california", driver.getCurrentUrl());
		//		Thread.sleep(5000);

		driver.findElement(By.xpath("//li[@class='menu-item']/a[text()='Doctors & Locations']")).click();
		driver.findElement(By.linkText("Colorado - Southern Colorado")).click();
		Select option = new Select(driver.findElement(By.id("city-dropdown-li")));
		option.selectByVisibleText("Aurora");
		option.selectByIndex(5);
		List<WebElement> listElement = option.getOptions();
		for(WebElement webElements: listElement)
			System.out.println(webElements.getText());
		System.out.println(option.getOptions().toString().length());
		System.out.println(option.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input#searchButton")).click();
		Select medSpeclty = new Select(driver.findElement(By.id("Medical-Specialty")));
		medSpeclty.selectByIndex(1);
		Thread.sleep(1000);
		Select healthPlan = new Select(driver.findElement(By.id("Health-Plan")));
		healthPlan.selectByIndex(1);

		driver.quit();
	}
}