
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
public class FirstDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "/Users/Shared/Previously Relocated Items/Security/INDRAVADAN/Selenium");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        //Actions action = new Actions(driver);
		
		//https://demoqa.com/automation-practice-form
		
		/*
		 * 
		 * Radio Button Interaction:

https://www.toolsqa.com/selenium-webdriver/selenium-radio-buttons/


Browser Command:

https://www.toolsqa.com/selenium-webdriver/selenium-webdriver-browser-commands/

Navigation commands:

https://www.toolsqa.com/selenium-webdriver/selenium-navigation-commands/


WebElement Command:

https://www.toolsqa.com/selenium-webdriver/webelement-commands/


Action class with Mouse and Keyboard operations:

https://www.toolsqa.com/selenium-webdriver/actions-class-in-selenium/
		 */
		
//		driver.get("https://demoqa.com/automation-practice-form");
//		driver.manage().window().maximize();
		
		
		
		
		//driver.close();
		
		
		

	}

}
