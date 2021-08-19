package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Foreachlooplinktext {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ref=nav_logo");
	List<WebElement> links=driver.findElements(By.xpath("//a"));
	int count=links.size();
	System.out.println(count);
	
	
	for(WebElement we :links)
	{
		String text=we.getText();
		System.out.println(text);
	}
driver.close();
}
}
