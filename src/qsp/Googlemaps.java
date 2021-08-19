package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemaps {
	public static void main(String[] args) throws InterruptedException {
	String key="webdriver.chrome.driver";
	String value="./Softwares/chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/maps/@12.9278612,77.4816581,15z");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nagarbhavi");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='video-title']")).click();


}
}