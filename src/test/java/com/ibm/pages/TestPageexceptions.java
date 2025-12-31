package com.ibm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPageexceptions {
	WebDriver driver;
	WebElement editb;
	WebElement input;
	WebElement savebutton;
	WebElement confirmation;
	WebElement Removebutton;
	WebElement inputfield2;
	WebElement addbutton;
	WebDriverWait wait;
	
	 public TestPageexceptions(WebDriver d) {
		 driver=d;
		 driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		 driver.manage().window().maximize();
		 editb=driver.findElement(By.id("edit_btn"));
		 input=driver.findElement(By.xpath("//*[@id=\"row1\"]/input"));
		 addbutton=driver.findElement(By.id("add_btn"));
		 wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		
		 
		 
		 
		 
	 }
	 
	 
	 public  void edit() {
		 editb.click();
		 
	 }
	 public void add() {
		 addbutton.click();
		 
	 }
	 
	 public String input1enter_text(String s) {
		 edit();
		 input.clear();
		 input.sendKeys(s);
		 savebutton=driver.findElement(By.id("save_btn"));
		 savebutton.click();
		 add();
		 confirmation=driver.findElement(By.id("confirmation"));
         String s2=confirmation.getText();
		 
		 return s2;
	 }
	 
	 public String input2_enter_text_edit_Remove(String s,String s2) {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"row2\"]/input")));
		 inputfield2=driver.findElement(By.xpath("//*[@id=\"row2\"]/input"));
		 inputfield2.sendKeys(s);
		 driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[3]/div/button[1]")).click(); 
		 Removebutton=driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[3]/div/button[3]")); 
		 Removebutton.click();
		 String result=confirmation.getText();
		 return result;
	 }
	 
	 
	 
	 
	 
	

}
