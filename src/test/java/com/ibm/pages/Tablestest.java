package com.ibm.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Tablestest {
WebDriver driver;
WebElement testTable;
WebElement table;
WebDriverWait wait;
Select s;


public Tablestest(WebDriver d) {
	driver = d;
	driver.get("https://practicetestautomation.com/practice-test-table/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	
}
 
public void Select() {
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollBy(0,650);");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sortBy"))).click();
	driver.findElement(By.cssSelector("#sortBy > option:nth-child(3)")).click();
	driver.findElement(By.xpath("//*[@id=\"xpath-table\"]/div[2]/fieldset[1]/label[2]/input")).click();
	
}

public void select2() {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sortBy")));
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollBy(0,650);");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sortBy"))).click();
	driver.findElement(By.cssSelector("#sortBy > option:nth-child(4)")).click();
	driver.findElement(By.xpath("/html/body/div/div/section/section/article/div/section/div[2]/fieldset[2]/label[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"xpath-table\"]/div[2]/fieldset[2]/label[3]/input")).click();

	
}

public void JavaIsceck() {
	table = driver.findElement(By.id("courses_table"));
	List<WebElement> row = table.findElements(By.tagName("tr"));
	
	for(int i =1;i<row.size();i++) {
		List<WebElement> col = row.get(i).findElements(By.tagName("td"));
		for(int j=0;j<col.size();j++) {
			String java = col.get(j).getText();
			boolean b;
			if(java.equalsIgnoreCase("java")) {
				b=true;
				
				Assert.assertEquals(b, true);
			}
		}
	}
	
}
public void BegineerIscheck() {
	select2();
	table = driver.findElement(By.id("courses_table"));
	List<WebElement> row2 = table.findElements(By.tagName("tr"));
	for(int i =1;i<row2.size();i++) {
		List<WebElement> col2 = row2.get(i).findElements(By.tagName("td"));
		for(int j=0;j<col2.size();j++) {
			String java = col2.get(j).getText();
			boolean b;
			if(java.equalsIgnoreCase("Beginner")) {
				b=true;
				
				Assert.assertEquals(b, true);
			}
		}
	}
}

	
}
