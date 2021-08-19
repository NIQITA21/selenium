package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Pomclasslogin;
public class Testclass  {
	@Test
	public void hello()	
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Pomclasslogin pp=new Pomclasslogin(driver);
		pp.setusername("nickytricky96@gmail.com");
		pp.setpwd("9413705670");
		pp.clicklogin();
				
	}

}
