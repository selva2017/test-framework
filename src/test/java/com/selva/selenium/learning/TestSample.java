package com.selva.selenium.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestSample {

	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\test-framework\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
			driver.get("https://healthy.kaiserpermanente.org");
			driver.findElement(By.className("navigational-select-dropdown")).click();
//			System.out.println(driver.findElement(By.xpath("//div[@id='navigational-picker--NaN']/div/ul")).getText());
			//			Select options = new Select(driver.findElement(By.xpath("//div[@id='navigational-picker--NaN']/div/ul")));
			//			options.selectByVisibleText("California - Northern ");
			String text = "N. California";
			//			WebElement el = driver.findElement(By.xpath("//ul[@class='navigational-select-dropdown__list']/li[text() = '" + text + "']"));
			WebElement el = driver.findElement(By.xpath("//li[@data-value = '" + text + "']"));
			el.click();
			Thread.sleep(5000);
			Assert.assertEquals("https://healthy.kaiserpermanente.org/northern-california", driver.getCurrentUrl());
//			Assert.assertEquals("https://healthy.kaiserpermanente.org/northern-california", driver.getCurrentUrl(),0);
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}

