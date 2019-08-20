package com.selva.selenium.test_framework.ui_test_practice.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageScroll {
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("SoftwareTestingHelp");
		element.sendKeys(Keys.ENTER);
		js.executeScript("window.scrollBy(0,1000)");
		List<WebElement> el = driver.findElements(By.tagName("a"));
		System.out.println(el.size());
		for (WebElement li: el){
				
				System.out.println(li.getAttribute("href"));
		}

	}
}
