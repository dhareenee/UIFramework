package factories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.FrameworkConstants;
import driver.DriverManager;
import enums.WaitStrategy;

public class ExplicitWaitFactory {
	
	public static WebElement performExplicitWait(WaitStrategy waitstrategy,By by) {
		
		WebElement element=null;
		
		if(waitstrategy==WaitStrategy.CLICKABLE) {
			element=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(FrameworkConstants.EXPILICITTIMEOUT)).until(ExpectedConditions.elementToBeClickable(by)); 
		}
		else if(waitstrategy==WaitStrategy.VISIBLE) {
			element=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(FrameworkConstants.EXPILICITTIMEOUT)).until(ExpectedConditions.visibilityOfElementLocated(by)); 
		}
		else if(waitstrategy==WaitStrategy.PRESENCE) {
			element=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(FrameworkConstants.EXPILICITTIMEOUT)).until(ExpectedConditions.presenceOfElementLocated(by)); 
		}
		else if(waitstrategy==WaitStrategy.NONE) {
			element=DriverManager.getDriver().findElement(by);
		}
		return element;
	}

}
