package org.fi1.gui;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NewGitRepo {
	
	WebDriver driver;

	
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	public void createRepository() throws InterruptedException {
		// Launch website
		driver.navigate().to("https://github.com/");
		
		// Sign in 
		driver.findElement(By.xpath("//a[@href ='/login']")).click();
		
		Thread.sleep(1000);
		
		// Enter username or email address
		driver.findElement(By.id("login_field")).sendKeys(prop.getProperty("email"));
		
		// Enter password
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		
		// Sign in button
		driver.findElement(By.name("commit")).click();
		Thread.sleep(1000);
		// + button
		driver.findElement(By.id("global-create-menu-button")).click();
		
		// New repository
		driver.findElement(By.xpath("//a[@href ='/new']")).click();
		
		Thread.sleep(2000);
		
		// Enter Repository name
		driver.findElement(By.id(":r2:")).sendKeys("TestCase");

		// Enter Description
		driver.findElement(By.id(":r3:")).sendKeys("Automated code for new repository");
		
		// Public repo
		driver.findElement(By.id(":r5:")).click();
		
		Thread.sleep(2000);
		
		// Create repository
		driver.findElement(By.xpath("//button[@class='types__StyledButton-sc-ws60qy-0 SoHAO']")).click();
		
		
	}
	
	public void deleteRepository() throws InterruptedException {
		Thread.sleep(5000);
		
		// settings
		driver.findElement(By.id("settings-tab")).click();
		
		Thread.sleep(1000);
		
		// Delete this repository
		driver.findElement(By.xpath("//button[@id='dialog-show-repo-delete-menu-dialog']")).click();
		
		// I want to delete this repository
		driver.findElement(By.xpath("//button[@id='repo-delete-proceed-button']")).click();
		
		// I have read and understand these effects
		driver.findElement(By.xpath("//button[@id='repo-delete-proceed-button']")).click();
		
		Thread.sleep(1000);
		
		// Delete this repository
		driver.findElement(By.xpath("//input[@id='verification_field']")).sendKeys("sourabh451/TestCase");
		driver.findElement(By.xpath("//button[@id='repo-delete-proceed-button']")).click();
		Thread.sleep(4000);
	}
	
	public void browserClose() {
		driver.quit();
	}
	
	private Properties prop;

	public static void main(String[] args) throws InterruptedException, IOException {
		NewGitRepo ngr = new NewGitRepo();
		Properties prop=new Properties();
		FileInputStream ip = new FileInputStream("D:\\CDAC\\STUDY MATERIAL\\Software Development\\Part2\\After course\\Selenium WebDriver - Test Case\\2.1 Git Test Case\\config.properties");
		prop.load(ip);
		ngr.prop = prop;
		ngr.launch();
		ngr.createRepository();
		ngr.deleteRepository();
		ngr.browserClose();
	}

}
