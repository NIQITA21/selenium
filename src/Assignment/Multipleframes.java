package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleframes {
		public static void main(String[] args) throws InterruptedException {
			String key="webdriver.chrome.driver";
			String value="./Softwares/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/NIKITA/Desktop/firstframe.html");
			Thread.sleep(2000);
			driver.findElement(By.id("t1")).sendKeys("nikita");
			driver.switchTo().frame(0);
			driver.findElement(By.id("t2")).sendKeys("tewari");
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//a")).click();
	}

}
