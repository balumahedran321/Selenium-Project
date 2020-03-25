package org.testzoom.leafzoom.TC001;

import java.io.File;

import org.apache.poi.hpsf.Section;
import org.testng.annotations.Test;
import org.testzoom.leafzoom.startPage.StartPage;
import org.testzoom.leafzoom.testPage.SearchPage;
import org.testzoom.leafzoom.testcase.ZoomSpecificMethod;

public class TC001 extends ZoomSpecificMethod{

	
	@Test
	public void TestCase() throws InterruptedException {
		
		
		SearchPage ScPage = new SearchPage();
		ScPage.Search().ClickThuraipakkam().NextPage().CarBook().Done().CarDroped().proceed();
		System.out.println("TestCase Runned Successfully");
		
		//StartPage stpg = new StartPage();
		/*LoginPage page = new LoginPage();
		page.enterUsername("");
		page.enterPassword("");
		page.clickLogin();
		
		stpg.Search();
		stpg.ClickThuraipakkam();
		stpg.NextPage();
		stpg.CarBook();
		stpg.Done();
		stpg.CarDroped();		*/
		
		 
	}
}
