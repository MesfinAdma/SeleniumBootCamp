package expediaProject2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PersonalInfo {
	
	WebDriver driver;
	
	   @FindBy(xpath = "//*[@id=\"firstname[0]\"]")
	    WebElement firstName;
	    
	    @FindBy(xpath = "//*[@id=\"lastname[0]\"]")
	    WebElement lastName;
	    
	    @FindBy(xpath = "//*[@id=\"phone-number[0]\"]")
	    WebElement phoneNumber;
	    
	    @FindBy(xpath = "//*[@id=\"gender_male[0]\"]")
	    WebElement Male;
	    
	    //@FindBy(xpath = "//*[@id=\"date_of_birth_month0\"]")
	   // WebElement MonthSelect;
	    
	    
	    @FindBy(xpath = "//*[@id=\"date_of_birth_month0\"]")
	    WebElement MonthoBirth;
	    
	    @FindBy(xpath = "//*[@id=\"date_of_birth_day[0]\"]")
	    WebElement DateoBirth    ;
	    
	    @FindBy(xpath = "//*[@id=\"date_of_birth_year[0]\"]")
	    WebElement YearofBirth   ;
	    
	    
	    @FindBy(xpath = "//*[@id=\"insurance\"]/section/header/h2")
	    WebElement FlightProtection;
	    
	   // @FindBy(xpath = "//*[@id=\"insurance-form\"]/div")
	   // WebElement  FprotecYes;
	    
	    @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/label[1]/input")
	    WebElement cardHolde;
	    
	    @FindBy(xpath = "//*[@id=\"creditCardInput\"]")
	    WebElement creditcardNumber;
	    
	    
	    @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[1]/select")
	    WebElement expiryDate;
	    
	    @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[2]/select")
	    WebElement expiryYear;
	    
	    
	    @FindBy(xpath = "//*[@id=\"new_cc_security_code\"]")
	    WebElement secuirtyCode;
	   
	    
	    @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[1]/input")
	    WebElement billingAdd1;
	    
	       
	    @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[3]/input")
	    WebElement City;
	    
	    @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[4]/select")
	    WebElement State;
	    
	    @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[5]/input")
	    WebElement ZipCode;
	    
	    @FindBy(xpath = "//*[@id=\"email\"]/div[1]/fieldset/label/input")
	    WebElement Cemail;
	    
	    @FindBy(xpath = "//*[@id=\"account-creation\"]/fieldset/label[1]/input")
	    WebElement createPassword;
	    
	    @FindBy(xpath = "//*[@id=\"account-creation\"]/fieldset/label[2]/input")
	    WebElement confrmPassword;
	    
	    @FindBy(xpath = "//*[@id=\"complete-booking\"]")
	    WebElement completeBooking;
	    
	public PersonalInfo(WebDriver driver) {
		
		this.driver = driver;
		
		
	}
	
	 public void personalInfo(String fname, String lname, String phone, int month, String day, String year) {
	    	
	    	
	    	try {
				Thread.sleep(2000);
				firstName.sendKeys(fname);
				Thread.sleep(2000);
				lastName.sendKeys(lname);
				Thread.sleep(2000);
				phoneNumber.sendKeys(phone);
				Thread.sleep(2000);
				Male.click();
				Thread.sleep(2000);
				
				JavascriptExecutor temp= (JavascriptExecutor) driver;
				temp.executeScript("arguments[0].scrollIntoView(true)", MonthoBirth);
				Thread.sleep(2000);
				MonthoBirth.click();
				Thread.sleep(2000);
				
				Select mnt = new Select(MonthoBirth);
				
				mnt.selectByIndex(month);
				
				DateoBirth.click();
				Thread.sleep(2000);
				Select da= new Select(DateoBirth);
				da.selectByValue(day);
				 
				 YearofBirth.click();
				 Thread.sleep(2000);
				 Select yr = new Select(YearofBirth);
				yr.selectByValue(year);
				
				Thread.sleep(2000);
				FlightProtection.click();
	   
				
				
				Thread.sleep(2000);
				JavascriptExecutor temp1= (JavascriptExecutor) driver;
				temp1.executeScript("arguments[0].scrollIntoView(true)", cardHolde);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	    }
	    	
	    	public void cardIfo(String cardName, String cardNumber, String exmonth, String exyear, String scode) {
	    	
	    	try {
				Thread.sleep(2000);
					cardHolde.sendKeys(cardName);
					Thread.sleep(2000);
					creditcardNumber.sendKeys(cardNumber);
					Thread.sleep(2000);
					expiryDate.sendKeys(exmonth);
					Thread.sleep(2000);
					expiryYear.sendKeys(exyear);
					Thread.sleep(2000);
					secuirtyCode.sendKeys(scode);
					Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	    		
	    	}
	    	public void billingInfo (String add1, String city, String state, String zipcode, String email, String pass, String confpass) {
	    		
	    		try {
					Thread.sleep(2000);
					billingAdd1.sendKeys(add1);
					Thread.sleep(2000);
					City.sendKeys(city);
					Thread.sleep(2000);
					State.sendKeys(state);
					Thread.sleep(2000);
					ZipCode.sendKeys(zipcode);
					Thread.sleep(2000);
					
					JavascriptExecutor temp1= (JavascriptExecutor) driver;
					temp1.executeScript("arguments[0].scrollIntoView(true)", Cemail);
					Thread.sleep(2000);
					
					Cemail.sendKeys(email);
					Thread.sleep(2000);
					createPassword.sendKeys(pass);
					Thread.sleep(2000);
					
					confrmPassword.sendKeys(confpass);
					
					Thread.sleep(2000);
					completeBooking.click();
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	    		
	    	}
	

}
