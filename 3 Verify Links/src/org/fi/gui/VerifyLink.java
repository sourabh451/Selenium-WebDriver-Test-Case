//Test Case 1: Verify Internal and External Links in wikipedia.org
//Test Steps:
//1. Launch the Browser
//2. Navigate to wikipedia.org selenium page
//3. Click the “Create account” link
//4. Capture the URL
//5. Navigate back to Selenium Page
//6. Click the “selenium.dev” link
//7. Capture the URL
//8. Close the Browser
//Verification Point/s:
//1. Verify if the 1st URL is an Internal link
//2. Verify if the 2nd URL is an External link
//Input Data/Test Data:
//NA
//Expected Result/URL:
//1. https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29
//2. https://www.selenium.dev/
package org.fi.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLink {
	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
	}
	
	public void verification() throws InterruptedException {
		driver.findElement(By.id("searchInput")).sendKeys("Selenium_(software)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='https://en.wikipedia.org/wiki/Selenium_(software)']")).click();
		driver.findElement(By.linkText("Create account")).click();
		System.out.println("Internal link = "+driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='https://selenium.dev/']")).click();
		System.out.println("External link = "+driver.getCurrentUrl());
	}
	
	public void browserClose() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		VerifyLink vl = new VerifyLink();
		vl.launch();
		vl.verification();
		vl.browserClose();
	}
}
