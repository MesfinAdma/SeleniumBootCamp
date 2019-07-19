package expediaProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import expediaProject2.openBrowserExpedia;
public class TestExpedia {

	
	private static final String OpenBrowser = null;
	WebDriver driver;
	
	  @Test
	  
	  public void RunTestExpedia() {
		  driver = expediaProject2.openBrowserExpedia.openbrowser("chrome", "https://www.expedia.com/");
			  
		  	expediabootcampPOM obj = PageFactory.initElements(driver, expediabootcampPOM.class);
			PersonalInfo obj2 = PageFactory.initElements(driver, PersonalInfo.class);  
			obj.flightBooking("  washington dc",  "   london");
			
			obj2.personalInfo("mesfin","kassa", "9116001333", 1, "19", "2000");
			 
			 obj2.cardIfo("Mesfin Kassa", "2347896543456", "dec","2021", "245");
			 
			 
			 obj2.billingInfo("543 Rockville ave",  "Alexandria", "VA", "22212", "mesfin@gmail.com", "mesfin123", "mesfin123");
			  
}
	  
	  @AfterTest
	  public void closeBrowser() {
		  
		  driver.quit();
	  }
	  
}