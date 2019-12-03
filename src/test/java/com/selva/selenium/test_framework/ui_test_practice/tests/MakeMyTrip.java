package com.selva.selenium.test_framework.ui_test_practice.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		try {
			WebDriverManager.chromedriver().setup();
			//	System.setProperty("webdriver.gecko.driver", "C:\\Java_Selenium\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Java\\test-framework\\drivers\\chromedriver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.get("https://www.makemytrip.com/");
			driver.findElement(By.id("fromCity")).click();
			driver.findElement(By.xpath("//input[@type='text'][@placeholder='From']")).sendKeys("Coimbatore");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0 .calc60 > .font14")).click();
			Thread.sleep(2000);
			//			driver.findElement(By.id("toCity")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".react-autosuggest__input")).sendKeys("columbus");
			driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-2 .calc60 > .font14")).click();
			Thread.sleep(2000);    driver.findElement(By.cssSelector(".DayPicker-Month:nth-child(1) .DayPicker-Week:nth-child(5) > .DayPicker-Day:nth-child(1) p")).click();
			driver.findElement(By.cssSelector(".primaryBtn")).click();
			js.executeScript("window.scrollTo(0,67.19999694824219)");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			e.printStackTrace();

		} finally {
			driver.quit();
		}
	}

}
