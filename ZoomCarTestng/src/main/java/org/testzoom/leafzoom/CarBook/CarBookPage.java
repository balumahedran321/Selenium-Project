package org.testzoom.leafzoom.CarBook;

import org.testzoom.leafzoom.CarDropOff.CarDropPage;
import org.testzoom.leafzoom.testcase.ZoomSpecificMethod;

public class CarBookPage extends ZoomSpecificMethod {

	public CarBookPage CarBook() throws InterruptedException {
		
		driver.findElementByClassName("month").click();
		System.out.println("CarBookPage");
		Thread.sleep(2000);
		return this;
	}
	
	public CarDropPage Done() {
		
		driver.findElementByClassName("proceed").click();
		System.out.println("NextPage");
		return new CarDropPage();
		
	}
}
