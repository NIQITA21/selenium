package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIKITA/Desktop/textbox.html");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
	     WebElement ele2 = driver.findElement(By.xpath("//input[@value='tewari']"));
	     Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		ele2.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"v");
}
}
