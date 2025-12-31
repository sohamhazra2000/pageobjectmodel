package com.ibm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWebPage {
WebDriver driver;
WebElement user;
WebElement pw;
WebElement LoginBtn;

public MyWebPage(WebDriver d) {
	driver=d;
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/SohamHazra/eclipse-workspace/demopageobjectmodel/MyWebApp/index.html");
	driver.switchTo().alert().accept();
	user=driver.findElement(By.name("un"));
	pw= driver.findElement(By.id("sm"));
	LoginBtn=driver.findElement(By.name("login"));
}

public void typeUsername(String t) {

user.sendKeys(t);
}
public void typePasword(String s) {
	pw.sendKeys(s);
}
public void ClickLoginBtn() {
	LoginBtn.click();
}
}
