package expediaProject2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expediabootcampPOM {
	WebDriver driver;

    @FindBy(xpath = "//*[@id=\"tab-flight-tab-hp\"]")
    WebElement flight;

    
    @FindBy(xpath = "//*[@id=\"flight-origin-hp-flight\"]")
    WebElement FlyingFrom;

    @FindBy(xpath = "//a[@id='aria-option-3']//span[2]")
    WebElement washington;

    @FindBy(xpath = "//*[@id=\"flight-destination-hp-flight\"]")
    WebElement DepartingTo;

    @FindBy(xpath = "//a[@id='aria-option-1']//span[2]")
    WebElement london;

    @FindBy(xpath = "//*[@id=\"flight-departing-hp-flight\"]")
    WebElement DepartingDateCL;
    
    @FindBy(xpath = "//input[@id='flight-departing-hp-flight']")
    WebElement departingdate;

    @FindBy(xpath = "//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[5]/td[4]/button")
    WebElement date1;

    @FindBy(xpath = "//input[@id='flight-returning-hp-flight']")
    WebElement arrivaldate;
    
    @FindBy(how=How.XPATH, using="//*[@id=\"flight-returning-wrapper-hp-flight\"]/div/div/div[3]/table/tbody/tr[5]/td[1]/button")
    WebElement date2;

    @FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
    WebElement Search; 

    @FindBy(xpath = "//*[@id=\"flight-module-2019-07-31t23:50:00-04:00-coach-iad-kef-fi-648-coach-kef-lhr-fi-454_2019-08-25t13:05:00+01:00-coach-lhr-kef-fi-451-coach-kef-iad-fi-649_\"]/div[1]/div[1]/div[2]/div/div[2]/button")
    WebElement Select1;

    @FindBy(xpath = "//*[@id=\"flight-module-2019-07-31t23:50:00-04:00-coach-iad-kef-fi-648-coach-kef-lhr-fi-454_2019-08-25t13:05:00+01:00-coach-lhr-kef-fi-451-coach-kef-iad-fi-649_\"]/div[1]/div[1]/div[2]/div/div[2]/button")
    WebElement Select2;

    @FindBy(how=How.XPATH, using="//a[@id='forcedChoiceNoThanks']")
    WebElement nothanks;
    
    @FindBy(xpath = "//*[@id=\"bookButton\"]")
    WebElement continueBooking;
    
 
    public expediabootcampPOM(WebDriver driver){
        this.driver=driver;
    }

    public void flightBooking(String name1, String name2) {
    	
    	
    	
			try {
				flight.click();
				Thread.sleep(2000);
				FlyingFrom.sendKeys(name1);
				Thread.sleep(2000);
				washington.click();
				Thread.sleep(2000);
				DepartingTo.sendKeys(name2);
				Thread.sleep(2000);
				london.click();
				Thread.sleep(2000);
				departingdate.click();
				Thread.sleep(2000);
				date1.click();
				Thread.sleep(2000);
				arrivaldate.click();
				Thread.sleep(2000);
				date2.click();
				Thread.sleep(2000);
				Search.click();
				Thread.sleep(2000);
				
				  WebDriverWait wait = new WebDriverWait(driver, (30));
				  wait.until(ExpectedConditions.elementToBeClickable(Select1));
				  
				 
				Select1.click();
				//FlyingDateCL.click();
				
				 WebDriver wd = this.driver;
				  String tab1 = wd.getWindowHandle();
				  ArrayList<String> availableWindows = new ArrayList<String>(wd.getWindowHandles());
				  if (!availableWindows.isEmpty()) {
				      wd.switchTo().window(tab1);
				  } else{
					  wd.switchTo().window(tab1);
				  }
				
				  WebDriverWait wait1 = new WebDriverWait(driver, (30));
				  wait1.until(ExpectedConditions.elementToBeClickable(Select2));
				  
				  
				Select2.click();
				//ReturningDateCL.click();
				//SearchButton.click();
				
				  
			
  	
				Thread.sleep(7000);

				nothanks.click();
				
				Thread.sleep(4000);
				
				WebDriver wd1 = this.driver;
				  String Tab2 = wd1.getWindowHandle();
				  ArrayList<String> availableWindows1 = new ArrayList<String>(wd.getWindowHandles());
				  if (!availableWindows1.isEmpty()) {
				      wd1.switchTo().window(availableWindows1.get(2));
				  }
				  else {
					  wd1.switchTo().window(Tab2);
				  }
				  
				
				JavascriptExecutor scroll2 =(JavascriptExecutor) driver;
				scroll2.executeScript("arguments[0].scrollIntoView(true)", continueBooking);
				
				Thread.sleep(2000);
				continueBooking.click();
				Thread.sleep(2000);
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
          
    }
    
    
   
    		
    		
    		
    }
    
           
    






