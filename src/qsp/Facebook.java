package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("nickytricky96@gmail.com");
		Thread.sleep(200);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("9413705670");
		Thread.sleep(200);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

}
}
