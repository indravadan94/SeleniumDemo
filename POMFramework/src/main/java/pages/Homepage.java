package pages;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	WebDriver driver;
	
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Homepage(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	//Locator for Login Button
	By loginBtn = By.id("login");
	
	
	//Method to click Login Button
	public void clickLogin() {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(loginBtn)); 
		 //loginBtn.click();
		
		driver.findElement(loginBtn).click();
	}
}
