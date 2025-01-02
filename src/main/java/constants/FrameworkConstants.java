package constants;

public class FrameworkConstants {
	
	public static final String CONFIGFILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\config\\properties";

	public static final String DATAFILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\dataProvider\\LoginUserData.xlsx";
	
	public static final int EXPILICITTIMEOUT=10;
	
	public static int getExpilicittimeout() {
		return EXPILICITTIMEOUT;
	}
	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

}
