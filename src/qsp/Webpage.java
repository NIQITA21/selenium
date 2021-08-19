package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIKITA/Desktop/Samplu.html");
		driver.findElement(By.id("d1")).clear();
		Thread.sleep(200);
		driver.findElement(By.id("d1")).sendKeys("nikita");
		Thread.sleep(200);
		driver.findElement(By.id("d2")).click();
}
}
