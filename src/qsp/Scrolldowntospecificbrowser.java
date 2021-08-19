package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldowntospecificbrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement ele=driver.findElement(By.xpath("//a[.='Facebook']"));
		Point p=ele.getLocation();
		System.out.println(p);
		int x=p.getX();
		int y=p.getY();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		ele.click();
	}

}
