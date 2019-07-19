package expediaProject2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class openBrowserExpedia {
static WebDriver driver;

public  static WebDriver openbrowser(String browser, String url){

    if(browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mesfin Kassa\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
    }else if (browser.equalsIgnoreCase("firefox")){
        System.setProperty("webdriver.gecko.driver","C:\\Java files\\geckodriver-v0.24.0-win64\\gecko.exe");
        driver = new FirefoxDriver();
    }else if(browser.equalsIgnoreCase("ie")){
        System.setProperty("webdriver.ie.driver","C:\\Java files\\IEDriverServer_x64_3.14.0.zip\\IeDriverServer.exe");
        driver = new InternetExplorerDriver();
    }else{
        System.out.println("Unkown Browser");
    }

    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    driver.get(url);

    return driver;

}
}
