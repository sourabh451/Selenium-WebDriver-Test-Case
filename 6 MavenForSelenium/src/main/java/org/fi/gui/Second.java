package org.fi.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Second {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/login");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login = driver.findElement(By.xpath("//button[text()='Sign in']"));
		
		user.sendKeys("abc@gmail.com");
		password.sendKeys("abc123");
		login.click();
		
		String url = "https://www.linkedin.com/login";
		String expectedUrl = driver.getCurrentUrl();
		System.out.println("After login url = "+expectedUrl);
		
		if(url.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}
}
