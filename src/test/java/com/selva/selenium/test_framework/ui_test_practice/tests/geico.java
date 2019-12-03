package com.selva.selenium.test_framework.ui_test_practice.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class geico {
	static WebDriver driver=null;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.geico.com/auto-insurance/");
			driver.findElement(By.cssSelector("#zip")).sendKeys("43035");
			driver.findElement(By.id("submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("skip")).click();
//			driver.findElement(By.className("icon-vehicle")).click();
			Thread.sleep(2000);
//			driver.findElement(By.cssSelector("div[class='button-bar']>button")).click();
			driver.findElement(By.xpath("//button[text()='Next']")).click();
//			Thread.sleep(5000);
			driver.findElement(By.name("firstName")).sendKeys("Selva");
			driver.findElement(By.name("lastName")).sendKeys("Raj");
//			Thread.sleep(500);
//			WebDriverWait wait = new WebDriverWait (driver, 20);
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='back-button-removal-show']/button")));
			
			//			driver.findElement(By.cssSelector("div[class='back-button-removal-show']>button")).click();
			driver.findElement(By.xpath("//div[@class='pull-right']/button")).click();
			driver.findElement(By.name("date-monthdob")).sendKeys("09");
			driver.findElement(By.name("date-daydob")).sendKeys("01");
			driver.findElement(By.name("date-yeardob")).sendKeys("1979");
			//		driver.findElement(By.name("date-yeardob")).sendKeys(Keys.TAB);
			driver.findElement(By.xpath("//div[@class='pull-right']/button")).click();
//					driver.findElement(By.xpath("//button[text()='Next']")).sendKeys(Keys.ENTER);		
			//		WebDriverWait w = new WebDriverWait(driver, 10);
			//		WebElement element = driver.findElement(By.xpath("//div[@class='back-button-removal-hide']/button"));
			//		WebElement element1 = w.until(ExpectedConditions.elementToBeClickable(element));
			//		element1.click();
			Thread.sleep(2000);
			//WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
//			WebDriverWait wait = new WebDriverWait (driver, 20);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Next']")));
			driver.findElement(By.xpath("//button[text()='Next']")).click();
		}
			finally {
		
			driver.quit();
			}
	}

}
