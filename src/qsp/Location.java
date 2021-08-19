package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele= driver.findElement(By.xpath("//button[@value='1']"));
		Point loc= ele.getLocation();
		System.out.println(loc);
		 double x=loc.getX();
		 System.out.println(x);
		double y=loc.getY();
		System.out.println(y);
	}
}
