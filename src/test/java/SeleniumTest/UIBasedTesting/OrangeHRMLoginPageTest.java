package SeleniumTest.UIBasedTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constants.FrameworkConstants;
import pages.HomePageElements;
import pages.LoginPageElement;

public class OrangeHRMLoginPageTest  extends BaseTest {
	
	
	@Test(dataProvider="getData")
	
	public void LoginPage(HashMap<String,String> data){
		
		new LoginPageElement().enterUserName(data.get("userName")).enterPassword(data.get("password")).clickLoginButton();
		
		Assert.assertEquals(new HomePageElements().GetTopBannerName(), "Dashboard");
		
		Assert.assertEquals(new HomePageElements().clickLogout().getLoginTitle(),"Login");
		
	
	}
	
	
	@DataProvider
	public Object[] getData() throws IOException {
		
		FileInputStream file=new FileInputStream(FrameworkConstants.DATAFILEPATH);
		
	XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("UserValue");
			
			int lastRow=sheet.getLastRowNum();
			int lastColumn=sheet.getRow(0).getLastCellNum();
			
			Object[] data= new Object[lastRow];
			
			Map<String,String> map=new HashMap<String,String>();
			
			for(int i=1;i<=lastRow;i++) {
				for(int j=0;j<=lastColumn;j++) {
					
					String key=sheet.getRow(0).getCell(j).getStringCellValue();
					String value=sheet.getRow(i).getCell(j).getStringCellValue();
					map.put(key, value);
					data[i-1]=map;
				}
			}
			
			return data;
		
	}

}

