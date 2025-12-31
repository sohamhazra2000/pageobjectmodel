package com.ibm.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ibm.pages.TestPageexceptions;

public class TestPageException {
	WebDriver driver;
	TestPageexceptions tpage;
	WebDriverWait wait;
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		if(br.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		tpage=new TestPageexceptions(driver);
	
		
		
	}
  @Test
  public void testfirstfield() {
	 String s= tpage.input1enter_text("hellow");
	 Assert.assertEquals(s,"Row 2 was added");
  }
  @Test(dependsOnMethods = {"testfirstfield"})
  public void testfield2(){
	
	  String s2=tpage.input2_enter_text_edit_Remove("hellow","heloo" );
	  Assert.assertEquals(s2,"Row 2 was removed");
	  
	  
  }
}
