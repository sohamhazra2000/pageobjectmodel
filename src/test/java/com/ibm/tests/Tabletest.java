package com.ibm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ibm.pages.Tablestest;

public class Tabletest {

	WebDriver driver;
	Tablestest tb;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		if(br.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		tb = new Tablestest(driver);
	}		
	
	
  @Test
  public void tabletest1() {
	  tb.Select();
	   tb.JavaIsceck();
	  
  }
  @Test
  public void tabletest2() {
	   tb.BegineerIscheck();
	  
  }
}


