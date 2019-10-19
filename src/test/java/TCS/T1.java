package TCS;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class T1 {

	WebDriver driver  = null;
	@Test
	public void m1(){
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https//google.com");
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
