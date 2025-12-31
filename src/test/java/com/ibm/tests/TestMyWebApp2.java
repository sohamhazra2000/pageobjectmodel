package com.ibm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ibm.pages.MyWebPage;

public class TestMyWebApp2 {
	WebDriver driver;
	MyWebPage mwp;
	
	@BeforeMethod
	public void setup() {
		driver=new EdgeDriver();
		mwp=new MyWebPage(driver);
	//	driver.switchTo().alert().accept();
	}
	
  @Test
  public void f() {
	  mwp.typeUsername("usernametyping");
	  mwp.typePasword("passwordtyping");
	  mwp.ClickLoginBtn();
	  
  }
}
