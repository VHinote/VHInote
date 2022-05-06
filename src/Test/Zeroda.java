package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Zerodalogin;
import Utility.Barametrization;
import Utility.Cabrowser;


public class Zeroda {
	WebDriver driver;
	
	@BeforeMethod
	public void callbrowser() {
		 driver = Cabrowser.OpenBrowser("https://kite.zerodha.com/");
	}
	
	@Test
	public void testing1() throws IOException {
		
		String Username = Barametrization.getTestData(0, 1, "Credensial");
		String password = Barametrization.getTestData(1, 1, "Credensial");
		String pinnum = Barametrization.getTestData(2, 1, "Credensial");
		
		Zerodalogin zerodalogin = new Zerodalogin(driver);
		zerodalogin.enterUserName(Username);
		zerodalogin.enterPassWord(password);
		zerodalogin.clickonSubmit();
	   
		zerodalogin.enterPin(pinnum, driver);
		zerodalogin.clickonLogin();
		
		
	}
//	@Test
//         public void testing2() {
//		
//		Zerodalogin zerodalogin = new Zerodalogin(driver);
//		zerodalogin.clickonSubmit();
//		
//	}
	
//	@Test
//	public void testing3() {
//		
//		Zerodalogin zerodalogin = new Zerodalogin(driver);
//		zerodalogin.clickonForgot();
//		
//	}
//	
//	@Test
//	public void testing4() {
//		
//		Zerodalogin zerodalogin = new Zerodalogin(driver);
//		zerodalogin.clickonSignin();
//		
		
//	}
	
	
	

	

}
