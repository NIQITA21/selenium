package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='Mon, Jul 12']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='22']")).click();
	    
	}
	
}
