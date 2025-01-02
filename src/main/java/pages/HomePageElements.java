package pages;

import org.openqa.selenium.By;

import enums.WaitStrategy;

public class HomePageElements extends BasePage {

	private final By btnLogout=By.xpath("//a[@class=\"oxd-userdropdown-link\"][text()=\"Logout\"]");
	private final By topBannerName=By.xpath("//h6[text()='Dashboard']");
	private final By profileDropDown=By.xpath("//img[@class='oxd-userdropdown-img']");


	public String GetTopBannerName() {
		return getText(topBannerName,WaitStrategy.VISIBLE);


	}

	public LoginPageElement clickLogout() {
		click(profileDropDown,WaitStrategy.CLICKABLE);
		click(btnLogout,WaitStrategy.CLICKABLE);
		return new LoginPageElement();
	}




}
