package com.ibm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ibm.pages.TestLogin;

public class TestLoginMa {
	WebDriver driver;
	TestLogin tl;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		if(br.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		tl=new TestLogin(driver);
		
	}
	
  @Test
  public void TestLoginWorks() {
	String s=  tl.enterLofPas("student","Password123");
	Assert.assertEquals(s,"Logged In Successfully | Practice Test Automation");
  }
  @Test
  public void TestLoginWorks2() {
		String s=  tl.enterLofPas2("studentqqq","Password123");
		
		Assert.assertEquals(s,"Test Login | Practice Test Automation");
	  }
}
