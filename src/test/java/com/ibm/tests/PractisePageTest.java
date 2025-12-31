package com.ibm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ibm.pages.PracticePage;

public class PractisePageTest {
	
	WebDriver driver;
	PracticePage Practice_page_object;
	
	
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		
		if(br.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		Practice_page_object=new PracticePage (driver);
		
	}
	
	
	
	
	
  @Test
  public void testNavigation() {
	  Practice_page_object.clickTestLoginPage();
	  
	  driver.navigate().back(); 
	  Practice_page_object.clickTestExceptions();
	  driver.navigate().back();
	  Practice_page_object.testTable();
  
  
  
  
  }
  
}
