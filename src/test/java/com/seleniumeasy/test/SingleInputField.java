package com.seleniumeasy.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.seleniumeasy.tools.Browser;

public class SingleInputField {
	private WebDriver driver;

	@Test
	public void SingleInputField() {
		
			driver = new ChromeDriver();
	 		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
	 		driver.findElement(By.cssSelector("#user-message")).sendKeys("Alona");
	 		driver.findElement(By.cssSelector("#get-input > button")).click();

	 		WebElement labelYourMessage = driver.findElement(By.cssSelector("#display"));

	 		Assert.assertEquals(labelYourMessage.getText(), "Alona", "Incorrect message");

	 		

	 		try {

	 			Thread.sleep(3000);

	 		} catch (Exception e) {
	 		}
		}
	 		

	@AfterClass
 	public void tearDown() {
 		driver.close();
}
}