package org.fi.gui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		// list of Elements by tagname input
		List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
		if(allInputElements.size() != 0) {
			System.out.println(allInputElements.size()+" Elements found by tagname input");
			// Display the Attribute value
			for(WebElement inputElement : allInputElements) {
				System.out.println(inputElement.getAttribute("placeholder"));
			}
		}	
		driver.quit();
	}
}
