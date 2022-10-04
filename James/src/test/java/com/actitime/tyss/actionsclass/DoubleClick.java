package com.actitime.tyss.actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver");
    WebDriver driver = new ChromeDriver();
		
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    driver.get("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
	WebElement addButton = driver.findElement(By.id("add"));
	Actions action = new Actions(driver);
	action.doubleClick(addButton).perform();
	//Thread.sleep(2000);
	driver.quit();
    
    
	}

}
