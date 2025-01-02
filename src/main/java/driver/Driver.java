package driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import enums.ConfigProperties;
import utils.ReadPropertyFile;

public final class Driver {
	
	private  Driver() {
		
	}

	public static void initDrivr() throws Exception {
		if(Objects.isNull(DriverManager.getDriver())) {		
		DriverManager.setDriver(new ChromeDriver());
		DriverManager.getDriver().navigate().to(ReadPropertyFile.getValue(ConfigProperties.URL));
		DriverManager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		}
 
		
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}


}
