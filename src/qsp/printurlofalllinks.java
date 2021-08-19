package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printurlofalllinks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count =links.size();
		System.out.println(count);
		 for (WebElement eel:links)
		 {
			 String url=eel.getAttribute("href");
			 System.out.println(url);
		 }
}
}