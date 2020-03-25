package org.testzoom.leafzoom.testPage;

import org.testzoom.leafzoom.startPage.StartPage;
import org.testzoom.leafzoom.testcase.ZoomSpecificMethod;

public class SearchPage extends ZoomSpecificMethod {
	
	public StartPage Search() {
		
		driver.findElementByClassName("search").click();
		System.out.println("Searched Successully");
		return new StartPage();
	
	}
	

}
