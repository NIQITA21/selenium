package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8769035689");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("wego4387");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Login'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 11");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 11 (Black, 64 GB)']")).click();
		
		for(String childtab:driver.getWindowHandles())
		{
			driver.switchTo().window(childtab);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='Deliver here']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[class='_2KpZ6l _1seccl _3AWRsL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1uR9yB _3dESVI']")).click();
		
}
}