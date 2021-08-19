package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIKITA/Desktop/textbox.html");
		WebElement ele= driver.findElement(By.xpath("//input[@type='text']"));
		boolean b=ele.isSelected();
		if(b)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox not selected");
		}
	}
}
