package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator for Username field
	By uName = By.id("userName");
	
	//Locator for Password field
	By pswd = By.id("password");
	
	//Locator for login button
	By loginBtn = By.id("login");
	
	//Method to enter username
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys("user");
	}
	
	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys("pass");
	}
	
	
	//Method to click on Login Button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	

}
