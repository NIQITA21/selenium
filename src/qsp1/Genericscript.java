package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genericscript {
		public WebDriver driver;
		 @BeforeMethod
		public void openappln()
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://facebook.com");
		}
		@AfterMethod
		public void Closeappln() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close();
		}

}
