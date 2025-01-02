package SeleniumTest.UIBasedTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.Driver;

public class BaseTest {
	
	protected BaseTest() {
		
	}
	
	@BeforeMethod
	protected void setup() throws Exception {
		
		Driver.initDrivr();
		}

	@AfterMethod
	protected void tearDown() {
		
		Driver.quitDriver();
		
	}
}
