package org.fi.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/CDAC/STUDY%20MATERIAL/Software%20Development/Part2/After%20course/Selenium%20WebDriver%20-%20Test%20Case/4%20Checkbox%20And%20Radio%20Test%20Case/Checkbox.html");
		
		WebElement radioElement = driver.findElement(By.xpath("//input[@id='html']"));
		boolean isSelected = radioElement.isSelected();
		
		if(isSelected == false) {
			radioElement.click();
		}
		
		WebElement radioElement2 = driver.findElement(By.xpath("//input[@id='css']"));
		boolean isDisplayed = radioElement2.isDisplayed();
		
		if(isDisplayed == true) {
			radioElement2.click();
		}
		
		WebElement radioElement3 = driver.findElement(By.xpath("//input[@id='javascript']"));
		boolean isEnabled = radioElement3.isEnabled();
		
		if(isEnabled == true) {
			radioElement3.click();
		}
		
		WebElement radioElement4 = driver.findElement(By.xpath("//input[@id='age1']"));
		boolean isSelected2 = radioElement4.isSelected();
		
		if(isSelected2 == false) {
			radioElement4.click();
		}
		
		WebElement radioElement5 = driver.findElement(By.xpath("//input[@id='age2']"));
		boolean isDisplayed2 = radioElement5.isDisplayed();
		
		if(isDisplayed2 == true) {
			radioElement5.click();
		}
		
		WebElement radioElement6 = driver.findElement(By.xpath("//input[@id='age3']"));
		boolean isEnabled2 = radioElement6.isEnabled();
		
		if(isEnabled2 == true) {
			radioElement6.click();
		}
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
