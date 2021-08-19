package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIKITA/Desktop/textbox.html");
		WebElement ele= driver.findElement(By.xpath("//input[@type='text']"));
		boolean b=ele.isDisplayed();
		if(b)
		{
			System.out.println("textbox is dislayed");
		}
		else
		{
			System.out.println("textbox not displayed");
		}
		
}
}
