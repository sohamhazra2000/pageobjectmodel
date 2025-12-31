package com.ibm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//www.practicetestautomatiom.com/practise
public class PracticePage {
	
	//create variables for every web element
	WebElement testLoginPages;
	WebElement TestExceptions;
	WebElement TestTable;
	WebDriver driver;
	
	//now i need to write the methods for interacting with these web elements
	public PracticePage(WebDriver d) {
		driver=d;
		driver.get("https://practicetestautomation.com/practice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		testLoginPages=driver.findElement(By.linkText("Test Login Page"));
		TestExceptions=driver.findElement(By.linkText("Test Exceptions"));
		TestTable=driver.findElement(By.linkText("Test Table"));
	}
	
	
	
	public void clickTestLoginPage() {
		testLoginPages.click();
		
		
	}
	
	public void clickTestExceptions() {
		
		TestExceptions.click();
		
	}
	
	public void testTable() {
		TestTable.click();
	}
	

}
