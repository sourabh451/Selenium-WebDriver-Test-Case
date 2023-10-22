package org.fi.gui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		// declaration and instantiation of objects/variables  
		System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver(); 
		
		// Launch website  
	    driver.navigate().to("http://www.google.com/"); 
	    
	    // Click on the search text box and send value and submit
	    WebElement element = driver.findElement(By.id("APjFqb"));
	    element.sendKeys("selenium");
	    element.submit();
		
	    // The below code is related to jenkins
	   System.out.println("By Jenkins);
	       
	}
}
