package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GeneralManager\\OneDrive - Courthouse Hotel\\Documents\\chromedriver.exe");
		//Instantiating chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement loginbtn = 	driver.findElement(By.id("login"));
		//Opening web application
		driver.get("https://demoqa.com/books");
	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginbtn); loginbtn.click();
		//Locating the Login button and clicking on it

		
		//Locating the username & password and passing the credentials
		driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		
		//Click on the login button
		driver.findElement(By.id("login")).click();
		
		//Print the web page heading
		System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"app\"]//div[@class=\"main-header\"]")).getText());

		//Click on Logout button
		driver.findElement(By.id("submit")).click();
		
		//Close driver instance
		driver.quit();
	}


}
