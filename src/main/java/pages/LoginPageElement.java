package pages;

import org.openqa.selenium.By;

import enums.WaitStrategy;

public class LoginPageElement extends BasePage{

	private final By textboxUserName=By.name("username");
	private final By textboxPassword=By.name("password");
	private final By btnLogin=By.xpath("//button[@type=\"submit\"]");
	private final By loginTitle=By.xpath("//h5[text()='Login']");


	public LoginPageElement enterUserName(String userName) {		
		sendKeys(textboxUserName,userName,WaitStrategy.VISIBLE);		
		return this;
	}

	public LoginPageElement enterPassword(String password) {
		sendKeys(textboxPassword,password,WaitStrategy.VISIBLE);
		return this;
	}

	public HomePageElements clickLoginButton() {
		click(btnLogin,WaitStrategy.CLICKABLE);		
		return new HomePageElements();
	}

	public String getTitle() {
		
		return getPageTitle();
	}

	public String getLoginTitle() {

		return getText(loginTitle,WaitStrategy.VISIBLE);
	}

}
