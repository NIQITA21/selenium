package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException 
	   {
				String key="webdriver.chrome.driver";
				String value="./Softwares/chromedriver.exe";
				System.setProperty(key, value);
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.youtube.com/");
				driver.findElement(By.xpath("//input[@id='search']")).sendKeys("pani pani");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@id='video-title']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();
				Thread.sleep(2000);
				
}
}
