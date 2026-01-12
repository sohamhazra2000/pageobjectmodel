package com.ibm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestLogin {
	WebDriver driver;
	@FindBy(id="username")
	WebElement LoginFiled;
	@FindBy(id="password")
	WebElement Passwordfield;
	@FindBy(id="submit")
	WebElement Formfiledsubmit;
	WebElement erroruser;
	public TestLogin(WebDriver d){
		driver=d;
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		LoginFiled=driver.findElement(By.id("username"));
		Passwordfield=driver.findElement(By.id("password"));
		Formfiledsubmit=driver.findElement(By.id("submit"));
		
		
		
	}
	
	 public String enterLofPas(String User,String Pasword) {
		 LoginFiled.sendKeys(User);
		 Passwordfield.sendKeys(Pasword);
		 Formfiledsubmit.click();
		 String s=driver.getTitle();
		 return s;
	}

	 public String enterLofPas2(String User,String Pasword) {
		 LoginFiled.sendKeys(User);
		 Passwordfield.sendKeys(Pasword);
		 Formfiledsubmit.click();
		 String s=driver.getTitle();
		 return s;
	}
}
