package org.testzoom.leafzoom.CarDropOff;

import org.testzoom.leafzoom.testcase.ZoomSpecificMethod;

public class CarDropPage extends ZoomSpecificMethod {
	
	public CarDropPage CarDroped() throws InterruptedException
	{
		driver.findElementByClassName("month").click();
		System.out.println("CarDroped Successfully");
		Thread.sleep(2000);
		return this;
	}
	
	public CarDropPage proceed() {
		driver.findElementByXPath("//button[@class='proceed']").click();
		System.out.println("NextPage");
		return this;
		
	}

}
