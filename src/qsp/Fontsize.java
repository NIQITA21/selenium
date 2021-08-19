package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fontsize {
		public static void main(String[] args) throws InterruptedException {
			String key="webdriver.chrome.driver";
			String value="./Softwares/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement ele= driver.findElement(By.xpath("//input[@name='email']"));
		    String font=ele.getCssValue("colour");
		    System.out.println(font);
		    driver.quit();
		}	

}
