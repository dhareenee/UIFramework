package SeleniumTest.UIBasedTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import driver.DriverManager;

public final class  HomePageTests extends BaseTest {
	
	private HomePageTests() {
	}
	
	@Test
	public void test2() {


		DriverManager.getDriver().findElement(By.name("q")).sendKeys("internet.herokuapp",Keys.ENTER);
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//*[@id=\"ixcYae\"]/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		DriverManager.getDriver().findElement(By.linkText("Forgot Password")).click();
		DriverManager.getDriver().findElement(By.id("email")).sendKeys("abc@gmail.com");
		DriverManager.getDriver().findElement(By.id("form_submit")).click();

	}

}
