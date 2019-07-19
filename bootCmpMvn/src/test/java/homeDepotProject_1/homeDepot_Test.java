package homeDepotProject_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class homeDepot_Test {
	
	WebDriver driver;
	
  @Test
  public void RunhomeDepot() {

	 driver = OpenBrowser.openbrowser("chrome", "https://www.homedepot.com/");
		  homeDepotPOM obj = PageFactory.initElements(driver, homeDepotPOM.class);
		//obj.createAcc(inputEmail, inputpassword, ZipCode, inputphoneNumber);
		  
		  obj.createAcc("mesfinkassa@yahoo.com", "mka12345", "22206", "9116001333");
		  
		  
		  
	  }
	  
	  
	  
	  
  }

