package com.ibm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ibm.pages.HomePage;

public class TestHomePage {
	WebDriver driver;
	HomePage hp;
	
	
	
	@BeforeClass 
	@Parameters("browser")
	public void setup(String br) {
		if(br.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		hp=new HomePage(driver);
	}
	
	
	
	
  @Test
  public void testNameField() {
	 String test= hp.nameFormInput("Hellow");
	 Assert.assertEquals(test,"Hellow");
	  
  }
  
  public void TestPage() {
	  String test2=hp.validatePage();
	  Assert.assertEquals(test2,"A Resourceful Website");
  }
}
