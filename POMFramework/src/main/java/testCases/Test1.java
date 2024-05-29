package testCases;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Dashboard;
import pages.Homepage;
import pages.Loginpage;

public class Test1 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GeneralManager\\OneDrive - Courthouse Hotel\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/books");
		
		//Creating object of home page
		Homepage home = new Homepage(driver);
		
		//Creating object of Login page
		Loginpage login = new Loginpage(driver);
		
		//Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);
		
		
		//Click on Login button
		home.clickLogin();
		
		//Enter username & password
		login.enterUsername("Indra");
		login.enterPassword("Shrimali@1994");
		
		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);
		
		
		//Capture the page heading and print on console
		System.out.println("The page heading is --- " +dashboard.getHeading());
		
		//Click on Logout button
		dashboard.clickLogout();

               //Close browser instance
               driver.quit();

}
}
