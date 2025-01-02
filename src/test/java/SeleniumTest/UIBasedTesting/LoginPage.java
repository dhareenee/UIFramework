package SeleniumTest.UIBasedTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import driver.DriverManager;




public final class LoginPage extends BaseTest {
	
	private LoginPage() {
		
	}

	@Test
	public void test1() {


		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Dhareene",Keys.ENTER);

	}



}
