package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filedownloadpopup {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIKITA/Desktop/upload.html");
		WebElement ele=driver.findElement(By.xpath("//input[@id='upload file']"));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\NIKITA\\Desktop\\ecom product link.txt");
			
	}

}
