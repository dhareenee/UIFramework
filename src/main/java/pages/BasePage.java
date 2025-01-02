package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driver.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;

public class BasePage {

	protected void click(By by,WaitStrategy waitStartegy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStartegy, by);
		element.click();
	}

	protected String getText(By by,WaitStrategy waitStartegy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStartegy, by);
		return element.getText();
	}

	protected String getPageTitle() {

		return DriverManager.getDriver().getTitle();
	}

	protected void sendKeys(By by,String value,WaitStrategy waitStartegy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStartegy, by);
		element.sendKeys(value);
	}

}
