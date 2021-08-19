package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loginscript {
public WebDriver driver;
 @BeforeMethod
public void openappln()
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@AfterMethod
public void Closeappln() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
}
public class Login extends Loginscript
{
	@Test
	public void ValidLogin() throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nickytricky96@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9413705670");
			driver.findElement(By.xpath("//button[@value='1']")).click();
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println(title);
		}
	}
	
}

