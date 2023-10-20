package org.fi.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionBased {
	
	WebDriver driver;
	
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	
	public void productSearch() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bose");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Best Sellers")).click();
	}
	
	public void navigate() {
		driver.navigate().to("https://www.cdac.in/");
		System.out.println("The Title is =>"+driver.getTitle());
		driver.navigate().to("https://www.gmail.com/");
		driver.navigate().back();
		driver.navigate().to("https://www.facebook.com/");
	}
	
	public void facebookAuth() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
	}
	
	public void browserClose() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		FunctionBased fb = new FunctionBased();
		fb.launch();
		fb.productSearch();
		fb.navigate();
		fb.facebookAuth();
		fb.browserClose();
	}
}
