package homeDepotProject_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homeDepotPOM {

	
	WebDriver driver;
	
	
	@FindBy(id = "headerMyAccountTitle")
	WebElement MyAccountLink;
	
	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	WebElement SignIn;
	
	@FindBy(xpath = "//a[@class='bttn-outline dual-sign-in-pop-up js-headerMyAccountLink']")
	WebElement Register;
	
	@FindBy(xpath = "//div[@class='createAccountModalForm']//input[@id='email_id']")
	WebElement emaillink;
	
	@FindBy(id = "registrationPassword")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement Zip;
	
	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//span[contains(text(),'Create Account')]") 
	WebElement create; 
	public homeDepotPOM(WebDriver driver) {
		this.driver = driver;
	}
		
	public void createAcc(String inputEmail, String inputpassword, String ZipCode, String inputphoneNumber) {
		
		
		try {
			MyAccountLink.click();
			SignIn.click();
			Register.click();
			Thread.sleep(2000);
			emaillink.sendKeys(inputEmail);
			password.sendKeys(inputpassword);
			Zip.sendKeys(ZipCode);
			phoneNumber.sendKeys(inputphoneNumber);
			Thread.sleep(2000);
			create.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		
		}
		
	
	}
	
}
