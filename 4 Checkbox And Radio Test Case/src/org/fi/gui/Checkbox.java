package org.fi.gui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/CDAC/STUDY%20MATERIAL/Software%20Development/Part2/After%20course/Selenium%20WebDriver%20-%20Test%20Case/4%20Checkbox%20And%20Radio%20Test%20Case/Checkbox.html");
		
//		driver.findElement(By.xpath("//input[@id='vehicle1']")).click();
//		driver.findElement(By.xpath("//input[@id='vehicle2']")).click();
//		driver.findElement(By.xpath("//input[@id='vehicle3']")).click();
		
		WebElement checkBoxElement = driver.findElement(By.xpath("//input[@id='vehicle1']"));
		boolean isSelected = checkBoxElement.isSelected();
		
		if(isSelected == false) {
			checkBoxElement.click();
		}
		
		WebElement checkBoxElement2 = driver.findElement(By.xpath("//input[@id='vehicle2']"));
		boolean isDisplayed = checkBoxElement.isDisplayed();
		
		if(isDisplayed == true) {
			checkBoxElement2.click();
		}
		
		WebElement checkBoxElement3 = driver.findElement(By.xpath("//input[@id='vehicle3']"));
		boolean isEnabled = checkBoxElement.isEnabled();
		
		if(isEnabled == true) {
			checkBoxElement3.click();
		}
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
