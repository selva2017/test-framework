package com.selva.selenium.test_framework.ui_test_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Select;

import com.selva.selenium.test_framework.ui_test_practice.pages.PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectList {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//		driver.get("http://uitestpractice.com/Students/Select");
		driver.get("https://www.mortgagecalculator.org/");
		//		Radio button
		System.out.println(driver.findElement(By.cssSelector("input[value=percent]")).isSelected());
		PageObjects po = new PageObjects(driver);
		po.setRadio();
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.cssSelector("input[value=percent]")).isSelected());
//		driver.findElement(By.cssSelector("input[value=percent]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value=percent]")).isSelected());
		driver.findElement(By.xpath("//input[@value='money']")).click();
		Thread.sleep(5000);
		//		Link
		//		driver.findElement(By.xpath("//div[@class='output-param']/a")).click();
		driver.findElement(By.partialLinkText("Show Amortization Tables")).click();
		List<WebElement> str = driver.findElements(new ByChained(By.partialLinkText("Show Amortization Tables"),By.xpath("//input[@name='param[show_m_vs_w]']")));
		System.out.println(str.size());
		//		Check box
		System.out.println(driver.findElement(By.xpath("//input[@name='param[show_m_vs_w]']")).isSelected());
		driver.findElement(By.xpath("//input[@name='param[show_m_vs_w]']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='param[show_m_vs_w]']")).isSelected());
		//		driver.findElement(By.cssSelector("input[name=param[show_m_vs_w]]")).click();
		driver.findElement(By.cssSelector("div[class=param]:nth-child(5)")).click();
		//		Drop down
		WebElement elements =driver.findElement(By.id("credit_rating"));
		Select element = new Select(elements);
		System.out.println(		element.getFirstSelectedOption().getText());
		element.selectByVisibleText("Good (620 - 719)");
		System.out.println(		element.getFirstSelectedOption().getText());
		
		//Multi list - select 2
		//		element.selectByIndex(1);
		//		element.selectByIndex(2);
		//		end
		List<WebElement> listElement = element.getOptions();
		for(WebElement webElements: listElement)
			System.out.println(webElements.getText());
		Thread.sleep(5000);
		driver.quit();
	}

}
