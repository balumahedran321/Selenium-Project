package org.testzoom.leafzoom.startPage;

import org.testzoom.leafzoom.CarBook.CarBookPage;
import org.testzoom.leafzoom.testcase.ZoomSpecificMethod;

public class StartPage extends ZoomSpecificMethod {
	
	
	public StartPage ClickThuraipakkam() throws InterruptedException {
		
		driver.findElementByClassName("items").click();
		System.out.println("StartPage");
		Thread.sleep(3000);
		return this;
		
	}
	
	public CarBookPage NextPage() {

		driver.findElementByClassName("proceed").click();
		System.out.println("NextPage");
		return new CarBookPage();
	}

}
