package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closeonlyparentbrowser {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String parent_id=driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		for(String wh:allwh)
		{
			if(wh.equals(parent_id))
			{
				driver.close();
			}
		}
		
	}
}
