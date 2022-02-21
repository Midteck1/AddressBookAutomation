package TestCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	@Test
	public void getData() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://manojpadhan.azurewebsites.net/addressbook/");
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("Test Completed.....");

	}

}
