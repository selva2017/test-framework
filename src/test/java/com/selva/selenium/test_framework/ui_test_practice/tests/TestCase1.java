package com.selva.selenium.test_framework.ui_test_practice.tests;
//
//public class TestCase1 {
//
//}
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class TestCase1 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    @SuppressWarnings("unchecked")
	Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void tt1() {
    driver.get("https://www.kayak.com/");
    driver.manage().window().setSize(new Dimension(550, 692));
    js.executeScript("window.scrollTo(0,0)");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector("#lH4Y-submit .\\_ivP")).click();
    vars.put("win9435", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("win9435").toString());
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.id("oAqq-mb-bE-1185935941f")).click();
    vars.put("win4547", waitForWindow(2000));
    driver.switchTo().window(vars.get("win4547").toString());
    driver.switchTo().window(vars.get("root").toString());
    driver.switchTo().frame(1);
    js.executeScript("window.scrollTo(0,0)");
  }
}
