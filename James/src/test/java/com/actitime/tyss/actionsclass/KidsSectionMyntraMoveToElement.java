package com.actitime.tyss.actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KidsSectionMyntraMoveToElement {

	public static void main(String[] args) throws Throwable {


		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		WebElement kidsSection = driver.findElement(By.linkText("Kids"));
		Actions actions = new Actions(driver);
		actions.moveToElement(kidsSection).click().perform();

		Thread.sleep(5000);
		driver.quit();



	}


}
