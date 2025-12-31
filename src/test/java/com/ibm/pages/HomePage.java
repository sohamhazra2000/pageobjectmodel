package com.ibm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HomePage {
	WebDriver driver;
	WebElement Nameform;
	WebElement Txt;
	
	public HomePage(WebDriver d) {
		driver=d;
		driver.get("https://practicetestautomation.com");
		Nameform=driver.findElement(By.id("form_first_name_7"));
		Txt=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[9]"));
		
		
	}
	
	public String nameFormInput(String s) {
		Nameform.clear();
		Nameform.sendKeys(s);
		String s1=Nameform.getAttribute("value");
		return s1;

		
	}
	
	public String validatePage()
	{
		String s1=Txt.getText();
		return s1;
		
	}

}
