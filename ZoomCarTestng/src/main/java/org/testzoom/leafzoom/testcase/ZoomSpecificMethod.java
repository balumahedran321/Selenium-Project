package org.testzoom.leafzoom.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class ZoomSpecificMethod {
	public static ChromeDriver driver;  // Manditory for TestNG
	

	//public static void main(String[] args) throws InterruptedException {
	
	@BeforeTest
	public void StartApp() {
		
	System.setProperty("webdriver.chrome.driver","./Chrome/chromedriver.exe"); 	
	driver = new ChromeDriver(); // 
	driver.get("https://www.zoomcar.com/chennai/"); 
	driver.manage().window().maximize(); //window maximize
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	//String title= getDriver().getTitle();  Get Browser Title
	driver.getTitle();
	System.out.println(driver.getTitle());
	
	}
	/*@AfterMethod
	public void closeApp() {
		driver.close();
	}
	/*
	
	driver.findElementByClassName("search").click();
	driver.findElementByClassName("items").click();
	driver.findElementByClassName("proceed").click();
	
	//driver.findElementByLinkText("//button[text()='Next']").click();
	driver.findElementByClassName("month").click();
	driver.findElementByClassName("proceed").click();
	
	driver.findElementByClassName("month").click();
	driver.findElementByClassName("proceed").click();
	//driver.findElementByXPath("//button[@class='proceed']").click();

*/

}
