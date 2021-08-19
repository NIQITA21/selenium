package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   public class Logingmail {
   public static void main(String[] args) throws InterruptedException 
   {
			String key="webdriver.chrome.driver";
			String value="./Softwares/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com/");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("niqitatewari@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@jsname=V67aGc]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[type='password']")).sendKeys("wego4387");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@jsname=V67aGc]")).click();
			Thread.sleep(2000);
			

	}
	}

