package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1july {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("//C:/Users/NIKITA/Desktop/textboxes.html");
		List<WebElement> textbox=driver.findElements(By.xpath("//input"));
		int count=textbox.size();
		System.out.println(count);
		
		for(WebElement ele:textbox)
		{
			ele.sendKeys("Nikita");
		}
		Thread.sleep(2000);
		
		for(int i=count-1;i>=0;i--)
		{
			WebElement ele1=textbox.get(i);
			ele1.clear();
		}
}
}