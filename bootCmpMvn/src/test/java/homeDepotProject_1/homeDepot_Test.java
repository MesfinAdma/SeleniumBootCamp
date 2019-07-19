package homeDepotProject_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class homeDepot_Test {
	
	WebDriver driver;
	
	 @Parameters({"Browser", "URL", "email", "password", "ZipCode", "Phonenumber"})
	@Test
	
  public void RunhomeDepot(String br, String url, String em, String pw, String zip, String phone) {

	 driver = OpenBrowser.openbrowser(br, url);
	 
		  homeDepotPOM obj = PageFactory.initElements(driver, homeDepotPOM.class);
		//obj.createAcc(inputEmail, inputpassword, ZipCode, inputphoneNumber);
		  
		  obj.createAcc(em, pw, zip, phone);
		  
		  
		  
	  }
	  
	  
	  
	  
  }

