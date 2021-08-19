package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printpathofimages {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> images=driver.findElements(By.xpath("//img"));
		int count =images.size();
		System.out.println(count);
		 for (WebElement eel:images)
		 {
			 String url=eel.getAttribute("src");
			 System.out.println(url);
		 }
}
}
