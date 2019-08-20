package com.selva.selenium.learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumSample {

	static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\test-framework\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//		driver.manage().deleteAllCookies();
		driver.get("http://www.kp.org");
		//		driver.findElement(By.linkText("Doctors & Locations")).click();
		driver.findElement(By.xpath("//li[@class='menu-item']/a[text()='Doctors & Locations']")).click();
		//		driver.findElement(By.cssSelector("a[href='/health/care/consumer/locate-our-services/doctors-and-locations']")).click();
		driver.findElement(By.linkText("Colorado - Southern Colorado")).click();
		//		driver.findElement(By.xpath("//li/a[text()='Colorado - Northern Colorado ']")).click();

		WebDriverWait wait = new WebDriverWait(driver,10);
		//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("city-dropdown-li"), 4));
		Select option = new Select(driver.findElement(By.id("city-dropdown-li")));
		option.selectByVisibleText("Aurora");
		option.selectByIndex(5);
		//		new Select((WebElement) driver.findElement(By.id("city-dropdown-li"))).selectByIndex(3);
		List<WebElement> listElement = option.getOptions();
		for(WebElement webElements: listElement)
			System.out.println(webElements.getText());
		System.out.println(option.getOptions().toString().length());
		System.out.println(option.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("input#searchButton")).click();

		//		Select newPatients = new Select(driver.findElement(By.id("Accepting-New-Patients")));
		//		newPatients.selectByIndex(1);

		//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("Medical-Specialty"), 1));
		Select medSpeclty = new Select(driver.findElement(By.id("Medical-Specialty")));
		medSpeclty.selectByIndex(1);
		//		Select city = new Select(driver.findElement(By.id("City")));
		//		city.selectByIndex(1);
		Thread.sleep(1000);
		//		wait.until(ExpectedConditions.elementToBeSelected(By.id("Health-Plan")));
		Select healthPlan = new Select(driver.findElement(By.id("Health-Plan")));
		healthPlan.selectByIndex(1);
		driver.quit();
	}

}
