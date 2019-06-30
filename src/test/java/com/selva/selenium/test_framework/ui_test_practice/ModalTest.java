package com.selva.selenium.test_framework.ui_test_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ModalTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/junit/junit/4.12");
	
		driver.findElement(By.id("alert")).click();

		driver.switchTo().alert().accept();
		//		driver.findElement(By.cssSelector("button[data-toggle='modal']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Launch modal')]")).click();
		Thread.sleep(2000);
		String modalTitle = driver.findElement(By.className("modal-title")).getText();
		Assert.assertEquals(modalTitle, "Modal window demo","Title not matched");
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
